// Pattern to print:

// 1
// 22
// 333
// 4444
// 55555

for (i = 1; i < 6; i++) {
  let str = "";
  for (j = 1; j <= i; j++) {
    str += i;
  }
  console.log(str);
}
