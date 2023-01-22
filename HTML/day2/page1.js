function newPage(){
    var password = document.getElementById("password");
    var conPassword = document.getElementById("ConfirmPass");
    if(password.value != conPassword.value)
        alert("Passwords don't match!");
        // confirm("your password incorrect")
    else {  
    var myWin = window.open();
    var Username = document.getElementById("Username").value;
    var Name = document.getElementById("Name").value;
    var BDate = document.getElementById("BDate").value;
    var FavColor = document.getElementById("FavColor").value;
    var browserr = document.getElementById("browserr").value;
    var no_Emp = document.getElementById("no.Emp").value;
    var email = document.getElementById("email").value;
    var phone = document.getElementById("phone").value;

    myWin.document.write("your username is:" + Username + "<br>" );
    myWin.document.write("your Name is:" + Name  + "<br>");
    myWin.document.write("your Birthdate is:" + BDate+ "<br>" );
    myWin.document.write("your Fav Color is:" + FavColor + "<br>" );
    myWin.document.write("your browser is:" + browserr );
    myWin.document.write("your No. of Employees is:" + no_Emp + "<br>");
    myWin.document.write("your username is:" + email + "<br>");
    myWin.document.write("your username is:" + phone + "<br>");
    myWin.document.body.style.fontSize = "1.7rem"
}
}