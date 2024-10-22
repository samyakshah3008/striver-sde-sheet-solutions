function findMinimumInRotatedSortedArray(nums, target) {
  let low = 0;
  let high = nums.length - 1;
  let answer = Number.MAX_VALUE;
  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    // left is sorted check
    if (nums[low] <= nums[mid]) {
      answer = Math.min(answer, nums[low]);
      low = mid + 1;
    }
    // right is sorted check
    else {
      answer = Math.min(answer, nums[mid]);
      high = mid - 1;
    }
  }
  return answer;
}
