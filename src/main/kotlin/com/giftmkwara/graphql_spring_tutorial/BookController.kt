package com.giftmkwara.graphql_spring_tutorial

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class BookController(private val bookRepository: BookRepository, private val authorRepository: AuthorRepository) {

    @QueryMapping
    fun bookById(@Argument id: UUID): Book? = bookRepository.getById(id)

    @QueryMapping
    fun getBooks(): List<Book> = bookRepository.getAll()

    @SchemaMapping
    fun author(book: Book): Author? = authorRepository.getById(book.authorId)
}