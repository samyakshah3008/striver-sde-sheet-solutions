let count = 1;
const app = () => {
  //   let count = 1; cannot declare here or else it will stack over flow
  if (count === 4) return;
  console.log(count, "count");
  count += 1;
  app();
};

console.log(app());
