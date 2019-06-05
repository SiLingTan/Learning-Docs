## Structs

- Golang structs should be singular (e.g. `Achievement` not `Achievements`).  

Example struct with logging: 
```golang
type Achievement struct {
	ID   int    `json:"id,omitempty"`
	Name string `json:"name,omitempty" validate:"required"`
	Year string `json:"year,omitempty" validate:"required,len=4"`
}

func (a *Achievement) MarshalLogObject(enc zapcore.ObjectEncoder) error {
	enc.AddInt("id", a.ID)
	enc.AddString("name", a.Name)
	enc.AddString("year", a.Year)
	return nil
}
```
