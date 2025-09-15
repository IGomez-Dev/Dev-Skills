
// 1. Imprime por consola tu nombre si una variable toma su valor

let nom = 'ivan'

if (nom == 'ivan'){
    console.log(nom)
}

// 2. Imprime por consola un mensaje si el usuario y contraseña concide con unos establecidos

let contraseña = '12345'
let usuario = 'jefa'

if (contraseña == '12345' && usuario == 'jefa') {
    console.log(`La constraseña es ${contraseña}`)
}
// 3. Verifica si un número es positivo, negativo o cero e imprime un mensaje

let num = -2

if (num > 0) {
    console.log(`El número ${num} es positivo`)
} else if (num < 0) {
    console.log(`El número ${num} es negativo`)
} else {
    console.log(`El número es igual a ${num}`)
}

// 4. Verifica si una persona puede votar o no (mayor o igual a 18) e indica cuántos años le faltan

let edad = 20

if (edad >= 18) {
    console.log('La persona puede votar')
} else {
    console.log(`La persona no puede votar por ser menor de edad, le falta ${18 - edad} años`)
}

// 5. Usa el operador ternario para asignar el valor "adulto" o "menor" a una variable
//    dependiendo de la edad 

tipo = edad >= 18 ? 'adulto' : 'menor'
console.log(tipo)

// 6. Muestra en que estación del año nos encontramos dependiendo del valor de una variable "mes"

let mes = 'feb'

if (mes == 'mar' ||mes == 'abr' || mes == 'may') {
    console.log('La estación es otoño')
} else if (mes == 'jun' ||mes == 'jul' || mes == 'ago') {
    console.log('La estación es invierno')
} else if (mes == 'sep' ||mes == 'oct' || mes == 'nov') {
    console.log('La estación es primavera')
} else if (mes == 'dic' ||mes == 'ene' || mes == 'feb') {
    console.log('La estación es verano')
} else {
    console.log("Escribe bien el mes")
}

// 7. Muestra el número de días que tiene un mes dependiendo de la variable del ejercicio anterior

if (mes == 'feb') {
    console.log('28 o 29 días')
} else if (mes == 'ene' || mes == 'mar' || mes == 'may' || mes == 'jul' || mes == 'ago' || mes == 'oct' || mes == 'dic') {
    console.log('31 días')
} else if (mes == 'abr' || mes == 'jun' || mes == 'sep' || mes == 'nov') {
    console.log('30 días')
} else {
    console.log("Escribe bien el mes")
}

// switch

// 8. Usa un switch para imprimir un mensaje de saludo diferente dependiendo del idioma

let idioma = 4

switch (idioma) {
    case 0:
        console.log('Hola')
        break
    case 1:
        console.log('Hi')
        break
    case 2:
        console.log('Bonjour')
        break
    case 3:
        console.log('Hallo')
        break
    case 4:
        console.log('Ciao')
        break
}

// 9. Usa un switch para hacer de nuevo el ejercicio 6

// 10. Usa un switch para hacer de nuevo el ejercicio 7