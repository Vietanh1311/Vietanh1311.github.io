
let max = 0
let max2 =0
function checkMax2Numbers(arr){
    for(var i=0; i<arr.length; i++){
        if(arr[i] > max){
            max2=max
            max = arr[i]
        }
    }
    return max2
}
let max2Numbers = [2, 1, 3, 5, 6, 7, 8, 9]
console.log(checkMax2Numbers(max2Numbers))