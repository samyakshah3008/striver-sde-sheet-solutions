// Pattern to print:

// *****
// ****
// ***
// **
// *

for (i = 0; i < 5; i++) {
  for (j = 5; j > i; j--) {
    console.log("*");
  }
  console.log("\n");
}
