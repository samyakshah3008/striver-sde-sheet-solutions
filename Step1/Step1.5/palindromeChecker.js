// iterative approach

const palindromeChecker = (string) => {
  let reverseString = "";
  for (let i = string.length - 1; i >= 0; i--) {
    reverseString = reverseString + string.charAt(i);
  }
  if (reverseString === string) {
    return true;
  } else {
    return false;
  }
};

console.log(palindromeChecker("racecar"));

// recursive approach
