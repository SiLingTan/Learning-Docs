## Docker Image 
Everytime when you build a new docker image, it is versioned. So docker will keep the versioned image. 
The size will keep growing one and consume your space.

- Run this occassionally 
```bash
$ docker system prune --volumes
```

- To keep images from the last ten days.
```bash
$ docker image prune -a --filter "until=240h"
```
