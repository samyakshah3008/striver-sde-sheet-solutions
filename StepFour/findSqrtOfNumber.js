function findSqrtOfNumber(num) {
  let low = 0;
  let high = num;
  let ans = 1;
  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (mid * mid > num) {
      high = mid - 1;
    } else {
      ans = mid;
      low = mid + 1;
    }
  }
  return ans;
}

console.log(findSqrtOfNumber(37));
