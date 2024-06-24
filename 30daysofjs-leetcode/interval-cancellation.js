// Given a function fn, an array of arguments args, and an interval time t, return a cancel function cancelFn.

// After a delay of cancelTimeMs, the returned cancel function cancelFn will be invoked.

// setTimeout(cancelFn, cancelTimeMs)
// The function fn should be called with args immediately and then called again every t milliseconds until cancelFn is called at cancelTimeMs ms.

// Input: fn = (x) => x * 2, args = [4], t = 35
// Output:
// [
//    {"time": 0, "returned": 8},
//    {"time": 35, "returned": 8},
//    {"time": 70, "returned": 8},
//    {"time": 105, "returned": 8},
//    {"time": 140, "returned": 8},
//    {"time": 175, "returned": 8}
// ]
// Explanation:
// const cancelTimeMs = 190;
// const cancelFn = cancellable((x) => x * 2, [4], 35);
// setTimeout(cancelFn, cancelTimeMs);

// Every 35ms, fn(4) is called. Until t=190ms, then it is cancelled.
// 1st fn call is at 0ms. fn(4) returns 8.
// 2nd fn call is at 35ms. fn(4) returns 8.
// 3rd fn call is at 70ms. fn(4) returns 8.
// 4th fn call is at 105ms. fn(4) returns 8.
// 5th fn call is at 140ms. fn(4) returns 8.
// 6th fn call is at 175ms. fn(4) returns 8.
// Cancelled at 190ms

// wrong approach
// console.log("hello");
// const cancellable = (fn, args, t) => {
//   let shouldCancel = false;
//     setInterval(() => {
//       fn(...args);
//     }, t);
//   setTimeout(() => {
//     shouldCancel = true;
//   }, 190);
//   console.log(shouldCancel);
// };

// const sum = (a, b) => {
//   console.log("function called, returned: ", a + b);
//   return a + b;
// };

// console.log(cancellable(sum, [5, 5], 35));

// right approach but that's not how asked in Question

// const cancellable = (fn, args, t) => {
//   let id = setInterval(() => {
//     return fn(...args);
//   }, t);
//   setTimeout(() => {
//     clearInterval(id);
//   }, 190);

//   return fn(...args);
// };

// const sum = (a, b) => {
//   return a + b;
// };

// cancellable(sum, [5, 5], 35);

// right approach exactly how asked

const cancellable = (fn, args, t) => {
  fn(...args);
  let id = setInterval(() => {
    return fn(...args);
  }, t);
  let cancelFn = () => {
    clearInterval(id);
  };
  return cancelFn;
};

const sum = (a, b) => {
  console.log(a + b);
  return a + b;
};

const cancelTimeMs = 190;
let cancelFn = cancellable(sum, [5, 5], 35);
setTimeout(cancelFn, cancelTimeMs);
