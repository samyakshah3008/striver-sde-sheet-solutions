function searchInRotatedSortedArrayWithDuplicates(arr, sizeOfArray, target) {
  let low = 0;
  let high = sizeOfArray - 1;
  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (arr[mid] == target) return true;
    // check for edge case

    if (arr[mid] == arr[low] && arr[mid == arr[high]]) {
      low = low + 1;
      high = high - 1;
      continue;
    }

    // now, start to find sorted half.
    // check if left half is sorted
    if (arr[low] <= arr[mid]) {
      if (arr[low] <= target && target <= arr[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    // right half will be sorted
    else {
      if (arr[mid] <= target && target <= arr[high]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
  }
  return false;
}

let arr = [4, 5, 6, 7, 0, 1, 2];
let sizeOfArray = arr.length;
let target = 0;

const index = searchInRotatedSortedArrayWithDuplicates(
  arr,
  sizeOfArray,
  target
);
console.log(index, "indexx");
