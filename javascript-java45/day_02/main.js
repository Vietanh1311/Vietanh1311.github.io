/*
-- Array

let arr = [];
arr[0] = 1;
arr[1] = "Hello";
arr[2] = true;

console.log(arr);

let arr1 = arr
arr1[0] = 10

console.log(arr1);
console.log(arr);

let number = [1,2,3,4]
let number1 = [5,6,7]

number + number1 => [1,2,3,45,6,7]

console.log(number + number1);
console.log(typeof(number + number1));


console.log(number.length);
console.log(number[number.length - 1]);

Làm rỗng 1 mảng
number = []

number.length = 0
*/

// Các phương thức trên mảng
// push, pop, shift, unshift, splice

// push : thêm 1 phần tử vào cuối mảng
let number = [1,2,3,4]
let a = number.push(10)

console.log(number);
console.log(a);

// pop : Xóa phần tử ở cuối mảng
let b = number.pop()
console.log(number);
console.log(b);

// Splice : Vừa thêm, vừa xóa phần tử

// Chỉ thêm
number.splice(1, 0, 10, 11, 12)
console.log(number);

// Chỉ xóa
number.splice(2, 2)
console.log(number);

// Vừa thêm vừa xóa
number.splice(2, 1, 20, 30);
console.log(number);

function findMaxNumberArr(arr) {
    let max = arr[0]
    for (let i = 0; i < arr.length; i++) {
        if(max < arr[i]) {
            max = arr[i]
        }
    }
    return max
}

function findMaxNumberArr2(arr) {
    return Math.max(...arr) // spread operator ES6
}

// console.log(findMaxNumberArr([4,2,5,6]));
// console.log(findMaxNumberArr2([4,2,5,7]));


function practice07(arr) {
    let newArr = []
    for (let i = 0; i < arr.length; i++) {
        newArr.push(arr[i] % 2)
    }
    return newArr
}
console.log(practice07([1, 2, 3, 4, 4]))

function practice07_01(arr) {
    // phương thức map
    return arr.map(function(element) {
        return element % 2
    })
}

console.log(practice07_01([1, 2, 3, 4, 4]))

// Function bình thường
function sum(a,b) {
    return a + b
}

// ES6 : Arrow function
let sum_01 = (a, b) => {
    // Code xử ly trong function
    return a + b
}

let sum_02 = (a, b) => a + b

console.log(sum(3,4));
console.log(sum_01(3,4));
console.log(sum_02(3,4));

function repeatString(str) {
    let newArr = []
    for (let i = 0; i < 10; i++) {
        newArr.push(str)
    }
    return newArr.join("")
}

console.log(repeatString("a"));