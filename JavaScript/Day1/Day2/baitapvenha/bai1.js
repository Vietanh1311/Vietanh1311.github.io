
//
function checkElementExist(arr,a){
    for(var i=0;i<arr.length;i++) {
        if (arr[i]==a) {
            return true;
        }
    }
    return false;
}

let  ElementExist= [1,2,3,4]
console.log(checkElementExist(ElementExist,5))
