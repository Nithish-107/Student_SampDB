function showstudents(){
    fetch("http://localhost:8080/students")
    .then((response)=>response.json())
    .then((students)=>{
        const stutable=document.getElementById("stu")

        students.forEach(student => {
            var row=`<tr>
            <td>${student.rollno}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.dept}</td>
            </tr>`
            stutable.innerHTML+=row;
        });
    })

}

function showaddedstudents(){
    fetch("http://localhost:8080/students/newstudents")
    .then((response)=>response.json())
    .then((students)=>{
        const stutable=document.getElementById("stu1")

        students.forEach(student => {
            var row=`<tr>
            
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.dept}</td>
            </tr>`
            stutable.innerHTML+=row;
        });
    })
}