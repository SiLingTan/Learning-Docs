## Locking Reads

- If we query a record and then update the related data, in between the time other transactions can update/delete the same rows we just queried. 
- Locking the rows provides safety. 

### SELECT ... FOR UPDATE
- Locks the rows the same as if you issued an UPDATE statement for those rows. 
- The locks set is released when the transaction is committed or rolled back. 


#### Example 
- Locks table t1:
```sql
SELECT * FROM t1 WHERE c1 = (SELECT c1 FROM t2) FOR UPDATE;
```
- Locks tables t1 and t2:
```sql
SELECT * FROM t1 WHERE c1 = (SELECT c1 FROM t2 FOR UPDATE) FOR UPDATE;
```
