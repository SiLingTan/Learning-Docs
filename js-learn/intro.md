# Introduction 

- Javascript is a single-threaded, synchronous language. 
- A function that takes a long time to run will cause the page to become unresponsive.

## Asynchronous Javascript

### Example of Asynchronous functions
- setTimeout()
- XMLHttpRequest(),jQuery ajax(), fetch()
- Database calls

- Execution Stack: A call stack for the code. Main part of the code that would always get executed first, before the event loop sees anything else in the queue to be added into the stack. 
- Browser APIs: Handles all the asynchronous functions and push it into the queue once completed. 
- Function Queue: Once the Brower API completes a task (e.g. `setTimeout(function(){...}, 1000)`, it adds its the `function {...}` into the queue. 
- Event Loop: Waits to see if there is any thing left (to execute) in the stack, no? Check the Queue if there is anything. yes? Remove it from the queue and push it into the stack. So that the stack would execute `function{...}`.

## Concurreny Model 
### Callbacks
 - Control flow with asynchronous calls
 - Execute function once asynchronous call returns value. 
    - program doesn't have to halt and wait for that value. 
 
 - Callback hell occurs when there is an asynchronous function that calls a callback, the callback calls another asynchronous function that calls another callback, etc and this goes on.
    - The code is very nested like a Christmas tree. 
    - To solve this we use promises.
    
### Promises 
 ```javascript
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
 
 ### Aysnc, Await
 An attempt to write asynchronous code as if it was synchronous. 
 ```javascript
 async function login(req, res, callback) {
  try{
   const user = await User.findOne({email: req.body.email})
   const isMatch = await user.comparePassword(req.body.password)
   if (!isMatch) {
     return res.status(401).send('Incorrect password')
   }
   
   ...
   ...
  
  } catch (err) {
    // Handle the error.
  }
 
 }
 ```
 
## this
   - `function() {...}`   `this` is the time the function is invoked. 
   - `() => {...}` When using arrow notation, `this` is the time the function is declared. 

### Example of this
```javascript
/* Case 1 */
const person = {
	name: 'james', 
  greet: function() {
  	console.log('hello, ' + this.name)
  }
}

// At the time of invocation, this refers to the object person. 
person.greet()

/* Case 2 */
const friend = {
	name: 'janelle',
}

friend.greet = person.greet
// At the time of invocation, this refers to the object friend. 
friend.greet()

/* Case 3 */
// Bind the object to `this` in the particular function. Bind would return a new function, so you need to call greet() after that to invoke. Whereas, call() and apply() would immediately invoke the function. 
const greet = person.greet.bind({name: 'binded name'})
greet()
```
## DOM (Document Object Model) 
 - DOM is a tree representation of the html page. 
          

## Reference 
- [CS50 Havard Lecture](https://www.youtube.com/watch?v=3Ay2lS6tm4M&list=PLhQjrBD2T382gdfveyad09Ierl_3Jh_wR&index=3)
