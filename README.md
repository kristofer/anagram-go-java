# anagram-go-java

An old coder looks back to Java. This is a simple implementation of an interview
question I fumbled yesterday. The interviewer really wanted me to do it in Java,
but I've been go coding for a while now, and tried it with go. I pseudo coded it out
in comment and then promptly spaced on how to get a damn character out of a string in
Go. Sigh.

Less than 10 minutes after the interview was over, I had the working Go version.
Then, this morning, I thought, after all these years, go back and do the same thing,
trnaliterated into Java. Took too long, I suppose, but it made think thru the stuff
I've forgotten about Java in the last decade that I've ignored it.

(And I know, I know **Runes**, but he said, no, just a simple string.)

aab, aba = true
aab, cab = false
aab, abdcefghijklmnopqrstuvwxyz = false

right?

as you can see in the Go version (anagram.go) I decided to "bin" the characters
using a "grow as it needs to" **map**

see my medium.com article on this, as penance to assuage my personal disappointment.

### Commands

```
java Anagram.java

go run anagram.go

swift anagram.swift
```

### Timing

```
# the original version.
$ time ./anagram
true
true
false
false

real	0m0.005s
user	0m0.001s
sys	0m0.003s
```
also, just to be pointy-headed, I wrote this where we do the two loops in
go routines, because you can. The timings where unsurprising.
```
# the pedantic, go routine version.
$ time ./anagram
true
true
false
false

real	0m0.010s
user	0m0.001s
sys	0m0.003s
```
