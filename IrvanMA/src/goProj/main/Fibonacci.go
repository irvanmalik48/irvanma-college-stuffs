package main

import "fmt"

func fibonacci(a int) int {
	if a == 0 || a == 1 {
		return a
	}
	return fibonacci(a-2) + fibonacci(a-1)
}

func main() {
	var n int
	fmt.Print("Enter the number: ")
	fmt.Scanln(&n)

	res := fibonacci(n)
	fmt.Printf("Fibonacci series of %d is %d", n, res)
}
