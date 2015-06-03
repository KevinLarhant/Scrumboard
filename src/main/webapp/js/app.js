
var idPostit=0;
function postit(){
    var postit = "";
    postit='<div id='+idPostit+' class="postit">User story ' +
    '<span class="glyphicon glyphicon-arrow-right" onclick="goDone('+idPostit+')"></span>' +
    '<span class="glyphicon glyphicon-remove" onclick="deletePostit('+idPostit+')"></div>';

    idPostit++;

    $(".zoneUS").append(postit);
}

function deletePostit(idPostit){
    var id = "#"+idPostit;
    $(id).remove();
}

function goNext(idPostit){
    var id = "#"+idPostit;

    if($(id).parent().attr('class') == 'zoneTODO') {
        $('.zoneInProgress').append($(id));
    } else if($(id).parent().attr('class') == 'zoneInProgress') {
        $('.zoneDone').append($(id));
    }
}

function postit2(){
    var postit2 = "";
    postit2='<div id='+idPostit+' class="postit">Task ' +
    '<span class="glyphicon glyphicon-arrow-right" onclick="goNext('+idPostit+')"></span>' +
    '<span class="glyphicon glyphicon-remove" onclick="deletePostit('+idPostit+')"></div>';

    idPostit++;

    $(".zoneToDo").append(postit2);
}

function goDone(idPostit){
    var id = "#"+idPostit;
    $('.zoneDone').append($(id));
}
