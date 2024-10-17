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
let target2 = 1;
let finalAnswer = optimizedFindFirstAndLastOccurenceInArray(
  sampleArray2,
  sampleArray2.length,
  target2
);

function countOccurence(array) {
  if (array[0] == -1) {
    return 0;
  } else {
    let count = array[1] - array[0] + 1;
    return count;
  }
}

let occurenceCount = countOccurence(finalAnswer);
console.log(occurenceCount, "occurence count");
