package edu.cnm.deepdive.handsolitaire.model.entity

import android.R.attr.name
import android.companion.DeviceId
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(
    tableName = "game",
    indices = [
        Index(value = ["game_id"], unique = true)
    ]
)
data class Game(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "game_id")
    val id: Long = 0L,

    val userId: DeviceId



)
