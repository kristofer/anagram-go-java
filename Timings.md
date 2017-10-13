# Timing of this code on a i7 mac.

$ time go build anagram.go

real	0m0.216s
user	0m0.168s
sys	0m0.070s

$ time ./anagram
true
true
false
false

real	0m0.005s
user	0m0.001s
sys	0m0.003s

$ time javac Anagram.java

real	0m0.640s
user	0m1.292s
sys	0m0.106s

$ time java Anagram
true
true
false
false

real	0m0.128s
user	0m0.086s
sys	0m0.024s
