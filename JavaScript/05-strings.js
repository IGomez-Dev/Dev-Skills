
// Strings


// Concatenación 
let myName = "Ivan"
let saludo = "Hola, " + myName
console.log(saludo)

// Longitud
console.log(saludo.length)

// Acceso
console.log(saludo[0])

// Métodos
console.log(saludo.toUpperCase())
console.log(saludo.toLowerCase())
console.log(saludo.indexOf("Ivan"))
console.log(saludo.indexOf("Fiorella"))
console.log(saludo.includes("Ivan"))
console.log(saludo.includes("Fiorella"))
console.log(saludo.slice(2,9))
console.log(saludo.replace("Ivan", "Ivancito"))

// Plantillas literales

let message = `Hola, este es mi 
curso de JavaScript`

let email = 'ivangp122004@gmail.com'

console.log(message)
console.log(`Hola, ${myName} y mi email es ${email}`)