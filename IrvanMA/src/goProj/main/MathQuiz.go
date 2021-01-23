package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	rand.Seed(time.Now().UnixNano())
	var a, b, c, n int
	cor := 0

	fmt.Print("How many questions you want to try? ")
	fmt.Scanln(&n)

	for i := 0; i < n; i++ {
		a = rand.Intn(100)
		b = rand.Intn(100)
		fmt.Printf("%d + %d = ", a, b)
		fmt.Scanln(&c)
		if c == (a + b) {
			cor++
		}
	}

	fmt.Printf("\nCorrect: %d", cor)
}
