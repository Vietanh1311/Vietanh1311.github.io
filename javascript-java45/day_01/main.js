function sayHello() {
    console.log("Xin chào");
}
sayHello()

function sayHello1(name, year) {
    console.log(`Xin chào ${name}. Năm nay ${2021 - year} tuổi`);
}

sayHello1("Nguyễn Văn A", 1995)

function sum(a = 10, b = 20) {
    let c = a + b
    return c 
}

let result = sum(3,4);
console.log(result);

console.log(sum(3));