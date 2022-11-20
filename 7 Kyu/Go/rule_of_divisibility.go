// https://www.codewars.com/kata/55e6f5e58f7817808e00002e
func Seven(n int64) []int {
  count := 0
  for n > 99 {
    n = (n / 10) - 2 * (n % 10)
    count += 1
  }
  return []int{int(n), count}
}