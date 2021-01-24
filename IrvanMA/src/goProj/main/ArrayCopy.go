package main

import "fmt"

func main() {
	var n int

	fmt.Print("Array length: ")
	fmt.Scanln(&n)

	// In Go, use slices rather than arrays.
	a := make([]int, n, 2*n)
	b := make([]int, n, 2*n)

	fmt.Print("Enter array values divided by whitespace: ")
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
		b[i] = a[i]
	}

	fmt.Print("Array A: ")
	for i := 0; i < n; i++ {
		fmt.Printf("%d ", a[i])
	}

	fmt.Print("\nArray B: ")
	for i := 0; i < n; i++ {
		fmt.Printf("%d ", b[i])
	}
}
