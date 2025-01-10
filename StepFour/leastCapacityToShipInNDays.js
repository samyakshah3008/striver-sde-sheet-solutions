const weight = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const days = 5;

const leastCapacityToShipInNDays = (weightArr, days, sum) => {
  // brute force approach
  for (let capacity = weightArr.length - 1; capacity <= sum; capacity++) {
    const requiredDays = findRequiredDays(weightArr, capacity);
    if (requiredDays <= days) {
      return capacity; // will be least
    }
  }
};

const optimizedLeastCapacityToShipInNDays = (weights, days, sum) => {
  let low = Math.max(...weights);
  let high = sum;

  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    let numberOfDays = findRequiredDays(weights, mid);
    if (numberOfDays <= days) {
      high = mid - 1;
    } else {
      low = mid + 1;
    }
  }
  return low; // least capacity
};

const findSumOfWeight = (weightArr) => {
  return weightArr.reduce((curr, acc) => curr + acc, 0);
};

const findRequiredDays = (weightArr, capacity) => {
  let requiredDays = 1;
  let load = 0;

  for (let i = 0; i <= weightArr.length - 1; i++) {
    if (load + weightArr[i] > capacity) {
      requiredDays = requiredDays + 1;
      load = weightArr[i];
    } else {
      load += weightArr[i];
    }
  }

  return requiredDays;
};

optimizedLeastCapacityToShipInNDays(weight, days, findSumOfWeight(weight));
