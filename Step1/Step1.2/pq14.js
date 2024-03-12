const printAlphabetPattern = (rows) => {
  for (let i = 1; i <= rows; i++) {
    let str = "";
    for (let j = 65; j < 65 + i; j++) {
      str += String.fromCharCode(j);
    }
    console.log(str);
  }
};

printAlphabetPattern(5);
