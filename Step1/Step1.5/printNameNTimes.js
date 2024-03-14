let count = 1;
const printName = (name) => {
  if (count === 5) return;
  count++;
  console.log(name);
  printName(name);
};

printName("Samyak");
