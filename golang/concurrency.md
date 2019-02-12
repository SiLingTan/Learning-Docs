# Concurrency

- Uses goroutinues and channels


## Part 1: Goroutines
- A goroutine is a function that is capable of running concurrently with other functions.
- To create a goroutine we use the keyword `go` followed by a function invocation. 
- Having multiple goroutines, runs simultaneously. 
-  WaitGroup is used so that all the goroutines can finish their task. 

### Example
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

## Part 2: Channel

- Channels provide a way for 2 goroutines to communicate with one another and synchronize their execution. 

#### Example

```go
package main

import (
	"fmt"
	"time"
)

func pinger(c chan string){
	for i:=0; ;i++{
		c <- "ping"
	}
}

func ponger(c chan string){
	for i := 0; ; i++ {
		c <- "pong"
	}
}

func printer(c chan string){
	for{
		msg := <- c
		fmt.Println(msg)
		time.Sleep(1 * time.Second)
	}
}

func main() {
	var c chan string = make(chan string)
	
	go pinger(c)
	//go ponger(c)
	go printer(c)
	
	time.Sleep(10 * time.Second)
}
```
Using a channel like this synchronizes 2 goroutines. When `pinger` attempts to send a message on the channel, it will wait until `printer` is ready to receive the message. This is known as blocking. 

### Channel Direction 

```go
// Channel `c` can only be sent to.
func pinger(c chan<- string)

// Channel `c` can be receive from. 
func printer(c <-chan string)

// Bidirectional channel channel.
func printer(c chan string)
```

### Select
- Works like `switch` but it is for channels. 
- `select` picks the first channel that is ready and receives from it(or sends to it).
- If more than one channel is ready, it randomly picks which one to receive from. 
- If none of the channels are ready, the statement blocks until one become available. 
- `default` case happens immediately if none of the channels are ready.

### Buffered Channels

This creates a buffered channel with a capacity of 1. Normally channels are synchronous; both sides of the channel will wait until the other side is ready. A buffered channel is asynchronous; sending or receiving a message will not wait unless the channel is already full. 

```go 
c := make(chan int, 1)
```





## References
- https://www.golang-book.com/books/intro/10
- https://tour.golang.org/concurrency/1
- https://golang.org/pkg/sync/#WaitGroup
