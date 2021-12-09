//function with return

let sayHello = function(name) {
    return 'Hello, dear ' + name
}

//no diffrence between '' and ""
console.log(sayHello("Amir"))


//function with default argument
let sum = function(num1 = 20, num2 = 30) {
console.log('sum of ' + num1 + ' and ' + num2 + ' = ' + (num1+num2))
}

sum()

//template string, we can use it with ``

let showInfo = function(name,age) {
    console.log(`name : ${name} -
age : ${age}.`)
}

showInfo('ali',20)