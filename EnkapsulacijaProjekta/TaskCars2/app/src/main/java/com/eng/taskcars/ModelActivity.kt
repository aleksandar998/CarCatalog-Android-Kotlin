package com.eng.taskcars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_model.*


class ModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_model)

        imageModel.setImageResource(DataGlobal.carLogo)

        var filteredCars: ArrayList<DataGlobal.ChosenBrandCar> = arrayListOf()

        for (item in DataGlobal.cars) {
            if (item.Marka == DataGlobal.carModel) {
                filteredCars.add(
                    DataGlobal.ChosenBrandCar(
                        DataGlobal.metode.getImageSpecific(item.Marka),
                        item.Model,
                        item.Cena + " $",
                        item.Marka,
                        item.Motor,
                        item.PaketOpreme,
                        item.TezinaPraznogVozila
                    )
                )
            }
        }
        Log.d("Lista", filteredCars.count().toString())

        val createdAdapter = ModelAdapter(filteredCars)
        recycleViewModels.adapter = createdAdapter
        recycleViewModels.layoutManager = GridLayoutManager(this, 2)
    }


}