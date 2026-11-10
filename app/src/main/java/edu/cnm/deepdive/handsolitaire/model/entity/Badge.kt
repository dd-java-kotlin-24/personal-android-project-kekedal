package edu.cnm.deepdive.handsolitaire.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "badge",
    indices = [
        Index(value = ["badge_id"], unique = true)
    ]
)

data class Badge(
    @ColumnInfo(name = "badge_id")
    val badgeId: Long,
    val name: String,
    val description: String,
    val image: // TODO: find a image set for badges.
)
