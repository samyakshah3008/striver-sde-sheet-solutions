// Given an array arr and a chunk size size, return a chunked array.

// A chunked array contains the original elements in arr, but consists of subarrays each of length size. The length of the last subarray may be less than size if arr.length is not evenly divisible by size.

// You may assume the array is the output of JSON.parse. In other words, it is valid JSON.

// Please solve it without using lodash's _.chunk function.

// Example 1:

// Input: arr = [1,2,3,4,5], size = 1
// Output: [[1],[2],[3],[4],[5]]
// Explanation: The arr has been split into subarrays each with 1 element.

// brute force approach
// const chunk = (arr, size) => {
//   let tempArray = arr;
//   let chunkedArray = [];
//   let iterationCount = Math.ceil(tempArray.length / size);
//   // console.log(iterationCount, "count");
//   // let initialCount = 0
//   // for(let i=1; i<= iterationCount; i++){
//   //   for(initialCount; initialCount< size; initialCount++){
//   //     chunkedArray.push([arr])
//   //   }
//   // }
//   // chunkedArray.push([arr[0], arr[1]]);
//   // chunkedArray.push([arr[2], arr[3]]);
//   // chunkedArray.push([arr[4]]);
//   // console.log(chunkedArray);
//   // return chunkedArray;
//   let spliceStart = 0;
//   let spliceEnd = size;
//   for (let i = 1; i <= iterationCount; i++) {
//     chunkedArray.push(tempArray.splice(spliceStart, spliceEnd));
//   }
//   return chunkedArray;
// };

// const arr = [1, 2, 3, 4, 5, 6];
// const size = 3;

// console.log(chunk(arr, size));

// optimized approach

const chunk = (arr, size) => {
  let chunkedArray = [];
  for (let i = 0; i < arr.length; i += size) {
    chunkedArray.push(arr.slice(i, i + size));
  }
  return chunkedArray;
};

const arr = [1, 2, 3, 4, 5, 6];
const size = 3;

console.log(chunk(arr, size));
