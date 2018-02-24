[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/SKocur/Ryss)

# Ryss
Ryss is programming language with syntax inspired by Assembly. Execution process takes place in separated threads, different thread is for GUI (Graphical User Interface) elements and different for console tasks. There are some debugging options passed as a paremeters to Ryss interpreter, which can be enabled at startup:
* `-verbose:avmemory` displays available memory
* `-verbose:maxmemory` displays total memory

### Simple "Hello World" program:
#### First option:
```
log 'Hello World!'
```

#### Second option:
```
init firstVariable 'Hello World!'
log firstVariable
```
Output in both cases is the same ```Hello World!```

### Documentation is available on: [JavaDoc](https://skocur.github.io/Ryss/)

[![forthebadge](http://forthebadge.com/badges/gluten-free.svg)](https://github.com/SKocur/Ryss) [![forthebadge](http://forthebadge.com/badges/powered-by-jeffs-keyboard.svg)](https://github.com/SKocur/Ryss)
