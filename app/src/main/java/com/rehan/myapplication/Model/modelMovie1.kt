package com.rehan.myapplication.Model

import com.rehan.myapplication.R

data class modelMovie1(
    val gambar : Int,
    val judul : String

)

object Mocklist{
    fun getModel() : List<modelMovie1>{
        val itemmodel1 = modelMovie1(R.drawable.avatar,
            "Avatar")

        val itemmodel2 = modelMovie1(R.drawable.batman,
            "Batman")

        val itemmodel3 = modelMovie1(R.drawable.end_game,
            "End Game")

        val itemmodel4 = modelMovie1(R.drawable.venom,
            "Venom")

        val itemmodel5 = modelMovie1(R.drawable.lucy,
            "Lucy")
        val itemmodel6 = modelMovie1(R.drawable.jumanji,
            "Jumanji")
        val itemmodel7 = modelMovie1(R.drawable.spider_man,
            "Spiderman")
        val itemmodel8 = modelMovie1(R.drawable.inception,
            "Inception")
        val itemmodel9 = modelMovie1(R.drawable.jurassic_world,
            "Jurassic World")
        val itemmodel10 = modelMovie1(R.drawable.hulk,
            "Hulk")



        val itemList :ArrayList<modelMovie1> = ArrayList()
        itemList.add(itemmodel1)
        itemList.add(itemmodel2)
        itemList.add(itemmodel3)
        itemList.add(itemmodel4)
        itemList.add(itemmodel5)
        itemList.add(itemmodel6)
        itemList.add(itemmodel7)
        itemList.add(itemmodel8)
        itemList.add(itemmodel9)
        itemList.add(itemmodel10)

        return itemList
    }

}
