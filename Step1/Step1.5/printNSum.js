let accumulator = 0;
const sum = (n, index = 1) => {
  if (index <= n) {
    accumulator = accumulator + index;
    index++;
    return sum(n, index);
  } else {
    console.log(accumulator);
    return accumulator;
  }
};

console.log(sum(5));

function sumNaturalNumbers(n) {
  // Base case: stop recursion when n is 0
  if (n === 0) {
    return 0; // Sum of 0 natural numbers is 0
  }

  // Recursively compute the sum of natural numbers from 1 to n
  return n + sumNaturalNumbers(n - 1);
}

const n = 5;
console.log("Sum of the first", n, "natural numbers is:", sumNaturalNumbers(n));
