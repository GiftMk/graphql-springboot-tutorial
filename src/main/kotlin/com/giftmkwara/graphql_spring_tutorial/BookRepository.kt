package com.giftmkwara.graphql_spring_tutorial

import org.springframework.stereotype.Repository
import java.util.*

@Repository
class BookRepository {
    companion object {
         private val books = listOf(
            Book(UUID.randomUUID(), "Gift's book", 100, AuthorRepository.gift.id),
            Book(UUID.randomUUID(), "Grace's book", 100, AuthorRepository.grace.id),
            Book(UUID.randomUUID(), "Glad's book", 100, AuthorRepository.glad.id)
        )
    }

    fun getById(id: UUID) = books.find { it.id == id }

    fun getAll() = books
}