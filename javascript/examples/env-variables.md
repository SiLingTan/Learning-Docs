
# Environment Variables 

- All environment variables are of type string.
- Example: `cronEnabled: process.env.ORACLE_CRON_ENABLED === 'true'`

```javascript
const cronEnabled = 'true'
//const cronEnabled = 'false'
//const cronEnabled = '12'

if (cronEnabled) {
  console.log('entered if loop')
}

const cronEnabledBoolean = (cronEnabled === 'true') 
if (cronEnabledBoolean) {
  console.log('entered second if loop')
}
```
