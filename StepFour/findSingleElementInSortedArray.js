function findSingleElementInSortedArray(nums) {
  if (nums.length == 1) return nums[0];

  if (nums[0] !== nums[1]) {
    return nums[0];
  }
  if (nums[nums.length - 1] !== nums[nums.length - 2]) {
    return nums[nums.length - 1];
  }

  // trim down search space;
  let low = 1;
  let high = nums.length - 2;

  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    console.log(mid, "mid");
    if (nums[mid] !== nums[mid - 1] && nums[mid] !== nums[mid + 1]) {
      return nums[mid];
    }

    // identify we are on which half of the single element, once identified and if we are not able to find single element, then we will eliminate

    // (even, odd) -> means we are on left side of single element
    // (odd, even) -> means we are on right side of single element
    if (mid % 2 === 1 && nums[mid] === nums[mid - 1]) {
      low = mid + 1;
    } else if (mid % 2 === 0 && nums[mid] === nums[mid + 1]) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
    // if (
    //   (nums[mid] % 2 === 1 && nums[mid] === nums[mid - 1]) ||
    //   (nums[mid] % 2 === 0 && nums[mid] === nums[mid + 1])
    // ) {
    //   low = mid + 1;
    // } else {
    //   high = mid - 1;
    // }
  }
}

let array = [1, 1, 2, 3, 3, 4, 4, 8, 8];
console.log(findSingleElementInSortedArray(array));
