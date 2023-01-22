var selection = document.getElementById("choosebrw");
var option_num = document.createElement("option");
function add() {
  var input = document.getElementById("favbrowser");
  option_num.value = input.value;
  option_num.text = input.value;
  selection.appendChild(option_num);
}

function Delete() {
  for (i = 0; i < selection.length; i++) {
    if (selection.options[i].value == selection.value) {
      selection.remove(i);
    }
  }
}
