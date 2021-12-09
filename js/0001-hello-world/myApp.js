// console.log print anything , and for printing string we can use '' or "" ,there is no diffrence
console.log("Hello, world")


// let is a variable keyword
let firstName = 'Amir'
let lastName = 'Hosseinnemat'
let fullName = firstName + ' ' + lastName
console.log(fullName)


//local vs global variable

//global
let condition = true;

if(condition) {
    //local
    let text = 'ok'
    console.log(text)
}


console.log(condition)