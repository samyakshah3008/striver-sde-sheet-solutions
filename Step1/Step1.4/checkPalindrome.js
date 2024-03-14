function isPalindrome(str) {
  let updatedString = str
    .replace(/\s/g, "")
    .replace(/[^\w\s]|_/g, "")
    .toLowerCase();
  let sortedString = updatedString.split("").reverse().join("");
  if (sortedString === updatedString) {
    return true;
  } else {
    return false;
  }
}

console.log(isPalindrome("Nan"));
