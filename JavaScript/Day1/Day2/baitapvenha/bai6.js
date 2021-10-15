function checkSymmetricString(str) {
  let a = str.toLowerCase().replace(" ", "");
  for (let i = 0; i < a.length / 2; i++) {
      if (a.charAt(i) !== a.charAt(a.length - 1 - i)) {
          return false;
      }
  }
  return true;
}
console.log(checkSymmetricString("Race car"));
console.log(checkSymmetricString("hello world"));