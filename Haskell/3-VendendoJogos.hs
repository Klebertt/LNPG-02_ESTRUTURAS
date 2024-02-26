main :: IO ()
main = do
  gamesSold <- readLn

  let jogoPreco = 19.90
      vendaTotal = fromIntegral jogosVendidos * jogoPreco
      bonus = fromIntegral (jogosVendidos `div` 15) * 0.08 * vendaTotal
      salarioTotal = 0.5 * vendaTotal + bonus

  putStrLn $ formatDouble vendaTotal
  putStrLn $ formatDouble bonus
  putStrLn $ formatDouble salarioTotal

formatDouble :: Double -> String
formatDouble x = printf "%.2f" x
