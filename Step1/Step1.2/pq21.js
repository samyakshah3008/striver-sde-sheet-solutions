const printSquarePattern = (rows) => {
  for (let i = 1; i <= rows; i++) {
    let str = "";
    for (let j = 1; j <= rows; j++) {
      if (i == 1 || j == 1 || i == rows || j == rows) {
        str += "*";
      } else {
        str += "-";
      }
    }
    console.log(str);
  }
};

printSquarePattern(5);
