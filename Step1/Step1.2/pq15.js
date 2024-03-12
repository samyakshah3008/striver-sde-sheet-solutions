const printReverseAlphabetPattern = (rows) => {
  for (let i = rows; i >= 1; i--) {
    let str = "";
    for (let j = 65; j < 65 + i; j++) {
      str += String.fromCharCode(j);
    }
    console.log(str);
  }
};

printReverseAlphabetPattern(5);
