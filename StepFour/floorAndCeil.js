function ceil(arr, sizeOfArray, target) {
  let low = 0;
  let high = sizeOfArray - 1;
  let answer = -1;

  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (arr[mid] >= target) {
      answer = arr[mid];
      high = mid - 1; // look over left side
    } else {
      low = mid + 1; // look on right side
    }
  }
  return answer;
}

function floor(arr, sizeOfArray, target) {
  let low = 0;
  let high = sizeOfArray - 1;
  let answer = -1;

  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    if (arr[mid] <= target) {
      answer = arr[mid];
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }

  return answer;
}

let sampleArray = [1, 4, 8, 18, 27, 36, 50];
let target = 20; // answer should be 18

console.log(floor(sampleArray, sampleArray.length, target));
