## Phone Number 

### Example: Validate A Japanese Phone Number
```golang
package main

import (
	"fmt"
	"regexp"
)

const (
	fixed = "0([1-9]{1}-?[1-9]\\d{3}|[1-9]{2}-?\\d{3}|[1-9]{2}\\d{1}-?\\d{2}|[1-9]{2}\\d{2}-?\\d{1})-?\\d{4}"
	mobile = "0[789]0-?\\d{4}-?\\d{4}"

)

func main() {
	match := validatePhoneNumber("0466-11-1111")
	fmt.Println("valid phone number: ", match)
}

func validatePhoneNumber(num string) bool {
	exp := fmt.Sprintf("^(%s|%s)$", fixed, mobile)
	
	r, err := regexp.Compile(exp)
	if err != nil {
		return false
	}

	return r.MatchString(num)
} 

```

### Reference
- [Phone Regex](https://github.com/sakatam/a-better-jp-phone-regex)
