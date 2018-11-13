# Maps in Go

- Maps implements a hash table.
- Map types are reference types, like pointers or slices.

## Examples
Value of m is nil and it doesnt point to an initialized map
```go
var m map[string]int
```

Allocates and initializes a hash map data structure and returns a map value that points to it
```go
m = make(map[string]int) 
m = map[string]int{}
```

Gets the number of items in a map
```go
n :=len(m)
```

Removes an entry from the map
```go
delete(m, "route")
```

To retrieve and check if the key exists in the map
```go
i, ok := m["route"]
```

Initialise a map with some data
```go
m := map[string]int{
  "abc": 1,
  "def": 2,
  "ghi": 3,
}
```

## Range for maps
Using range for maps would return randomise orderings. 

```go
m := make(map[int]string)
m[1] = "a"
m[2] = "b"
m[3] = "c"
m[4] = "d"
m[5] = "e"

for k, v := range m{
  fmt.Println(k, v)
}
```
