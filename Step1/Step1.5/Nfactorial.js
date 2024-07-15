const printFactorial = (n) => {
  if (n === 0) {
    return 1;
  } else {
    return n * printFactorial(n - 1);
  }
};

console.log(printFactorial(5));

const printNFactorial = (n, sum) => {
  if (n < 1) {
    console.log(sum);
    return 0;
  }
  return printNFactorial(n - 1, sum * n);
};

printNFactorial(5, 1);
