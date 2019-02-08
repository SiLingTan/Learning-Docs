# Time

### Convert from UTC to local time using [moments](https://momentjs.com/).
Example:
```javascript
var moment = require('moment')

var utcDate = new Date().toISOString()
console.log(utcDate)
var currDate = moment.utc(utcDate).local().format('DD.MM.YYYY')
console.log(currDate)
```
