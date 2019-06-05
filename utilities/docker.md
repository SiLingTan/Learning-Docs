## Docker Image 
1. Terms

- Images: A blueprint from which an arbitrary number of brand-new containers can be started. 

- Dockerfile: A set of precise instructions on how to create a new Docker image, setting defaults for containers being run based on it. It is a script which installs the operating system, all neccessary parts and makes sure that everything is in place. 

- Volumes: Any changes made to a container given that you dont save it as an image, are lost as soon  as it is removed. Volumes are for having persistent and shared data. 

2. Everytime when you build a new docker image, it is versioned. So docker will keep the versioned image. 
The size will keep growing one and consume your space.

- Run this occassionally 
```bash
$ docker system prune --volumes
```

- To keep images from the last ten days.
```bash
$ docker image prune -a --filter "until=240h"
```
