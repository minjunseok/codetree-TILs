const fs = require("fs");


let input = fs.readFileSync(0).toString().trim().split("\n");

let [a , b] = input[0].split(" ").map(Number);

let [c , d] = input[1].split(" ").map(Number);


    console.log(a > c && b > d ? 1 : 0);
