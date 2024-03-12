const print = (rows) => {
  for (let i = 1; i <= rows; i++) {
    let str = "";
    for (let j = 1; j <= i; j++) {
      str += String.fromCharCode(64 + i);
    }
    console.log(str);
  }
};

print(5);
