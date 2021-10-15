///
let result = "Hello"

function reverse(str){
    arr = str.split("")
    var arrreverse = arr.reverse()
    var newarr = arrreverse.join("")
    return newarr
}

console.log(reverse(result))