package com.javatpoint.service

import org.springframework.beans.factory.annotation.Autowired
import com.javatpoint.repository.StudentRepository
import com.javatpoint.model.Student
import org.springframework.stereotype.Service
import java.util.ArrayList
import java.util.function.Consumer

//defining the business logic
@Service
class StudentService {
    @Autowired
    var studentRepository: StudentRepository? = null

    //getting all student records
//    val allStudent: List<Student>
//        get() {
//            val students: MutableList<Student> = ArrayList()
//
//            studentRepository!!.findAll().forEach(Consumer { student: Student -> students.add(student) } as (Student?) -> Unit)
//            return students
//        }
    fun allStudent(): MutableIterable<Student?>? {
        return studentRepository?.findAll()
    }

    //getting a specific record
    fun getStudentById(id: Int): Student? {
        return studentRepository?.findById(id)?.get()
    }

    fun saveOrUpdate(student: Student) {
        studentRepository!!.save(student)
    }

    //deleting a specific record
    fun delete(id: Int) {
        studentRepository!!.deleteById(id)
    }
}