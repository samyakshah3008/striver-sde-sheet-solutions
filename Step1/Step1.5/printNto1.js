const printNto1 = (endNumber) => {
  if (endNumber < 1) return;
  console.log(endNumber);
  let newEndNumber = endNumber - 1;
  printNto1(newEndNumber);
};

printNto1(10);
