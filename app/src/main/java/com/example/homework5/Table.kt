package com.example.homework5

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "STEPS")
data class Table(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "STEP_ID")
    val id: Int,

    @ColumnInfo(name = "RUNNING")
    val running: Double?,

    @ColumnInfo(name = "SWIMMING")
    val swimming: Double?,

    @ColumnInfo(name = "CALORIES")
    val calories: Double?,
)
