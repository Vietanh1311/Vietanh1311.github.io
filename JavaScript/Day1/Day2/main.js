//câu1
// let checkAscArr = [0,3,5,9]
// console.log(check(checkAscArr))
// function check( arr){
//     for (var i =0; i< checkAscArr.length; i++) {
//         if(checkAscArr[i] > checkAscArr[i+1]) {
//             return false;
//         }
//     }
//     return true;
    
// }

//câu3

// function check(arr){
//     for (var i =0; i < arr.length; i++) {
//         if(arr[i] > arr[i+1] || arr[i]%2 != 0) {
//             return false;
//         }
//     }
//     return true;
    
// }
// let checkAscArr = [0,2,4,10,12]
// console.log(check(checkAscArr))

//câu6
// let checkAscArr = [9,2,4,1]
// console.log(check(checkAscArr))
// function check( arr){
//     let min=checkAscArr[0]
//     for (var i =0; i< checkAscArr.length; i++) {
//         if(checkAscArr[i]<min) {
//             min=checkAscArr[i]
//         }
//     }
//     return min;
    
// }

//câu 7

let checkAscArr = [4,2,5,6,2,7]
function check(arr) {
    for(let i=0; i<arr.length; i++){
        arr[i] = arr[i]%2
    }
    return arr
}
console.log(check(checkAscArr))
