```groovy
def myMethod(arg1, arg2) {
  def result = 0
  result += arg1 ?: 0
  result += arg2 ?: 0
  return result
}

println myMethod(null, 5) // Output: 5
println myMethod(10, null) // Output: 10
println myMethod(null, null) // Output: 0
```