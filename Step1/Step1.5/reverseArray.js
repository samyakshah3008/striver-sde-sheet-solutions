let array = [1, 2, 3, 4, 5];
let reversedArray = [];

const reverseArray = (arr, index = arr.length) => {
  if (reversedArray.length === arr.length) {
    return reversedArray;
  } else {
    reversedArray.push(arr[index - 1]);
    index--;
    return reverseArray(arr, index);
  }
};

console.log(reverseArray(array));
