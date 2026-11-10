package edu.cnm.deepdive.handsolitaire.model.entity

import java.time.LocalDateTime
import java.util.UUID


data class User(
    val id: UUID,
    val name: String,
    val created: LocalDateTime,
    val modified: LocalDateTime,
)

