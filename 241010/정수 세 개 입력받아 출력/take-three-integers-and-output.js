// 나의 코드 

// const fs = require("fs");

// let input = fs.readFileSync(0).toString().split(/\s+/);


// let a = Number(input[0]);

// let b = Number(input[1]);

// let c = Number(input[2]);

// console.log(a,b,c);


const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split("\n");

let arr = input[0].split(" ");
let a = Number(arr[0]);
let b = Number(arr[1]);
let c = Number(input[1]);


console.log(a, b, c);