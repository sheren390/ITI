var input = window.prompt("Select a list type)" + "<br>" + "1 (bullet) , 2(numbered) , 3(lettered)");
if (input == 1) {
    document.write("<h1> Bullet List </h1>" + "<ul> <li>Shereen Gamil</li> <li>Mariam Hesham</li> <li>Haidi hany</li> </ul>");
}
else if (input == 2) {
    document.write("<h1> Numbered List </h1>" + "<h3><ol> <li>Shereen Gamil</li> <li>Mariam Hesham</li> <li>Haidi hany</li> </ol> </h3>");

}
else if (input == 3) {
    document.write("<h1> Lettered List </h1>" + "<ol type= A> <li>Shereen Gamil</li> <li>Mariam Hesham</li> <li>Haidi hany</li> </ol>");

}
else if (input < 1 || input > 3) {
    document.write("<h1> Sorry incorrect number! </h1>");
}
