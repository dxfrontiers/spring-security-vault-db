package com.example.demo

import javax.persistence.*

@Entity
@Table(name = "quotes")
data class Quote (
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    var id: Long,
    var content: String
    )