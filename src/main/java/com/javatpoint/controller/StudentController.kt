package com.javatpoint.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import com.javatpoint.service.StudentService
import org.springframework.web.bind.annotation.GetMapping
import com.javatpoint.model.Student
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

//creating RestController
@RestController
class StudentController {
    //autowired the StudentService class
    @Autowired
    var studentService: StudentService? = null

    //creating a get mapping that retrieves all the students detail from the database
//    @GetMapping("/student")
//    private val allStudent: List<Student>?
//        private get() = studentService?.allStudent


    @GetMapping("student")
    fun getAllStudent(): MutableIterable<Student?>? {
        return studentService?.allStudent()
    }

    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/student/{id}")
    private fun getStudent(@PathVariable("id") id: Int): Student? {
        return studentService?.getStudentById(id)
    }

    //creating a delete mapping that deletes a specific student
    @DeleteMapping("/student/{id}")
    private fun deleteStudent(@PathVariable("id") id: Int) {
        studentService!!.delete(id)
    }

    //creating post mapping that post the student detail in the database
    @PostMapping("/student")
    private fun saveStudent(@RequestBody student: Student): Int {
        studentService!!.saveOrUpdate(student)
        return student.id
    }
}