for (let i = 0; i < 9; i++) {
  let str = "";
  if (i < 5) {
    for (let j = 0; j <= i; j++) {
      str += "*";
    }
  }

  if (i >= 5) {
    for (let j = 8; j >= i; j--) {
      str += "*";
    }
  }

  console.log(str);
}
