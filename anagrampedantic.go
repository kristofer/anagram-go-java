package main

import (
	"sync"
)

// just to be pointy-headed, I wrote this where we do the two loops in
// go routines, because you can.
// see readme for timings.
func anagrampedantic(x, y string) bool {
	if x == y {
		return true
	}

	if len(x) != len(y) {
		return false
	}

	dictx := make(map[string]int)
	dicty := make(map[string]int)
	var wg sync.WaitGroup

	wg.Add(2)
	go func() {
		defer wg.Done()
		for i := 0; i < len(x); i++ {
			dictx[string(x[i])] += 1
		}
	}()
	go func() {
		defer wg.Done()
		for i := 0; i < len(y); i++ {
			dicty[string(y[i])] += 1
		}
	}()
	wg.Wait()

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
