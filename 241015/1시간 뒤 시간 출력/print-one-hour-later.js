// 내 답

// const fs = require("fs");

// let input = fs.readFileSync(0).toString().trim().split(":")


// let hour = Number(input[0]) + 1;

// let minute = input[1];

// console.log(hour+":"+minute);


//코드트리 해설 답


const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split(":");

let h = Number(input[0]);

let m = Number(input[1]);

console.log(`${h + 1}:${m}`);