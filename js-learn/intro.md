# Introduction 

- Javascript is a single-threaded, synchronous language. 
- A function that takes a long time to run will cause the page to become unresponsive.

### Example of Asynchronous functions
- setTimeout()
- XMLHttpRequest(),jQuery ajax(), fetch()
- Database calls

## Concurreny Model 
### Callbacks
 - Control flow with asynchronous calls
 - Execute function once asynchronous call returns value. 
    - program doesn't have to halt and wait for that value. 
 
 - Callback hell occurs when there is an asynchronous function that calls a callback, the callback calls another asynchronous function that calls another callback, etc and this goes on.
    - The code is very nested like a Christmas tree. 
    - To solve this we use promises.
    
### Promises 
 ```
 const url = ''
 
 fetch(url)
  .then(function(res) {
    ...
  })
  .then(function(json) {
    ...
  })
  .then(function(json) {
    ...
  })
  .catch(function(err) {
    // Handle the error.
  })
 ```
 
## this
   - `function() {...}`   `this` is the time the function is invoked. 
   - `() => {...}` When using arrow notation, `this` is the time the function is declared. 

## DOM (Document Object Model) 
 - DOM is a tree representation of the html page. 
          

## Reference 
- (CS50 Havard Lecture)[https://www.youtube.com/watch?v=3Ay2lS6tm4M&list=PLhQjrBD2T382gdfveyad09Ierl_3Jh_wR&index=3]
