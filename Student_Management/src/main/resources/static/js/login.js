// $(document).ready(function(){
//     $("#loginbtn").click(function(){
//         $.ajax({
//             url:'http://localhost:8300/Student_Management/user/insertUser',
//             type:'post',
//             dataType:'json',
//             data:$("#myForm").serialize(),
//             success:function(date){
//                 if(date.statusCode=="200"){
//                     alert(date.msg);
//                 }
//
//             },
//             error: function(XMLHttpRequest, textStatus, errorThrown) {
//                 alert("Status: " + textStatus); alert("Error: " + errorThrown);
//             }
//         });
//     });
//
// });