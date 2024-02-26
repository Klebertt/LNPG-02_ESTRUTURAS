main :: IO ()
main = do
  input <- getLine
  processInput input 0 100 (-1)

processInput :: String -> Double -> Double -> Double -> IO ()
processInput "*" totalIpca minIpca maxIpca = do
  let contagemMes = read inputCount :: Int
      mediaIpca = totalIpca / fromIntegral contagemMes
  printf "(%.2f) " minIpca
  printf "(%.2f) " maxIpca
  printf "(%.2f)\n" mediaIpca

processInput input totalIpca minIpca maxIpca = do
  let parts = words input
      yearMonth = head parts
      ipca = read (last parts) :: Double
      (year, month) = readYearMonth yearMonth

  if ipca < minIpca
    then processInput rest (totalIpca + ipca) ipca maxIpca
    else if ipca > maxIpca
      then processInput rest (totalIpca + ipca) minIpca ipca
      else processInput rest (totalIpca + ipca) minIpca maxIpca
  where
    readYearMonth :: String -> (Int, Int)
    readYearMonth yearMonth = read yearMonth
    inputCount = input
    (input:rest) = tail (words input)
