### Export Statement Examples

### 1. Named export 

- To export many different functions from a single file. 

#### Example: 
- actions/index.js
```javascript
// Action creator.
export const selectSong = (song) => {
  // Action.
  return {
    type: 'SONG_SELECTED', 
    payload: song
  }
}
```

- components/app.js 
```javascript
// Need curly braces
import { selectSong } from '../actions'
```

### 2. Default Export

#### Example: 
- actions/index.js
```javascript
// Action creator.
const selectSong = (song) => {
  // Action.
  return {
    type: 'SONG_SELECTED', 
    payload: song
  }
}

export default selectSong
```

- components/app.js
```javascript
// Dont need curly braces
import selectSong from '../actions'
```


