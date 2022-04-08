package com.example.homework5

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [Table::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getStepDao():StepDao
}