// Pattern to print:

// *****
// ****
// ***
// **
// *

for (i = 1; i < 6; i++) {
  for (j = 5; j >= i; j--) {
    console.log("*");
  }
  console.log("\n");
}
