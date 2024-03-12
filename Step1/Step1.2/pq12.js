const print = (rows) => {
  let spaceCount = 2 * rows - 2;
  for (let i = 1; i <= rows; i++) {
    let str = "";

    // numbers
    for (let j = 1; j <= i; j++) {
      str += j;
    }
    //spaces

    for (let l = 1; l <= spaceCount; l++) {
      str += "-";
    }

    // numbers
    for (let k = i; k >= 1; k--) {
      str += k;
    }
    spaceCount -= 2;
    console.log(str);
  }
};

print(5);
