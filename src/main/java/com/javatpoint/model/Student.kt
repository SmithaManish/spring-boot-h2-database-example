package com.javatpoint.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

//mark class as an Entity
@Entity //defining class name as Table name
@Table
class Student {
    //mark id as primary key
    @Id //defining id as column name
    @Column
    var id = 0

    //defining name as column name
    @Column
    var name: String? = null

    //defining age as column name
    @Column
    var age = 0

    //defining email as column name
    @Column
    var email: String? = null
}