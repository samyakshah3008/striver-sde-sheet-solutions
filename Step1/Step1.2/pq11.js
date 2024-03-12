const print = (rows) => {
  for (let i = 0; i < rows; i++) {
    let str = "";
    let start = 1;
    if (i % 2 !== 0) {
      start = 0;
    } else {
      start = 1;
    }
    for (let j = 0; j <= i; j++) {
      str += start;
      if (start === 1) {
        start = 0;
      } else {
        start = 1;
      }
    }
    console.log(str);
  }
};

print(5);
