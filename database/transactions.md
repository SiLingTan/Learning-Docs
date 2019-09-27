## Transactions 

Transaction happens in a set — A wants to transafer money to B
1. We have to deduct money from A’s account
2. We have to credit money into B’s account

If we have the transaction for the first one that passes, but failed for the second. There would be inconsistency cos we incorrectly deducted money for A. Thus these 2 transactions needs be done together.

The idea is like this: 
```
db.begin()
tx.Exec()
if err != nil {
    tx.Rollback()
}
…
tx.Exec()
if err != nil {
    tx.Rollback()
}
…
once all is done, tx.Commit()
```

Links: 
- https://pseudomuto.com/2018/01/clean-sql-transactions-in-golang/
- https://stackoverflow.com/questions/9022691/what-constitutes-a-transaction-layer-when-talking-about-database-systems

