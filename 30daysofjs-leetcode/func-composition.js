function compose(functions) {
  return function fn(x) {
    return functions.reduceRight((acc, fn) => fn(acc), x);
  };
}

// Example usage
const functions = [(x) => x + 1, (x) => x * x, (x) => 2 * x];

const composedFunction = compose(functions);

const result = composedFunction(4);
console.log(result); // Output will be 82, because: (2 * (4 * 4)) + 1 = 82
