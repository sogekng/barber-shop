 
function checar(number){

    document.getElementById("number"+number).style.backgroundColor = "#E76642";
    document.getElementById("number"+number).style.color = "#232227";
}

function startTime(){
    var weekday = new Array();
    weekday[0] =  "Sunday";
    weekday[1] = "Monday";
    weekday[2] = "Tuesday";
    weekday[3] = "Wednesday";
    weekday[4] = "Thursday";
    weekday[5] = "Friday";
    weekday[6] = "Saturday";
    var month = new Array();
    month[0] = "January";
    month[1] = "February";
    month[2] = "March";
    month[3] = "April";
    month[4] = "May";
    month[5] = "June";
    month[6] = "July";
    month[7] = "August";
    month[8] = "September";
    month[9] = "October";
    month[10] = "November";
    month[11] = "December";
    var today = new Date();
    var s = today.getSeconds();
    var d = today.getDate();
    var m = today.getMonth();
    var y = today.getFullYear();
    var wd = weekday[today.getDay()];
    var mt = month[m];

    checar(d)
    checkMonth(mt)
    mo = parseInt(m) + 1

    if(d < 10){
        d = "0" + d
    }
    if(mo < 10){
        mo = "0" + mo
    }
    document.getElementById('date').innerHTML = d;
    document.getElementById('day').innerHTML = wd;
    document.getElementById('month').innerHTML = mt + "/" + y;

    //var t = setTimeout(startTime, 500);

}

function checkMonth(month){
    if(month == "February"){
        document.getElementById("number28").style.display = "none";
        document.getElementById("number29").style.display = "none";
        document.getElementById("number30").style.display = "none";
        document.getElementById("number31").style.display = "none";
    }
    if(month == "April" || month == "June" || month == "September" || month == "November"){
        document.getElementById("number31").style.display = "none";
    }
}

function apertar(number){
    var today = new Date();
    m = today.getMonth()
    y = today.getFullYear()

    mt = parseInt(m) + 1
    if(number < 10){
        number = "0" + number
    }
    if(mt < 10){
        mt = "0" + mt
    }
    
    console.log(number + "/" + mt + "/" + y);
    document.getElementById('date').innerHTML = number;
    //document.getElementById("number"+number).style.backgroundColor = "#E76642";
}

function openCalendar(){
                        
    document.getElementById("calendar").style.display = "flex";
    
}

function closeCalendar(){
                        
    document.getElementById("calendar").style.display = "none";
    
}