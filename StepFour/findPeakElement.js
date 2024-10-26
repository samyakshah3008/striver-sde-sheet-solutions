function findPeakElement(nums) {
  // peak element: arr[i-1] < arr[i] > arr[i+1]
  // brute force:
  for (let i = 0; i < nums.length; i++) {
    if (
      (i == 0 || nums[i] > nums[i - 1]) &&
      (i == nums.length - 1 || nums[i] > nums[i + 1])
    ) {
      return nums[i];
    }
  }

  // optimal approach:

  if (nums.length == 1) {
    return 0;
  }
  if (nums[0] > nums[1]) return 0;
  if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
  let low = 1;
  let high = nums.length - 2;

  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
    else if (nums[mid] > nums[mid - 1]) {
      // means - peak will be on the right side of mid, and current mid is in the increasing curve hence we can eliminate the left elements.
      low = mid + 1;
    } else if (nums[mid] > nums[mid + 1]) {
      // will eliminate right elements.
      high = mid - 1;
    } else {
      // in neither of above cases.
      low = mid + 1;
    }
  }
}

const arr = [1, 2, 3, 4, 5, 6, 7, 8, 5, 1];
console.log(findPeakElement(arr), "is the peak element");
