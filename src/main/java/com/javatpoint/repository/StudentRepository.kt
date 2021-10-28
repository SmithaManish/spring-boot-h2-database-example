package com.javatpoint.repository

import org.springframework.data.repository.CrudRepository
import com.javatpoint.model.Student

interface StudentRepository : CrudRepository<Student?, Int?>