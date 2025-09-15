
// 1. Concatena dos cadenas de texto

let string1 = "Hola "
let string2 = "Mundo"
let string3 = string1 + string2
console.log(string3)

// 2. Muestra la longitud de una cadena de texto

console.log(string3.length)

// 3. Muestra el primer y último carácter de un string

console.log(string3[0])
console.log(string3[9])

// 4. Convierte a mayúsculas y minúsculas un string

console.log(string3.toUpperCase())
console.log(string3.toLowerCase())

// 5. Crea una cadena de texto en varias líneas

let string4 = `String
de varias
lineas`
console.log(string4)

// 6. Interpola el valor de una variable en un string

string5 = 'JavaScript'
console.log(`Aprendiendo ${string5}`)

// 7. Reemplaza todos los espacios en blanco de un string por guiones

console.log(string3.replace(" ", "-"))

// 8. Comprueba si una cadena de texto contiene una palabra concreta

console.log(string3.includes("Ivan"))

// 9. Comprueba si dos strings son iguales

console.log(string1 == string2)

// 10. Comprueba si dos strings tienen la misma longitud

console.log(string1.length == string2.length)
