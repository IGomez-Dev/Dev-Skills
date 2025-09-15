var assistantManager = {
  movement: 3,
  socialSkills: 30,
  streetSmarts:30,
  health: 40
}

assistantManager['favoriteColor'] = 'blue'
assistantManager.favoriteFood = 'pizza'
assistantManager.streetSmarts = 40

console.log(assistantManager)

var MyNum = Math.sqrt(144)
console.log(MyNum)

console.log('-------------------')

var car = {}

car.mileage = 9876500
car.color = 'blue'

console.log(car)

car.turnTheKey = function(edad) {
  console.log('engine running')
}

car.lightsOn = function() {
  console.log('lights on')
}

console.log(car)
car.turnTheKey()
car.lightsOn()