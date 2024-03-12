for (let i = 0; i < 5; i++) {
  let str = "";
  for (let j = 0; j <= 5 - i - 1; j++) {
    str += " ";
  }
  for (let k = 1; k <= 2 * i + 1; k++) {
    str += "*";
  }
  for (let l = 0; l <= 5 - i - 1; l++) {
    str += " ";
  }
  console.log(str);
}
