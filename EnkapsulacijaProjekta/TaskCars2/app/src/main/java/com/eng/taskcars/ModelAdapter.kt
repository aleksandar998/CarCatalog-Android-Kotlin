package com.eng.taskcars

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_model.view.*
import kotlinx.android.synthetic.main.cell_logos.view.*
import kotlinx.android.synthetic.main.cell_models.view.*

var rowIndexCar: Int? = 0

class ModelAdapter(val preuzetiPodaci: ArrayList<DataGlobal.ChosenBrandCar>) :
    RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.cell_models, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.view.imageModelCell.setImageResource(preuzetiPodaci[position].image)
        holder.view.markaModelCell.text =  preuzetiPodaci[position].model
        holder.view.cenaModelCell.text = preuzetiPodaci[position].price
        holder.view.cellModel.setOnClickListener { view ->
            rowIndexCar = position
            val intent = Intent(view.context, DetailsActivity::class.java)
            intent.putExtra("slika", preuzetiPodaci[position].image)
            intent.putExtra("marka", preuzetiPodaci[position].brand)
            intent.putExtra("model", preuzetiPodaci[position].model)
            intent.putExtra("motor", preuzetiPodaci[position].engine)
            intent.putExtra("paketOpreme", preuzetiPodaci[position].equipmentPackage)
            intent.putExtra("tezina", preuzetiPodaci[position].emptyVehicleWeight)
            view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return preuzetiPodaci.count()
    }
}