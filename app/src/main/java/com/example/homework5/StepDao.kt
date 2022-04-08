package com.example.homework5

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface StepDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg table: Table)

    @Query("SELECT SUM(RUNNING) FROM STEPS")
    fun getSumRunning():Double?

    @Query("SELECT AVG(RUNNING) FROM STEPS")
    fun getAverageRunning():Double?

    @Query("SELECT AVG(SWIMMING) FROM STEPS")
    fun getAverageSwimming():Double?

    @Query("SELECT AVG(CALORIES) FROM STEPS")
    fun getAverageCalories():Double?
}