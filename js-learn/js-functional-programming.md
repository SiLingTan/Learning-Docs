# Functional Programming 
Functional Programming treats computation as the evaluation of mathematical functions. It avoids changing state and mutable data.

### Other programming paradigms
- Procedural Programming: Based on the concept of a procedure call, which contains a series of computational steps to be carried out. (Languages: C, GO)
- Object Oriented Programming: Based on the concept of object, which contains data(attributes) and procedures(methods). (Languages: C++, C#, Java)
- Meta Programming: have the ability to treat programs as their data. It means that a program can be designed to read, generate, analyze or transaform other programs, and even modify itself while running. 

### Patterns
- Imperative Pattern: focuses on describing how a program operates. It consists of commands for the computer to perform. 
- Declarative Pattern: focuses on what the program should accomplish without specifying how the program should achieve the result. 

Functional Programming follows a declarative pattern.

```javascript
var books = [
  {name:'JavaScript', pages:450}, 
  {name:'Angular', pages:902},
  {name:'Node', pages:732}
];

// Imperative Pattern - steps to get the desired output
for (var i = 0; i < books.length; i++) {
  books[i].lastRead =  new Date();
}

// Declarative Pattern - takes a function as an argument, it shows what to accomplish.
books.map((book)=> {
  book.lastRead = new Date();
  return book;
});

console.log(books);
```

## Mathematical Function or Pure Functions
In mathematics, a function is a relation between a set of inputs and a set of permissible outputs.  It has the property that each input combination is related to exactly one output.
Functional programming's functions are called pure function when it depends on the received input data to the function and does not alter the input data except the returned data. 

## Array methods 
- find
- map
- reduce
- every
- some

## Function Chaining 
It is a mechanism to invoke multiple multiple method calls. Each method returns an object, allowing the calls to be chained together in a single statement without requireing variables to store the intermediate results.

## Side Effects
Function or expression is said to have a side effect if it modifies some state of the program, which is outside of its own scope or has an observable interacion with its calling function or the outside program besides returning a value. 

In a big program (real program), it is really tough to debug the side effects.

## Immutability
Immutability is important to make sure one function doesn't change the original data rather than should return a new copy of the data after manipulation. 

## JS Examples
```javascript
var state = 0; 

// First increments state by i 
function first(i) {
   state += i;
   //console.log('state: ', state);
  return state; 
}

// Second mods i with state
function second(i) {
  //console.log('i: ', i);
  //console.log('state: ', state);
  return i % state;
}

console.log([1,2,3,4].map(first))
console.log([1,2,3,4].map(first).map(second))
console.log([1,2].map(function(x){return second(first(x))}));
```

### Output 

```javascript 
> Array [1, 3, 6, 10]
> Array [11, 13, 16, 0]
> Array [0, 0]
```

## References 
- https://www.fpcomplete.com/blog/2017/04/pure-functional-programming
- https://codeburst.io/functional-programming-in-javascript-e57e7e28c0e5
