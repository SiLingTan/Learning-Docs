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
console.log(names.map(prefix('mr')))
```

## Output 
```js
> Array ["mr jane", "mr mary", "mr crystal"]
```
