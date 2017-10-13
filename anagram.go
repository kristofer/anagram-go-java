package main

import (
	"fmt"
)

const (
	string1 = "aab"
	string2 = "aba"
	string3 = "cab"
	string4 = "kjfdhskdhfksdhk"
)

func anagram(x, y string) bool {
	if x == y {
		return true
	}

	if len(x) != len(y) {
		return false
	}

	dictx := make(map[string]int)
	dicty := make(map[string]int)

	for i := 0; i < len(x); i++ {
		dictx[string(x[i])] += 1
	}

	for i := 0; i < len(y); i++ {
		dicty[string(y[i])] += 1
	}

	if len(dictx) != len(dicty) {
		return false
	}
	for k, _ := range dictx {
		if dictx[k] != dicty[k] {
			return false
		}
	}

	return true
}

func main() {
	fmt.Printf("%v\n", anagram(string1, string1))
	fmt.Printf("%v\n", anagram(string1, string2))
	fmt.Printf("%v\n", anagram(string1, string3))
	fmt.Printf("%v\n", anagram(string1, string4))
}
