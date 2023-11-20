const result = document.querySelector(".result");

function eva(val) {
  //values are combined together
  result.value += val;
}

//Evaluates the final result
function eq() {
  let equat = eval(result.value);
  result.value = equat;
}

//clear everything
function reset(){
  result.value=""
}


