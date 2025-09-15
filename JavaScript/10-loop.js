// For loop

for (var i = 1; i < 4; i++){
    console.log('For loop', i)
}

for (var k = 5; k > 0; k--){
    console.log('For loop decreciente', k)
}

// While loop
var j = 1
while (j < 7){
    console.log('While loop', j)
    j++
}

var counter = 3
while (counter > 0){
    console.log('While loop decreciente', counter)
    counter--
}

// Nested loops

for (var year = 2023; year <= 2025; year++){
    console.log(year)
    for (var month = 10; month <= 12; month++){
        console.log('---', month)
    }
}

console.log('------------------')


// Ejercicio 1
console.log('Ejercicio 1')

for (var i = 1; i < 11 ;i++){
    if (i == 1){
        console.log('Medalla de oro')
    } else if (i == 2){
        console.log('Medalla de plata')
    } else if (i == 3){
        console.log('Medalla de bronce')
    } else {
        console.log(i)
    }
}

console.log('------------------')

// Ejerccicio 2
console.log('Ejercicio 2')

for (var i = 1; i < 11 ;i++){
    switch (i) {
        case 1:
            console.log('Medalla de oro')
            break;
        case 2:
            console.log('Medalla de plata')
            break;
        case 3:
            console.log('Medalla de bronce')
            break;
        default:
            console.log(i)
    }
}