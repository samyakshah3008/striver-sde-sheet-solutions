// Pattern to print:

// 12345
// 1234
// 123
// 12
// 1

for (i = 5; i >= 1; i--) {
  let str = "";
  for (j = 1; j <= i; j++) {
    str += j;
  }
  console.log(str);
}
