# Anonymous Functions

``` javascript
var helloWorld = function(){
    alert("hello world!");
}
```

# Nested Functions

``` javascript
function helloWorld() {
    return function() {
        return "hello world!";
    }
}

// Call it with 2 brackets. 
helloWorld()()
```

# Function Scope and Conflicts
Global scope are values that are accessible from everywhere in the code. 

### Sample Javascript Code 
Run this sample JS code on browser console with `a()`, `b()`, `output(x)` etc.

``` javascript
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Function scope example</title>
</head>
<body>
  
  <script>
    // x is a global variable.
    var x = 1;
    function a() {
      var y = 2;
    //   output(x);
    //   output(y);
    //   output(z);
    }
    function b() {
      var z = 3;
    //   output(x);
    //   output(z);
    //   output(y);
    }

    // output is defined in the global scope.
    function output(value) {
      var para = document.createElement('p');
      document.body.appendChild(para);
      para.textContent = 'Value: ' + value;
    }
  </script>
</body>
</html>
```

# References
- https://developer.mozilla.org/en-US/docs/Learn/JavaScript/Building_blocks/Functions
