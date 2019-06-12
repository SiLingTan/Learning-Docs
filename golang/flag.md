## Flag 

- Flags is used to set a variable in the program through command line. 
- Define flags using flag.String(), Bool(), Int(), etc.

Example: 
```golang
package main

import (
	"flag"
	"fmt"
)

var vegetarian bool
var paid = flag.Bool("paid", false, "species have paid for the meal")

func init() {
	flag.BoolVar(&vegetarian, "vegetarian", true, "species' dietary preference")
}

func main() {
	flag.Parse()

	fmt.Println("vegetarian", vegetarian)
	fmt.Println("paid", *paid)
}
```

Running on command line:
```bash
# Set paid to true and vegetarian to false.
$ go run /Users/tansiling/Downloads/D4d0Vi9lnXd.go -paid -vegetarian=false
# Output.
vegetarian false
paid true
```

## References
- [Go Flag Package](https://golang.org/pkg/flag/#pkg-overview)
