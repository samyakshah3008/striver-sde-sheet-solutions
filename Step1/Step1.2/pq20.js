const printPattern = (rows) => {
  let spaceCount = 2 * rows - 2;
  for (let i = 1; i <= 2 * rows - 1; i++) {
    let str = "";
    let formula = i;
    if (formula > rows) {
      formula = 2 * rows - i;
    } else {
      formula = i;
    }

    // stars
    for (let x = 1; x <= formula; x++) {
      str += "*";
    }

    // spaces
    for (let y = 1; y <= spaceCount; y++) {
      str += "-";
    }

    // stars
    for (let z = 1; z <= formula; z++) {
      str += "*";
    }
    if (i >= rows) {
      spaceCount += 2;
    } else {
      spaceCount -= 2;
    }
    console.log(str);
  }
};

printPattern(5);
