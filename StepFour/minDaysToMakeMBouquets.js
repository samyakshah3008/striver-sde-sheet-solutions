function isPossible(array, day, m, k) {
  let count = 0;
  let noOfBouquets = 0;

  for (let i = 0; i < array.length; i++) {
    if (array[i] <= day) {
      count++;
    } else {
      noOfBouquets = noOfBouquets + Math.floor(count / k);
      count = 0;
    }
  }

  noOfBouquets = noOfBouquets + Math.floor(count / k);

  if (noOfBouquets >= m) {
    return true;
  } else {
    return false;
  }
}

var minDays = function (bloomDay, m, k) {
  if (bloomDay?.length < m * k) {
    return -1;
  }

  let mini = Infinity;
  let maxi = -Infinity;
  for (let i = 0; i < bloomDay; i++) {
    mini = Math.min(mini, bloomDay[i]);
    maxi = Math.max(maxi, bloomDay[i]);
  }

  // for (let i = mini; i <= maxi; i++) {
  //   if (isPossible(bloomDay, i, m, k)) return i;
  // }

  let low = mini;
  let high = maxi;
  let answer = -1;

  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (isPossible(bloomDay, mid, m, k)) {
      answer = mid;
      high = mid - 1;
    } else {
      low = mid + 1;
    }
  }

  // return -1;
  return answer;
};

let bloomDay = [1, 10, 3, 10, 2];
let m = 3;
let k = 1;

console.log(minDays(bloomDay, m, k));
