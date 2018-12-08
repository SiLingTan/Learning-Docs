# Maps

- Map implements a hash table.
- It is an unordered collection of key-value pairs. 
- It is used to lookup by its associated key.
- Map types are reference types, like pointers or slices.

## Declare a map
- Value of m is nil and it doesn't point to an initialized map
- m is a map of `string`s to `int`s
```go
var m map[string]int
```

## Initialise a map
- Allocates and initializes a hash map data structure and returns a map value that points to it
- If the map is not initialized, it would cause a runtime error. 
```go
m = make(map[string]int) 
m = map[string]int{}
```

This would cause a runtime error, if the map was not initialized. 
```go
x["myKey"] = 10
fmt.Println(x)
```

Gets the number of items in a map
```go
n :=len(m)
```

Delete items from a map
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
