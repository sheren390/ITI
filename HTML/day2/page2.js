var selection = document.getElementById("choosebrw");
var input = document.getElementById("favbrowser");
var option_num = document.createElement("option");
function add_bt() {
  option_num.value = input.value;
  option_num.text = input.value;
  selection.appendChild(option_num);
}

function remove_bt() {
  for (i = 0; i < selection.length; i++) {
    if (selection.options[i].value == selection.value) {
      selection.remove(i);
    }
  }
}
