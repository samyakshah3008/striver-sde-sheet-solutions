function findHowManyTimesArrayIsRotated(nums) {
  let low = 0;
  let high = nums.length - 1;
  let answer = Number.MAX_VALUE;
  let index = -1;
  while (low <= high) {
    let mid = Math.floor((low + high) / 2);

    // If search space is already sorted,
    // then arr[low] will always be
    // the minimum in that search space:

    if (nums[low] <= nums[high]) {
      if (nums[low] < answer) {
        index = low;
        answer = nums[low];
      }
      break;
    }

    // left is sorted check
    if (nums[low] <= nums[mid]) {
      if (nums[low] < answer) {
        index = low;
        ans = arr[low];
      }
      low = mid + 1;
    }
    // right is sorted check
    else {
      if (nums[mid] < answer) {
        index = mid;
        ans = arr[mid];
      }
      high = mid - 1;
    }
  }
  return index;
}

const arr = [3, 4, 5, 1, 2];
console.log(findHowManyTimesArrayIsRotated(arr));
