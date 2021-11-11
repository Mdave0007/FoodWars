package com.mdave.foodwars.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mdave.foodwars.models.FoodRecipe
import com.mdave.foodwars.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}