for (let i = 0; i < 5; i++) {
  let str = "";
  for (let j = 0; j < i; j++) {
    str += " ";
  }
  for (let k = 9; k >= 2 * i + 1; k--) {
    str += "*";
  }
  for (let l = 0; l < i; l++) {
    str += " ";
  }
  console.log(str);
}
