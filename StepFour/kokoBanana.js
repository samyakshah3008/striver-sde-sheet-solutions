function findMaxElement(array) {
  let maxElement = 0;
  for (let i = 0; i < array.length; i++) {
    if (array[i] > maxElement) {
      maxElement = array[i];
    }
  }
  return maxElement;
}

function findTotalHours(array, hourly) {
  let totalHours = 0;
  for (let i = 0; i < array.length; i++) {
    totalHours = totalHours + Math.ceil(array[i] / hourly);
  }

  return totalHours;
}

var minEatingSpeed = function (piles, h) {
  let answer;
  let low = 1;
  let high = findMaxElement(piles);

  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    let totalHours = findTotalHours(piles, mid);
    if (totalHours > h) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }

  return low;
};

const piles = [30, 11, 23, 4, 20];
const h = 6;

console.log(minEatingSpeed(piles, h));
