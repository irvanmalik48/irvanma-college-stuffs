package main

import "fmt"

func main()) {
	var op string
	var a, b int
	c := 0

	fmt.Print("First number: ")
	fmt.Scanln(&a)
	fmt.Print("Second number: ")
	fmt.Scanln(&b)
	fmt.Print("Operator (+, -, /, *, %): ")
	fmt.Scanln(&op)

	switch op {
	case "+":
		c = a + b
	case "-":
		c = a - b
	case "/":
		c = a / b
	case "*":
		c = a * b
	case "%":
		c = a % b
	default:
		fmt.Print("\nInvalid operator")
	}

	fmt.Printf("%d %s %d = %d", a, op, b, c)
}
