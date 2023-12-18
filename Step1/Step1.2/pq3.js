// Pattern to print:

// 1
// 12
// 123
// 1234
// 12345

for (i = 1; i < 6; i++) {
  for (j = 1; j <= i; j++) {
    console.log(j);
  }
  console.log("\n");
}
