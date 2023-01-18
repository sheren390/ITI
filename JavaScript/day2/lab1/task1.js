function fn() {
    var myStr = document.getElementById("string_input").value; // source string
    var subString = document.getElementById("substring").value; //subString 
    var idx = document.getElementById("index").value;

    var frist_front = myStr.indexOf(subString);
    var last_first = myStr.lastIndexOf(subString);

    var frist_back = myStr.indexOf(subString,idx);
    var last_back = myStr.lastIndexOf(subString, idx);

    document.getElementById("demo1").innerHTML = frist_front;
    document.getElementById("demo2").innerHTML = last_first;
    document.getElementById("demo3").innerHTML = frist_back;
    document.getElementById("demo4").innerHTML = last_back;
}

// function subString (){
//     var str = document.getElementsById("string_input").value;
//     var str2 = document.getElementsById("substring").value;
//     var str3 = document.getElementsById("index").value;
//     var first_occ =
//     document.getElementById("demo").innerText = first_occ;
// }