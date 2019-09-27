## Currying
Currying is the process of breaking down a function into a series of functions that each take a single argument. 

## Example
This program takes in a list of names and returns names with 'ms' as a prefix.

```js
function prefix (prefixName) {
  return function (name) {
    return prefixName + " " + name
  }
}

const names = ['jane', 'mary', 'crystal']
// Takes in a list of names. For each name, it is calling (name) => ("ms" + " " + name) function. 
console.log(names.map(prefix('ms')))
```

## Output 
```js
> Array ["ms jane", "ms mary", "ms crystal"]
```

## JS Example 
```js
// fn: (x, y, z) => x + y + z
// n = 1, 
// args = [1,2,3]
// xs = [3]
function curry(fn) {
  // accepts one or more input values e.g. (1,2) or (2,3)
  return (...xs) => {
    // console.log(fn.length);
    if (xs.length === 0) {
      throw Error('Empty Invocation');
    }
    
    if (fn.length <= xs.length) {
      return fn(...xs);
    }
    return curry(fn.bind(null, ...xs));
  }
 }
// input a fn.length equals 0
//const log0 = curry(() => console.log());
//log0
//const log1 = curry((x) => console.log(x));
//log1(10);
//const log2 = curry((x, y) => console.log(x, y));
//log2(10)(20)
  
//const sum3 = curry((x, y, z) => {
//  return x + y + z;
//});
//console.log(sum3(1)(2)(3));
//const sum4 = curry((a, b, c, d, e) => {
//  return a + b + c + d + e;
//});
//console.log(sum4(1)(2)(3)(4)(5));
const sum5 = curry((x, y, z) => x + y + z);
console.log(
  //sum5(1,2,3), 
  //sum5(1, 2)(3),
  //sum5(1)(2, 3), 
  sum5(1)(2)(3), 
); 
// Testing empty invocations
//console.log(sum5(1)(2)()(3));
```
