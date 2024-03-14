let count = 1;
const print1ToN = (endNumber) => {
  if (count > endNumber) return;
  console.log(count);
  count++;
  print1ToN(endNumber);
};

console.log(print1ToN(5));
