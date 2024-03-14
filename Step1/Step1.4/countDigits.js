const countDigits = (userInput) => {
  let updatedUserInput = userInput.toString().replace(/\s/g, "").toLowerCase();
  return updatedUserInput.length;
};

console.log(countDigits("12345"));
