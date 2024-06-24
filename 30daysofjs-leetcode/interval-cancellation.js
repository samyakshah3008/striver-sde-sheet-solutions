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
