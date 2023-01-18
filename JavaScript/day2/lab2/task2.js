function fn() {
    var myStr = document.getElementById("sentence").value; // source sentence
    var spliter = document.getElementById("spliter").value; //subString spliter

    var splitWords = myStr.split(spliter);
    var subString = myStr.substring(0,10);

    for(i=0 ; i<splitWords.length ; i++){

    let child = document.createElement("div");
    child.innerHTML=splitWords[i];
    document.getElementById("demo").appendChild(child);

}
    document.getElementById("demo2").innerHTML = subString;
}