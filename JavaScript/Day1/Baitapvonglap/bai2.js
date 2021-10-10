let count = 0
console.log(tongso3va5())
function tongso3va5(){
    for(var i=0; i< 100;i++) {
        if (i%3==0 && i%5==0) {
            count= count + i
        }
    }
    return count
}