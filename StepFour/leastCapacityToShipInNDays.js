const weight = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const days = 5;

const leastCapacityToShipInNDays = (weightArr, days, sum) => {
  // brute force approach
  for (let capacity = weightArr.length - 1; capacity <= sum; capacity++) {
    const requiredDays = findRequiredDays(weightArr, capacity);
    console.log(requiredDays, "required days");
    if (requiredDays <= days) {
      return capacity; // will be least
    }
  }
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
      load = weight[i];
    } else {
      load += weight[i];
    }
  }

  return requiredDays;
};

leastCapacityToShipInNDays(weight, days, findSumOfWeight(weight));
