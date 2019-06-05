# Learning points

1. Foreign Key: Cannot be changeable values like email address of a user.

2. For DB, id column in the tables, int is not a good option as the range is from -2million to 2 million (negative int would be wasted as it is not used). uint would be a better option with 4 million records. The best option would be uuid. 

3. Close the rows to prevent future enumeration and leaking connection. 
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
