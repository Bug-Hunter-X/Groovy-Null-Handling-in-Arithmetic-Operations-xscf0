# Groovy Null Handling Quirks

This repository demonstrates a subtle issue in Groovy's handling of null values when combined with arithmetic operations.  The `myMethod` function attempts to handle null inputs, but the result might not be what's initially expected.  The solution file offers a more robust approach.

## Running the code

1. Ensure you have Groovy installed.
2. Run `groovy bug.groovy` to see the unexpected behavior.
3. Then run `groovy bugSolution.groovy` to see the improved version.