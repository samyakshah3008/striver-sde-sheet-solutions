// const printNto1 = (endNumber) => {
//   if (endNumber < 1) return;
//   console.log(endNumber);
//   let newEndNumber = endNumber - 1;
//   printNto1(newEndNumber);
// };

// printNto1(10);

const printNto1Times = (n, i) => {
  if (n < i) return;
  console.log(n);
  printNto1Times(n - 1, i);
};

printNto1Times(10, 1);
