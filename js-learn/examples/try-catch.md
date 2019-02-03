# Try Catch 

```javascript
function foo() {
  //  throw new Error("exception in foo")
  return
}

function test() {
  const details = {}
  
  try {
    details.car = 'red'
    console.log('details: ', details)
    foo(details)
  } catch (error) {
    const errDetails = {
      'error': error.message, 
      'details': JSON.stringify(details)
    }
    console.log('FooError: ', errDetails)
  }
}

test()
```
