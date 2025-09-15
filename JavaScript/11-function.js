
function add(a, b){
  var c = a + b
  console.log(c) 
}

add(2,2)
add(2,4)

console.log('------------------')

function letterFinder(word, match) {
  for (let i = 0; i < word.length; i++) {
    if (word[i] == match) {
      console.log('Found the', match, 'at', i)
    } else {
      console.log('--No match found at', i)
    }
  }
}

letterFinder('test', 't')