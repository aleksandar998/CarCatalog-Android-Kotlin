package com.eng.taskcars

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_logos.*
import java.io.BufferedReader
import java.io.InputStreamReader

val logos: ArrayList<DataGlobal.Logotip> = arrayListOf()

class Methods {

    fun createDataSource() {
        logos.add(DataGlobal.Logotip(R.drawable.alfa_romeo, "Alfa Romeo"))
        logos.add(DataGlobal.Logotip(R.drawable.audi, "Audi"))
        logos.add(DataGlobal.Logotip(R.drawable.citroen, "Citroen"))
        logos.add(DataGlobal.Logotip(R.drawable.dacia, "Dacia"))
        logos.add(DataGlobal.Logotip(R.drawable.fiat, "Fiat"))
        logos.add(DataGlobal.Logotip(R.drawable.ford, "Ford"))
        logos.add(DataGlobal.Logotip(R.drawable.honda, "Honda"))
        logos.add(DataGlobal.Logotip(R.drawable.hyundai, "Hyundai"))
        logos.add(DataGlobal.Logotip(R.drawable.infiniti, "Infiniti"))
        logos.add(DataGlobal.Logotip(R.drawable.isuzu, "Isuzu"))
        logos.add(DataGlobal.Logotip(R.drawable.jeep, "Jeep"))
        logos.add(DataGlobal.Logotip(R.drawable.lada, "Lada"))
        logos.add(DataGlobal.Logotip(R.drawable.mazda, "Mazda"))
        logos.add(DataGlobal.Logotip(R.drawable.mercedes_benz, "Mercedes-Benz"))
        logos.add(DataGlobal.Logotip(R.drawable.mini, "Mini"))
        logos.add(DataGlobal.Logotip(R.drawable.mitsubishi, "Mitsubishi"))
        logos.add(DataGlobal.Logotip(R.drawable.nissan, "Nissan"))
        logos.add(DataGlobal.Logotip(R.drawable.opel, "Opel"))
        logos.add(DataGlobal.Logotip(R.drawable.peugeot, "Peugeot"))
        logos.add(DataGlobal.Logotip(R.drawable.renault, "Renault"))
        logos.add(DataGlobal.Logotip(R.drawable.seat, "Seat"))
        logos.add(DataGlobal.Logotip(R.drawable.skoda, "Skoda"))
        logos.add(DataGlobal.Logotip(R.drawable.smart, "Smart"))
        logos.add(DataGlobal.Logotip(R.drawable.subaru, "Subaru"))
        logos.add(DataGlobal.Logotip(R.drawable.suzuki, "Suzuki"))
        logos.add(DataGlobal.Logotip(R.drawable.volkswagen, "Volkswagen"))
        logos.add(DataGlobal.Logotip(R.drawable.volvo, "Volvo"))
    }

    fun parseCSV(context: Context) {
        var line: String?
        val openCSV = InputStreamReader(context.assets.open("model.csv"))
        val readLineInCSV = BufferedReader(openCSV)

        readLineInCSV.readLine()

        while (readLineInCSV.readLine().also {
                line = it
            } != null) {
            val row: List<String> = line!!.split(";")
            if (row[0].isNotEmpty()) {
                DataGlobal.cars.add(
                    DataGlobal.Car(
                        row[0],
                        row[1],
                        row[2],
                        row[3],
                        row[4],
                        row[5],
                        row[6],
                        row[7],
                        row[8],
                        row[9],
                        row[10],
                        row[11],
                        row[12],
                        row[13],
                        row[14],
                        row[15],
                        row[16],
                        row[17],
                        row[18],
                        row[19],
                        row[20],
                        row[21],
                        row[22],
                        row[23],
                        row[24],
                        row[25],
                        row[26],
                        row[27],
                        row[28],
                        row[29],
                        row[30],
                        row[31],
                        row[32],
                        row[33],
                        row[34],
                        row[35],
                        row[36],
                        row[37],
                        row[38],
                        row[39],
                        row[40],
                        row[41],
                        row[42],
                        row[43],
                        row[44],
                        row[45],
                        row[46],
                        row[47],
                        row[48],
                        row[49],
                        row[50],
                        row[51],
                        row[52],
                        row[53],
                        row[54],
                        row[55],
                        row[56],
                        row[57],
                        row[58],
                        row[59],
                        row[60]
                    )
                )
            }
        }
    }

    var i = 1
    fun getImageSpecific(marka: String): Int {
        if (marka == "Alfa Romeo") {
            if (i >4) i =1
            when (i) {
                1 -> {
                    i++
                    return R.drawable.alfa_romeo_black
                }
                2 -> {
                    i++
                    return R.drawable.alfa_romeo_gulieta
                }
                3 -> {
                    i++
                    return R.drawable.alfa_romeo_gulia_sedan
                }
                4 -> {
                    i++
                    return R.drawable.alfa_romeo_spider
                }
            }
        }

        if (marka == "Audi") {
            if (i >4) i =1
            when (i) {
                1 -> {
                    i++
                    return R.drawable.audi_a7
                }
                2 -> {
                    i++
                    return R.drawable.audi_a8
                }
                3 -> {
                    i++
                    return R.drawable.audi_q8
                }
                4 -> {
                    i++
                    return R.drawable.audi_r8
                }
            }
        }

        if (marka == "Citroen") {
            if (i>4) i=1
            when (i) {
                1 -> {
                    i++
                    return R.drawable.citroen_c3
                }
                2 -> {
                    i++
                    return R.drawable.citroen_c4_picasso
                }
                3 -> {
                    i++
                    return R.drawable.citroen_c5
                }
                4 -> {
                    i++
                    return R.drawable.citroen_cactus
                }
            }
        }

        if (marka == "Dacia") {
            if (i>4) i=1
            when (i) {
                1 -> {
                    i++
                    return R.drawable.dacia_d6
                }
                2 -> {
                    i++
                    return R.drawable.dacia_duster
                }
                3 -> {
                    i++
                    return R.drawable.dacia_logan
                }
                4 -> {
                    i++
                    return R.drawable.dacia_sandero
                }
            }
        }


        return 0;
    }
}