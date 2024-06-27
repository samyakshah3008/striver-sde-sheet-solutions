var timeLimit = (fn, t) => {
  return async (...args) => {};
};

const t = 50;
const fn = async (n) => {
  await new Promise((res) => setTimeout(res, 100));
  return n * n;
};

const limited = timeLimit(fn, t);
const start = performance.now();
let result;
let inputs = [5];
try {
  const res = await limited(...inputs);
  result = { resolved: res, time: Math.floor(performance.now() - start) };
} catch (err) {
  result = { rejected: err, time: Math.floor(performance.now() - start) };
}
console.log(result); // Output
