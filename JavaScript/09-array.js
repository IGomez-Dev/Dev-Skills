
let myArray = []
let myArray2 = new Array()

console.log(myArray)
console.log(myArray2)

myArray = [3]
myArray2 = new Array(3)

console.log(myArray)
console.log(myArray2)

myArray = [1,2,3,4]
myArray2 = new Array(1,2,3,4)

console.log(myArray)
console.log(myArray2)

myArray = [1,'jefa',3.4,true]
myArray2 = new Array(1,'jefa',3.4,true)

console.log(myArray)
console.log(myArray2)

myArray2 = new Array(4)
myArray2[0] = 'Ivan'
myArray2[1] = 'David'
myArray2[2] = 'Gomez'
myArray2[3] = 'Pariona'
console.log(myArray2)

myArray = []
myArray[2] = 'Jefa'
myArray[1] = 'Alex'
console.log(myArray)

myArray = []
myArray.push("Ivan")
myArray.push("David")
myArray.push("Gomez")
console.log(myArray)

console.log(myArray.pop()) // lo elimina y devuelve el valor eliminado
myArray.pop()
console.log(myArray)

console.log(myArray.shift())
console.log(myArray)

myArray.unshift("IVAN", "GOMEZ")
console.log(myArray)

myArray = []
console.log(myArray)

myArray = [1,'jefa',3.4,true,12456876654465]
let newArray = myArray.slice(1,3)
console.log(newArray)

myArray = [1,'jefa',3.4,true,12456876654465]
myArray.splice(1,2,'Nueva entrada')
console.log(myArray)

console.log('----------------')

var greet = 'Hello '
var user = 'Ivan'

console.log(greet + user)
console.log(greet.concat(user))

console.log('----------------')

var test = typeof('what is this?')
var test2 = typeof({firstProperty: 1})
var test3 = typeof(function abc(){console.log('Hello')})

console.log(test)
console.log(test2)
console.log(test3)