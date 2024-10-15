const fs = require("fs");

let input = fs.readFileSync(0).toString().trim().split(":")


let hour = Number(input[0]) + 1;

let minute = input[1];

console.log(hour+":"+minute);