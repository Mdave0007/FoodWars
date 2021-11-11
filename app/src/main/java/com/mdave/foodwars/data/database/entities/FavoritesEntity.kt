package com.mdave.foodwars.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mdave.foodwars.models.Result
import com.mdave.foodwars.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)