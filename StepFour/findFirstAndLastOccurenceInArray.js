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

let arr = [3, 5, 7, 15, 19];
let sizeOfArray = arr.length;
let target = 8;

function findFirstAndLastOccurenceInArray(arr, sizeOfArray, target) {
  let lb = lowerBound(arr, sizeOfArray, target);
  if (lb == sizeOfArray || arr[lb] != target) return [-1, -1];
  let ub = UpperBound(arr, sizeOfArray, target);
  return [lb, ub - 1];
}

let answer = findFirstAndLastOccurenceInArray(arr, sizeOfArray, target);
// console.log(answer, "answer");

// optimized approach

function findFirstOrLastOccurenceBinarySearch(
  arr,
  sizeOfArray,
  target,
  isFirst
) {
  let low = 0;
  let high = sizeOfArray - 1;
  let answer = -1;
  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (arr[mid] == target) {
      answer = mid;
      if (isFirst) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    } else if (arr[mid] < target) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }
  return answer;
}

// function findLastOccurenceBinarySearch(arr, sizeOfArray, target) {
//   let low = 0;
//   let high = sizeOfArray - 1;
//   let answer = -1;
//   while (low <= high) {
//     let mid = Math.floor((low + high) / 2);
//     if (arr[mid] == target) {
//       answer = mid;
//       low = mid + 1;
//     } else if (arr[mid] < target) {
//       low = mid + 1;
//     } else {
//       high = mid - 1;
//     }
//   }
//   return answer;
// }

function optimizedFindFirstAndLastOccurenceInArray(arr, sizeOfArray, target) {
  let firstOccurence = findFirstOrLastOccurenceBinarySearch(
    arr,
    sizeOfArray,
    target,
    true
  );
  if (firstOccurence == -1) return [-1, -1];
  let lastOccurence = findFirstOrLastOccurenceBinarySearch(
    arr,
    sizeOfArray,
    target,
    false
  );
  return [firstOccurence, lastOccurence];
}

let sampleArray2 = [1, 2, 2, 3, 4, 4, 4, 4, 5, 6];
let target2 = 4;
let finalAnswer = optimizedFindFirstAndLastOccurenceInArray(
  sampleArray2,
  sampleArray2.length,
  target2
);
console.log(finalAnswer, "final answer");
