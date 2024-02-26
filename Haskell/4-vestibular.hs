import Text.Printf

calculateResults :: [Int] -> [String] -> IO ()
calculateResults respostas nomes = do
  let pontuacao = map (calcularPontuacao respostas) nomes
      pontuacaoMax = maximum pontuacao
      pontuacaoMin = minimum pontuacao
      halfCorrectCount = length $ filter (\s -> s > 5) pontuacao
      pontuacaoTotal = fromIntegral $ sum pontuacao
      n = length nomes

  let nomesSorteados = sort nomes

  mapM_ (\(name, pontuacao) -> putStrLn $ name ++ " " ++ show (round pontuacaoTotal)) (zip nomesSorteados pontuacao)

  putStrLn $ show pontuacaoMax
  putStrLn $ show pontuacaoMin
  printf "%.1f%%\n" ((fromIntegral halfCorrectCount / fromIntegral n) * 100)

calcularPontuacao :: [Int] -> String -> Int
calcularPontuacao respostas participante = length $ filter (\(a, b) -> a == b) $ zip respostas (map (\x -> read [x] :: Int) (drop 1))
