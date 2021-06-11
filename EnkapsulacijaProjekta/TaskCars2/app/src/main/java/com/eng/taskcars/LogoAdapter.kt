package com.eng.taskcars

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell_logos.view.*

var rowIndex: Int? = null

class LogoAdapter(val preuzetiPodaci: ArrayList<DataGlobal.Logotip>) :
    RecyclerView.Adapter<CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.cell_logos, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.view.logo.setImageResource(preuzetiPodaci[position].slika)
        holder.view.marka.text = preuzetiPodaci[position].naziv
        holder.view.model.setOnClickListener { view ->
            rowIndex = position
            val intent = Intent(view.context, ModelActivity::class.java)
            DataGlobal.carModel = preuzetiPodaci[position].naziv
            DataGlobal.carLogo = preuzetiPodaci[position].slika
            view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return preuzetiPodaci.count()
    }
}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}
