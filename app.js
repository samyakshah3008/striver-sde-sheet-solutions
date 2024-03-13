// const printUpside = (rows) => {
//   for (let i = 1; i <= rows; i++) {
//     let str = "";
//     let spaceCount = 2 * i - 2;

//     for (let j = rows; j >= 1; j--) {
//       str += "*";
//     }

//     for (let k = 1; k <= spaceCount; k++) {
//       str += "-";
//     }

//     for (let l = rows; l >= 1; l--) {
//       str += "*";
//     }

//     console.log(str);
//   }
// };

// printUpside(5);

const multiplyBy5 = (num) => num * 5;
multiplyBy5.power = 2;
console.log(multiplyBy5(5));
console.log(multiplyBy5.power);
console.log(multiplyBy5.prototype);
