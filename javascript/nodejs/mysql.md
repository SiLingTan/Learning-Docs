# Node-mysql2 (Sidorares)

## Query vs Execute

After connection is setup...
```
c: client, s: server
```
### Query 
```
c: hey server, please tel me what is result of "SELECT name,email FORM users WHERE id=1234"
s: sure thing!
s: you'll have 2 fields in your response, of type string and named name,email
s: here is first row of data: "John Smith",  "john@smith.com"
s: actually, that's it. All done
```

### Execute
- Uses prepared statements.
- Data to and from server is serialised slightly differently. `Query` send as text and `execute` send as binary. 
```
c: hey server, please prepare statement for this query: "SELECT name,email FORM users WHERE id=?"
s: ok!
s: we'll use 123 for this statement, and here is some info about it: one parameter expected; 2 fields would be returned
s: all done

c: hey server, please tel me what is result of executing statement 123 with parameter set to 1235?
s: sure thing!
s: you'll have 2 fields in your response, of type string and named name,email
s: here is first row of data: "John Donn",  "john@donn.com"
s: actually, that's it. All done
```

## References
- https://github.com/sidorares/node-mysql2/issues/382
- https://github.com/sidorares/node-mysql2/issues/518
- https://github.com/sidorares/node-mysql2#prepared-statements
