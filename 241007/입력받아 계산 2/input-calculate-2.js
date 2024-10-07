const fs = require("fs");


// 내가 적은 정답

// let a = fs.readFileSync(0).toString();

// let arr = a.split(" ");



// console.log(arr[0] * arr[1]);



// 문자열을 특정 기준으로 잘라주는 함수 잘려나간 단위가 하나의 원소가 되어 
// 원소들의 값을 가진 하나의 배열이 만들어진다.
let input = fs.readFileSync(0).toString().split(" ");

let a = Number(input[0]);

let b = Number(input[1]);

console.log(a * b);