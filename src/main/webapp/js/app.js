
var idPostit=0;
function postit(){
    var postit = "";
    postit='<div id='+idPostit+' class="postit">Cool c\'est une user story ' +
    '<span class="glyphicon glyphicon-arrow-right" onclick="goDone('+idPostit+')"></span>' +
    '<span class="glyphicon glyphicon-remove" onclick="remove('+idPostit+')"></div>';

    idPostit++;

    $(".zoneUS").append(postit);
}

function remove(idPostit){
    var id = "#"+idPostit;
    $(id).remove();
}

function goNext(idPostit, zone){
    var id = "#"+idPostit;

    if(zone == 0) {
        $('.zoneInProgress').append($(id));
        zone++;
    } else {
        $('.zoneDone').append($(id));
    }

}

function postit2(){
    var postit2 = "";
    postit2='<div id='+idPostit+' class="postit">Cool c\'est une user story ' +
    '<span class="glyphicon glyphicon-arrow-right" onclick="goNext('+idPostit+','+0+')"></span>' +
    '<span class="glyphicon glyphicon-remove" onclick="remove('+idPostit+')"></div>';

    idPostit++;

    $(".zoneToDo").append(postit2);
}

function goDone(idPostit){
    var id = "#"+idPostit;
    $('.zoneDone').append($(id));
}
