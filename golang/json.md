## Handling JSON Data

Sample code to marshal and unmarshal json data:
```golang
package main

import (
	"fmt"
	"encoding/json"
)

type Data struct {
	Name string `json:"name"`
	Occupation string `json:"occupation"`
	Family string `json:"family"`
}

func main() {
	s := `{"family":"tan", "occupation": "siling", "test": "hello"}`
	var d Data
	err := json.Unmarshal([]byte(s), &d)
	if err != nil {
	    fmt.Println("err: ", err.Error())
	}
	
	fmt.Println("data d Name:", d.Name)
	fmt.Println("data d Occupation:", d.Occupation)
	
	b, err := json.Marshal(d)
	if err != nil {
	    fmt.Println("err: ", err.Error())
	}
	
	fmt.Println("data b:", string(b))
}
```
