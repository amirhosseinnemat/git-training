let userOne = {
    name:'Saman',
    id:1287,
    role:'admin'
}

let userTwo = {
    name:'Jalal',
    id:7837,
    role:'employee'
}

let student = {
    name:'ali',
    family:'karimi',
    showInfo:function(){
        console.log(`name: ${this.name}
family: ${this.family}`)
    }
}

let showUser = function(user) {
    let res = `name : ${user.name} - id : ${user.id} - role : ${user.role}`
    console.log(res)
}

showUser(userOne)
showUser(userTwo)
student.showInfo()