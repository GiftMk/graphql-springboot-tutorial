package com.giftmkwara.graphql_spring_tutorial

import org.springframework.stereotype.Repository
import java.util.*

@Repository
class AuthorRepository {
    companion object {
        val gift = Author(UUID.randomUUID(), "Gift", "Mkwara")
        val grace = Author(UUID.randomUUID(), "Grace", "Mkwara")
        val glad = Author(UUID.randomUUID(), "Glad", "Mkwara")

        val authors = listOf(grace, gift, glad)
    }

    fun getById(id: UUID) = authors.find { it.id == id }
}