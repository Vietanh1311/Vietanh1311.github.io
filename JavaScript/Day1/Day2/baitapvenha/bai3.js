
let findMaxLengthElement = ["aba", "aa", "ad", "c", "vcds"]
let maxlength = 0
function findmaxlength(arr) {
    for (let i = 0; i < arr.length; i++) {
        if(maxlength < arr[i].length){
            maxlength = arr[i].length
        }
    }
    return maxlength
    
}
function printMaxLength(arr)  {
    findmaxlength(arr)
    for (let i = 0; i < arr.length; i++) {
        if(arr[i].length === maxlength){
            console.log(arr[i])
        }
    }

}

printMaxLength(findMaxLengthElement)