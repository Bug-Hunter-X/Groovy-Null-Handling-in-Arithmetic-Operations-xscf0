```groovy
def myMethod(arg1, arg2) {
  if (arg1 == null) {
    return arg2
  } else if (arg2 == null) {
    return arg1
  } else {
    return arg1 + arg2
  }
}

println myMethod(null, 5)
println myMethod(10, null)
println myMethod(null, null)
```