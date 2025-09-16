
// function Btn() {
//   const clickHandler = () => console.log('Clicked')
//   return (
//     <button onClick={clickHandler}>
//       Click me
//     </button>
//   )
// }

// export default Btn

function Btn() {
  const clickHandler = () => console.log('mouse over')
  return (
    <button onMouseOver={clickHandler}>
      Click me
    </button>
  )
}

export default Btn

// En la linea 16 se puede cambiar por
// function() {console.log('mouse over')}
