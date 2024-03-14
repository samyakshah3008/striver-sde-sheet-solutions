function reverseNumber(str) {
  let updatedString = str
    .toString()
    .replace(/\s/g, "")
    .replace(/[^\w\s]|_/g, "")
    .toLowerCase();
  let reversedString = updatedString.split("").reverse().join("");
  let reversedStringToNumber = Number(reversedString);

  return reversedStringToNumber;
}

console.log(reverseNumber("123"));
