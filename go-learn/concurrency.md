# Concurrency

- Uses goroutinues and channels


## Part 1: Goroutines
- A goroutine is a function that is capable of running concurrently with other functions.
- To create a goroutine we use the keyword `go` followed by a function invocation. 
- Having multiple goroutines, runs simultaneously. 
-  WaitGroup is used so that all the goroutines can finish their task. 

Example
```go
package main

import (
	"fmt"
	"time"
)

func say(s string) {
	for i := 0; i < 5; i++ {
    		time.Sleep(800 * time.Millisecond)
		fmt.Println(s)
	}
}

func main() {
	// Goes into a separate thread.
	go say("world")
	
	// Runs on the main thread.
	time.Sleep(6 * time.Second)
	// fmt.Println("helloo")
	// say("hello")
}
```

This program consists of 2 goroutinues (main function itself and when we call `go say()`).
Instead of waiting for our function `say()` to complete, we immediately go to the next line `time.Sleep(6 * time.Second)`. This is because the `go say()` creates another goroutine thread, while the main work on its current thread.
This why the call to sleep is needed in the main, without it, the program would exit before given the opportunity to print all the strings in the `say()` function.

If we comment out `time.Sleep(6 * time.Second)` in the main function, since the main thread has nothing to run, it terminates and the say() function didnt get its chance to run.  

## References
- https://www.golang-book.com/books/intro/10
- https://tour.golang.org/concurrency/1
- https://golang.org/pkg/sync/#WaitGroup
