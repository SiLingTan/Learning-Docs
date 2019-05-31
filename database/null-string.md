## Null String values

- Is the field a required/mandatory field, if so it should not be null.
- Nullable columns are annoying and lead to a lot of ugly code. If you can, avoid them.

### If u really cannot avoid NULL...

#### Method 1: Use special types from the database/sql package to handle them, or define your own.
```golang
for rows.Next() {
	var s sql.NullString
	err := rows.Scan(&s)
	// check err
	if s.Valid {
	   // use s.String
	} else {
	   // NULL value
	}
}
```

#### Method 2: COALESCE
Convert the null value to string with: 
- COALESCE(gender, "")

Conditional remove
- COALESCE(NULLIF(gender, 'not-set'), "")


Reference
- [Golang SQL API Library] https://golang.org/pkg/database/sql/#NullString
- [Code Examples] http://go-database-sql.org/nulls.html
