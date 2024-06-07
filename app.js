// let count = 1;
// const print1ToNUsingBacktrack = (endNumber) => {
//   if (count > endNumber) return;
//   count++;
//   print1ToNUsingBacktrack(endNumber);
//   console.log(count);
// };

// print1ToNUsingBacktrack(5);

// function memoize(fn) {
//   let cachedValue;
//   console.log(cachedValue);
//   return function (...args) {
//     cachedValue = fn(...args);
//     return cachedValue;
//   };
// }

// let callCount = 0;
// const memoizedFn = memoize(function (a, b) {
//   callCount += 1;
//   return a + b;
// });
// memoizedFn(2, 3); // 5
// memoizedFn(2, 3); // 5
// console.log(callCount); // 1

// const object = { a: "1", b: "2" };
// console.log(Object.keys(object).length, "here");
// const secondObj = [null];
// console.log(Object.keys(secondObj).length, "second obj");

// var isEmpty = function (obj) {
//   if (!Object.keys(obj).length) return true;
//   return false;
// };

function userCreator(name, score) {
  const newUser = {};
  newUser.name = name;
  newUser.score = score;
  newUser.increment = function () {
    newUser.score++;
  };

  return newUser;
}

const user1 = userCreator("Will", 3);
user1.increment();
const user2 = userCreator("Will2", 5);
console.log(user1.score);
console.log(user2.score);
