// Pattern to print:

// *
// **
// ***
// ****
// *****

for (i = 1; i < 6; i++) {
  let str = "";
  for (j = 1; j <= i; j++) {
    str += "*";
  }
  console.log(str);
}
