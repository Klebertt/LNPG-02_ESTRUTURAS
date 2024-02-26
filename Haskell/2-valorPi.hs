calculatePi :: Int -> Double
calculatePi n = (fromIntegral n) ** (1/3) * (32 * sum [1 / (x * x) | x <- [1..n]])

main :: IO ()
main = do
  n <- readLn
  print $ roundTo5 $ calculatePi n

roundTo5 :: Double -> Double
roundTo5 x = fromIntegral (round $ x * 1e5) / 1e5
