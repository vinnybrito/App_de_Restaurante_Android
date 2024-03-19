package com.vinicius.appderestaurante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vinicius.appderestaurante.adapter.FoodAdapter
import com.vinicius.appderestaurante.databinding.ActivityMainBinding
import com.vinicius.appderestaurante.model.Food

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter
    private val foodList: MutableList<Food> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewFood: RecyclerView = binding.rcvActivityMain
        recyclerViewFood.layoutManager = LinearLayoutManager(this)
        recyclerViewFood.setHasFixedSize(true)
        foodAdapter = FoodAdapter(this, foodList)
        recyclerViewFood.adapter = foodAdapter

        getFood()

    }

    private fun getFood() {
        val food1 = Food (
            imgFood = R.drawable.food1,
            foodName = "Combo da Casa",
            foodDescription = "Batata Frita com Camarão, limão e refrigerante",
            price = "R$45.90"
        )
        foodList.add(food1)

        val food2 = Food (
            imgFood = R.drawable.food5,
            foodName = "A moda do Chefe",
            foodDescription = "Batata Frita com Camarão, limão e refrigerante, cebola, arroz",
            price = "R$69.90"
        )
        foodList.add(food2)

        val food3 = Food (
            imgFood = R.drawable.food3,
            foodName = "Combo da Casa",
            foodDescription = "Batata Frita com Camarão, limão e refrigerante",
            price = "R$20.90"
        )
        foodList.add(food3)

        val food4 = Food (
            imgFood = R.drawable.food4,
            foodName = "Combo da Casa",
            foodDescription = "Batata Frita com Camarão, limão e refrigerante",
            price = "R$45.90"
        )
        foodList.add(food4)

        val food5 = Food (
            imgFood = R.drawable.food5,
            foodName = "Combo da Casa",
            foodDescription = "Batata Frita com Camarão, limão e refrigerante",
            price = "R$45.90"
        )
        foodList.add(food5)
    }
}