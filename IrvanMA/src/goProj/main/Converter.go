package main

import "fmt"

func toBinary(x int) string {
	var a int
	bin := ""
	c := [2]string{"0", "1"}
	for x > 0 {
		a = x % 2
		bin = c[a] + bin
		x = x / 2
	}
	return bin
}

func toOctal(x int) string {
	var a int
	oct := ""
	c := [8]string{"0", "1", "2", "3", "4", "5", "6", "7"}
	for x > 0 {
		a = x % 8
		oct = c[a] + oct
		x = x / 8
	}
	return oct
}

func toHex(x int) string {
	var a int
	hex := ""
	c := [16]string{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"}
	for x > 0 {
		a = x % 16
		hex = c[a] + hex
		x = x / 16
	}
	return hex
}

func main() {
	var x int
	fmt.Print("Enter decimal number: ")
	fmt.Scanln(&x)
	fmt.Printf("Binary: %s\nOctal: %s\nHexadecimal: %s\n", toBinary(x), toOctal(x), toHex(x))
}
