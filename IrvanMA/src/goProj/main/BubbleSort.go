package main

import "fmt"

func bubbleSort(a []int) {
	len := len(a)
	for i := 0; i < len-1; i++ {
		for j := 0; j < len-i-1; j++ {
			if a[j] > a[j+1] {
				a[j], a[j+1] = a[j+1], a[j]
			}
		}
	}
}

func main() {
	var count int
	fmt.Print("Array length: ")
	fmt.Scanln(&count)

	a := make([]int, count, 2*count)
	fmt.Print("Enter array values divided by whitespace: ")
	for i := 0; i < count; i++ {
		fmt.Scan(&a[i])
	}
	bubbleSort(a)

	fmt.Print("Sorted array: ")
	for i := 0; i < count; i++ {
		fmt.Printf("%d ", a[i])
	}
}
