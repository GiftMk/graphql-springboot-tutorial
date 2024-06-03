package com.giftmkwara.graphql_spring_tutorial

import java.util.UUID

data class Book(val id: UUID, val name: String, val pageCount: Int, val authorId: UUID)
