package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.vault.core.VaultOperations
import org.springframework.vault.core.VaultTemplate
import org.springframework.vault.support.VaultTransitContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
class QuoteController (
    private val quoteRepository: QuoteRepository
) {
    @GetMapping("/quote")
    fun getQuote():String{
//        var some_quote = quoteRepository.findRandom();
        var some_quote = quoteRepository.getOne(1);
        return "Your quote: ${some_quote.content}"
    }
}