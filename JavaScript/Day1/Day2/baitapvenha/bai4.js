
////////////////////////////////
let str = Case('chÀo MừnG đẾn với techMaster')

function Case(str) {
    let sentence = str.toLowerCase().split(" ");
    for(var i = 0; i< sentence.length; i++){
        sentence[i] = sentence[i][0].toUpperCase() + sentence[i].slice(1);
     }
     //3. Nối các từ, cụm từ đã xử lý ở trên và trả về kết quả
     return sentence.join(" ");
}

console.log(Case(str))
console.log(Case('hà nội việt nam'));