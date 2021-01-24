package main

import "fmt"

func factorial(a int) int {
	if a == 0 {
		return 1
	}
	return a * factorial(a-1)
}

func main() {
	var n int
	fmt.Print("Enter the number: ")
	fmt.Scanln(&n)

	res := factorial(n)
	fmt.Printf("Factorial of %d is %d", n, res)
}
