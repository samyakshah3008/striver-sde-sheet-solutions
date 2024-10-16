function lowerBound(arr, sizeOfArray, target) {
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

function UpperBound(arr, sizeOfArray, target) {
  let low = 0;
  let high = sizeOfArray - 1;
  let answer = sizeOfArray;

  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (arr[mid] > target) {
      answer = mid;
      high = mid - 1;
    } else {
      low = mid + 1;
    }
  }
  return answer;
}

let arr = [3, 5, 8, 15, 19];
let sizeOfArray = arr.length;
let target = 8;
let index = UpperBound(arr, sizeOfArray, target);
console.log(index, "index as answer");
