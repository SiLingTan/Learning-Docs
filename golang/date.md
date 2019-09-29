## Validate Date 

### Example

```golang
package main

import (
	"encoding/json"
	"fmt"
	"log"
	"time"
)

var MaxDate = time.Date(9999, 12, 31, 0, 0, 0, 0, time.Local)

type User struct {
	DateOfBirth time.Time `json:"date_of_birth"`
}

func (u *User) IsDateOfBirthValid() bool {
	return !u.DateOfBirth.Equal(MaxDate)
}

type Response struct {
	User
	DateOfBirth *time.Time `json:"date_of_birth"`
}

func main() {
	user := User{
		DateOfBirth: time.Date(9999, 12, 31, 0, 0, 0, 0, time.Local),
	}
	res := Response{
		User: user,
	}
	if res.User.IsDateOfBirthValid() {
		res.DateOfBirth = &res.User.DateOfBirth
	}

	b, err := json.Marshal(res)
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println(string(b))
}
```


### Ensure that only valid dates are returned in the frontend. 

```golang
package main

import (
	"encoding/json"
	"fmt"
	"log"
	"time"
)

var MaxDate = time.Date(9999, 12, 31, 0, 0, 0, 0, time.Local)

type User struct {
	Name        string    `json:"name,omitempty"`
	DateOfBirth time.Time `json:"date_of_birth,omitempty"`
}

func (u *User) IsDateOfBirthValid() bool {
	return !u.DateOfBirth.Equal(MaxDate)
}

type Response struct {
	User
	// When there are two struct fields with the same name, the second one will have priority, it can override the first one.
	DateOfBirth *time.Time `json:"date_of_birth,omitempty"`
}

func main() {
	// With invalid date of birth.
	{
		user := User{
			Name:        "John Doe",
			DateOfBirth: time.Date(9999, 12, 31, 0, 0, 0, 0, time.Local),
		}
		res := Response{
			User: user,
		}
		if res.User.IsDateOfBirthValid() {
			res.DateOfBirth = &res.User.DateOfBirth
		}

		b, err := json.Marshal(res)
		if err != nil {
			log.Fatal(err)
		}
		fmt.Println(string(b))
	}

	// With valid date of birth.
	{
		user := User{
			Name:        "John Doe",
			DateOfBirth: time.Date(1990, 12, 31, 0, 0, 0, 0, time.Local),
		}
		res := Response{
			User: user,
		}
		if res.User.IsDateOfBirthValid() {
			res.DateOfBirth = &res.User.DateOfBirth
		}

		b, err := json.Marshal(res)
		if err != nil {
			log.Fatal(err)
		}
		fmt.Println(string(b))
	}
}
```
