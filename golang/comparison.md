## Comparing two strings

```golang
// Good
if ok := strings.ToLower(a) == strings.ToLower(b); ok {}

// Better
if ok := strings.EqualFold(a, b); ok {}
```

### Reference 
- https://www.digitalocean.com/community/questions/how-to-efficiently-compare-strings-in-go
