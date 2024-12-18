const fs = require("fs");


let input = fs.readFileSync(0).toString().trim();

input = Number(input);

if(input >= 10 && input <= 20) {

    console.log("yes");
    
} else {

    console.log("no");

}
