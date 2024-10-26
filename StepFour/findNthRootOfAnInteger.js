function findNthRootOfAnInteger(m, n) {
  let low = 1;
  let high = m;
  // m is an integer example 27, where n is nth root, for example 3
  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (Math.pow(mid, n) == m) return mid;
    else if (Math.pow(mid, n) < m) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }
  return -1;
}
