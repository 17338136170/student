$(document).ready(function () {
    $(".zhuce").click(function () {
        $.ajax({
            type: "GET",
            url: "localhost:8300/Student_Management/user/loginOauth",
            data: {page: $("#page").val(), limit: 5},
            dataType: "JSON",
            success: function (result) {
            }
        });

    });

    $('#username').focus(function () {
        $('#userspan').html("");

    });
    $('#password').focus(function () {
        $('#passpan').html("");

    });

    $("#loginbtn").click(function () {
        // $(".cuowu").show().delay(3000).hide(300);
        var username = $('#username').val();
        var password = $('#password').val();
        if (username == '') {
            $('#userspan').html("用户名不能为空!").css('color', 'red');
        }
        ;
        if (password == '') {
            $('#passpan').html("用户名不能为空!").css('color', 'red');
        }
        ;
        var user = {username: username, password: password};
        if (username != '' & password != '') {
            $.ajax({
                type: "post",
                url: "http://localhost:8300/Student_Management/user/loginOauth",
                data: $('#dataForm').serialize(),
                dataType: "JSON",
                success: function (result) {
                    if (result.statusCode == 200) {
                        window.location.href = "http://localhost:8300/Student_Management/user/index"
                    } else {
                        $('#errorPrompt').html("用户名或密码错误!");
                        $("#errorPrompt").show().delay(3000).hide(300);
                    }
                }
            });

        }

    })

});