const print = (rows) => {
  let count = 1;
  for (let i = 1; i <= rows; i++) {
    let str = "";
    for (let j = 1; j <= i; j++) {
      str += count;
      count += 1;
    }
    console.log(str);
  }
};

print(5);
