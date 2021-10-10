let min = 5
let max = 10
console.log(randomNumber(min, max))
function randomNumber(min, max) {
    return Math.floor(Math.random() * (max - min)) + min;
}