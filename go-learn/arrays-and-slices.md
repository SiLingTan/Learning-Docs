# Arrays and Slices

## Array
An array is a numbered sequence of elements with a single type (with a fixed length). 
- Zero-based index

### Declare an array
```go
var x [5]int
fmt.Println(x)
// [0 0 0 0 0]

y := [5]int{1,2,3,4,5}
fmt.Println(y)
// [1 2 3 4 5]
```

## Slices 

A slice is a segment of an array. However, unlike arrays its length is changeable. 

### Declare a slice
- Doesn't have a length specified in the brackets. 
- x has been created with a length of 0. 
```go
var x []float64
fmt.Println(x)
// []
```
### Create a slice
Slices are always associated with some array, but they can never be longer than the array. They can only be smaller.
This example creates a slice that is associated with an underlying `float64` array of length 5. The third parameter 10 represents the capacity of the underlying array, which the slice points to. 
```go
y := make([]float64, 5, 10)
fmt.Println(y) 
// [0 0 0 0 0]
```

Creating a slice with `[low:high]` expression. 
- `low` is the index of where to start the slice and `high` is the index where to end it (but not including the index itself).

```go
arr := [8]float64{1,2,3,4,5,6,7,8}
a := arr[0:4]
b := arr[2:]
c := arr[:]
fmt.Println(a, b, c)
// [1 2 3 4] [3 4 5 6 7 8] [1 2 3 4 5 6 7 8]
```

#### Slice Functions
- Built-in functions for slices: `append` and `copy`. 

Creates a new slice
```go
slice1 := []int{1,2,3}
slice2 := append(slice1, 4, 5) 
fmt.Println(slice1, slice2)
// [1 2 3] [1 2 3 4 5]
```

Copies elements in slice1 into slice2
```go
slice1 := []int{1,2,3}
slice2 := make([]int, 2)
copy(slice2, slice1)
fmt.Println(slice1, slice2)
// [1 2 3] [1 2]
```

## References
- https://www.golang-book.com/books/intro/6




