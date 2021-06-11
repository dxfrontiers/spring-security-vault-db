package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface QuoteRepository: JpaRepository<Quote, Long>  {

}