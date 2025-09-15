
let a = 20
let b = 20

if (a > b){
    console.log('Hola mundo')
} else if (a == b){
    console.log('Solo mundo')
} else {
    console.log('Adios mundo')
}

// Operador terniario

const message = a > b ? "Hola mundo" : "Adios mundo"
console.log(message)

// Switch

let day = 4
let dayName

switch (day) {
    case 0:
        dayName = "Lunes"
        break
    case 1:
        dayName = "Martes"
        break
    case 2:
        dayName = "Miercoles"
        break
    case 3:
        dayName = "Jueves"
        break
    case 4:
        dayName = "Viernes"
        break
    case 5:
        dayName = "Sabado"
        break
    case 6:
        dayName = "Domingo"
        break
}

console.log(dayName)