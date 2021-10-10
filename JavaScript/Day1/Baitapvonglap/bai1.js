let count =0
console.log(tongsole())
function tongsole(){
    for(var i=0; i< 100;i++) {
        if (i%2!=0) {
            count= count + i
        }
    }
    return count
}