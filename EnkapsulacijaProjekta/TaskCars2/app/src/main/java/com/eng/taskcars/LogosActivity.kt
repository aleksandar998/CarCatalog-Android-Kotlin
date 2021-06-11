package com.eng.taskcars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_logos.*

class LogosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logos)

        DataGlobal.metode.createDataSource()

        val createdAdapter = LogoAdapter(logos)
        recycleViewLogos.adapter = createdAdapter
        recycleViewLogos.layoutManager = GridLayoutManager(this, 2)

        closeSearchButton.visibility = View.GONE

        userInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
            override fun afterTextChanged(s: Editable?) {
                filterModels(s.toString())
            }
        })

        closeSearchButton.setOnClickListener {
            userInput.setText("")
            recycleViewLogos.adapter = LogoAdapter(logos)
            recycleViewLogos.layoutManager = GridLayoutManager(this, 2)
            closeSearchButton.visibility = View.GONE
        }
    }

    fun filterModels(korisnickiUnos: String){
        DataGlobal.searchArray.clear()

        for (car in DataGlobal.cars) {
            val nadovezaniPodaci = (car.Marka + " " + car.Model).toLowerCase()

            if (userInput.text.toString().isNotEmpty() && nadovezaniPodaci.contains(
                    korisnickiUnos.toLowerCase()
                )
            ) {
                val image = DataGlobal.metode.getImageSpecific(car.Marka)
                DataGlobal.searchArray.add(
                    DataGlobal.ChosenBrandCar(
                        image, car.Model, car.Cena + " $", car.Marka, car.Motor,
                        car.PaketOpreme, car.TezinaPraznogVozila
                    )
                )
            }
        }
        closeSearchButton.visibility = View.VISIBLE
        recycleViewLogos.adapter = ModelAdapter(DataGlobal.searchArray)
        recycleViewLogos.layoutManager = GridLayoutManager(this, 2)
    }

}