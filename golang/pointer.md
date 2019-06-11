## Pointer

A pointer holds the memory address of a value.  

```golang
var p *int
i := 3
p = &i

// [Deferencing]Read i through the pointer p. 
fmt.Println("p: ", *p)

// [Deferencing]Set i through the pointer p.
*p = 42
fmt.Println("new i: ", i)

// [Deferencing]Read i through the pointer p.
fmt.Println("pointer p: ", *p)

```
