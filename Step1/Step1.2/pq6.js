// Pattern to print:

// 12345
// 1234
// 123
// 12
// 1

for (i = 5; i > 0; i--) {
  for (j = 1; j <= i; j++) {
    console.log(j, " ");
  }
  console.log("\n");
}
