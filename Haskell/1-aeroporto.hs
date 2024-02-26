checkPassenger :: Int -> IO ()
checkPassenger 0 = return ()
checkPassenger n = do
  rg <- getLine
  rgBirth <- getLine
  ticket <- getLine
  ticketBirth <- getLine
  seat <- getLine

  if rg == "Nao possui"
    then putStrLn "a saida e nessa direcao"
    else if ticket == "Nao possui"
      then putStrLn "a recepcao e nessa direcao"
      else if rgBirth /= ticketBirth
        then putStrLn "190"
        else putStrLn $ "o seu assento e " ++ seat ++ " tenha um otimo dia"

  checkPassenger (n - 1)

main :: IO ()
main = do
  n <- readLn
  checkPassenger n
