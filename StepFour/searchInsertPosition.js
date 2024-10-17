function searchInsertPosition(arr, sizeOfArray, target) {
  let low = 0;
  let high = sizeOfArray - 1;
  let answer = sizeOfArray;

  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (arr[mid] >= target) {
      answer = mid;
      high = mid - 1; // look over left side
    } else {
      low = mid + 1; // look on right side
    }
  }
  return answer;
}
