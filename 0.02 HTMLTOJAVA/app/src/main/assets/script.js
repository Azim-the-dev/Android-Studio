function sendData() {
    var username = document.getElementById("username").value;
    AndroidInterface.sendDataToJava(username);
}