
// Aritméticos
let a = 5
let b = 2
console.log(a + b)
console.log(a - b)
console.log(a * b)
console.log(a / b)
console.log(a % b)
console.log(a ** b)
a++
console.log(a)
b--
console.log(b)

// Asignación
console.log('------------------------------')
let myVar = 2
console.log(myVar)
myVar += 2
console.log(myVar)
myVar -= 2
myVar *= 2
myVar /= 2
myVar %= 2
myVar **= 2

// Comparación
console.log('------------------------------')
console.log(a > b)
console.log(a < b)
console.log(a >= b)
console.log(a <= b)
console.log('------------')
console.log(a == a) // Igualdad por valor
console.log(a == 6) // Igualdad por valor
console.log(a == '6') // Igualdad por valor
console.log('------------')
console.log(a === a) // Igualdad por identidad
console.log(a === 6) // Igualdad por identidad
console.log(a === '6') // Igualdad por identidad
console.log('------------')
console.log(a != 6)
console.log(a !== '6')
console.log('------------')
console.log(0 == false)
console.log(1 == false)
console.log(2 == false)

// Operadores lógicos
console.log('------------------------------')
console.log(5 > 10 && 15 > 20)
console.log(5 < 10 && 15 < 20)
console.log(5 < 10 && 15 > 20)

console.log('------------')
console.log(5 > 10 || 15 > 20)
console.log(5 < 10 || 15 < 20)
console.log(5 < 10 || 15 > 20)

console.log('------------')
console.log(!(5 > 10 || 15 > 20))
console.log(!(5 > 10 && 15 > 20))

// Operadores ternarios
const isRaining = false

isRaining ? console.log("Esta lluviendo") : console.log("No esta lluviendo")