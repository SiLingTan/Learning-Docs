## Named export 

- To export many different functions from a single file. 

### Example: 
actions/index.js
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

components/app.js
```javascript
import {selectSong} from ../actions
```


