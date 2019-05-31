# Learning points

1. Foreign Key: Cannot be changeable values like email address of a user.

2. Close the rows to prevent future enumeration and leaking connection. 
```
rows, err := r.db.Query()
if err != nil {
  return err
}
defer rows.Close() // Very important, else the connection will keep leaking.
for rows.Next() {
  // Scan
}
```
