## Sort 

Using the sort package in Golang, we can do the following: 
```golang
// Integers.
data := []int{32,23,1,24,56}
sort.Ints(data)
fmt.Println("sorted data: ", data)

// Floats.
nums := []float64{2.2,1.299,1.22,23.23,2}
sort.Float64s(nums)
fmt.Println("sorted nums: ", nums)

// Strings.
s := []string{"james", "amy", "sam"}
sort.Strings(s)
fmt.Println("sorted strings: ", s)

// Typed collection of fields. 
type Person struct {
  Name string
  Age int
}

func main() {
  person := []Person {
    {"Bob", 20}, 
    {"Jane", 19},
    {"James",2},
  }

  sort.Slice(person, func(i, j int) bool {
    return person[i].Age < person[j].Age
  })
  fmt.Println("sorted by age", person)
}

```
