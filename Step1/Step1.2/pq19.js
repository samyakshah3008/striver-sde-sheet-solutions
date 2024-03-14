const printPatternUpside = (rows) => {
  for (let i = 1; i <= rows; i++) {
    let str = "";
    let spaceCount = 2 * (i - 1);

    for (let j = 5; j >= i; j--) {
      str += "*";
    }
    for (let k = 1; k <= spaceCount; k++) {
      str += "-";
    }
    for (let m = 5; m >= i; m--) {
      str += "*";
    }
    console.log(str);
  }
};

const printPatternDownside = (rows) => {
  let spaceCount = 2 * rows - 2;

  for (let i = 1; i <= rows; i++) {
    let str = "";

    for (let j = 1; j <= i; j++) {
      str += "*";
    }
    for (let k = 1; k <= spaceCount; k++) {
      str += "-";
    }
    for (let m = 1; m <= i; m++) {
      str += "*";
    }
    spaceCount = spaceCount - 2;
    console.log(str);
  }
};

printPatternUpside(5);
printPatternDownside(5);
