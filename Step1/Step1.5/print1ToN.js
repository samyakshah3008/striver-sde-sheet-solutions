// let count = 1;
// const print1ToN = (endNumber) => {
//   if (count > endNumber) return;
//   console.log(count);
//   count++;
//   print1ToN(endNumber);
// };

// console.log(print1ToN(5));

const print1toNTimes = (i, n) => {
  if (i > n) return;
  console.log(i);
  print1toNTimes(i + 1, n);
};

print1toNTimes(1, 10);

// without using any global variables
