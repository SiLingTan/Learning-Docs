
# Writing Test Cases

## Motivation 
- Catch bugs.
- Ensure everything is working when you refactor your code.
- Good code coverage would inform other developers if they have broken your code. 

## Running test cases
```bash
npm test
```

## Glossary 
- Test Fixtures: A well defined and fixed testing environment where tests can be run repeatedly and provide consistent results. 
For example we load a database with a specific, known set of data before a test runs. Or we prepare an input data that does setup and creation of mock objects.

### Mocha Testing Framework
- `describe` block: creates a test environment. 
- `it` block: defines the test cases it needs to pass. 

## References
- [Nodejs](https://nodejs.org/api/assert.html)
- [Mocha](https://mochajs.org/)
- [Chai](https://www.chaijs.com/)

### Reading References
- [CrashCourse](https://hackernoon.com/a-crash-course-on-testing-with-node-js-6c7428d3da02)



