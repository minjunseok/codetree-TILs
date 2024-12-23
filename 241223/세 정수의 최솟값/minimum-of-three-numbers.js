const fs = require("fs");


let input = fs.readFileSync(0).toString().trim().split(" ");

let a = Number([input[0]]);

let b = Number([input[1]]);

let c = Number([input[2]]);




if(a >= b && b > c) {

    console.log(c);


} else if(a >= c && c > b) {

    console.log(b);

} else if (b >= c && c >= a){

    console.log(a);


} else if(b >= a && a >= c) {

    console.log(c);

} else if(c >= a && a >= b) {

    console.log(b);

} else if(c >= b && b >= a) {

    console.log(a);

}