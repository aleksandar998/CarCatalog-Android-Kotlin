package com.eng.taskcars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        imageLogoBrand.setImageResource(DataGlobal.carLogo)

        val slikaDetail = intent.getIntExtra("slika", 0)
        val markaDetail = intent.getStringExtra("marka")
        val modelDetail = intent.getStringExtra("model")
        val motorDetail = intent.getStringExtra("motor")
        val paketOpreme = intent.getStringExtra("paketOpreme")
        val tezinaVozila = intent.getStringExtra("tezina")

        val imageTop = findViewById<ImageView>(R.id.imageConcreteModel)
        imageTop.setImageResource(slikaDetail)

        var open = false

        strelicaNaDole.setOnClickListener {
            if (!open) {
                ostatakPodataka.visibility = View.VISIBLE
                prikaziVise.text = "Prikazi manje"
            } else {
                ostatakPodataka.visibility = View.GONE
                prikaziVise.text = "Prikazi vise"
            }
            open = !open
        }

        for (car in DataGlobal.cars) {
            if (car.Marka == markaDetail && car.Model == modelDetail && car.Motor == motorDetail &&
                    car.PaketOpreme == paketOpreme && car.TezinaPraznogVozila == tezinaVozila) {
                val firstTenValues = findViewById<TextView>(R.id.firstTenValues)
                firstTenValues.text = "MARKA: " + car.Marka + "\nMODEL: " + car.Model +
                        "\nMOTOR: " + car.Motor + "\nPAKET OPREME: " + car.PaketOpreme +
                        "\nCIJENA: " + car.Cena + "\nRASPORED CILINDARA: " + car.RasporedCilindara +
                        "\nBROJ VENTILA: " + car.BrojVentila + "\nPRECNIK KOD KLIPA: " +
                        car.PrecnikHodKlipa + "\nTIP UBRIZGAVANJA: " + car.TipUbrizgavanja +
                        "\nSISTEM OTVARANJA VENTILA: " + car.SistemOtvaranjaVentila
                val restValues = findViewById<TextView>(R.id.ostatakPodataka)
               restValues.text = "TURBO: " + car.Turbo + "\nZAPREMINA MOTORA: " + car.ZapreminaMotora +
                        "\nKW: " + car.KW + "\nKS: " + car.KS + "\nSNAGA PRI OBRTAJIMA: " + car.SnagaPriObrtajima +
                        "\nOBRTNI MOMENT: " + car.ObrtniMoment + "\nOBRTNI MOMENT PRI OBRTAJIMA: " +
                        car.ObrtniMomentPriObrtajima + "\nSTEPEN KOMPRESIJE: " + car.StepenKompresije +
                        "\nTIP MJENJACA: " + car.TipMenjaca + "\nBROJ STEPENI PRENOSA: " + car.BrojStepeniPrenosa +
                        "\nPOGON: " + car.Pogon + "\nDUZINA: " + car.Duzina + "\nSIRINA: " + car.Sirina +
                        "\nVISINA: " + car.Visina + "\nMEDJUOSOVINSKO RASTOJANJE: " + car.MedjuosovinskoRastojanje +
                        "\nTEZINA PRAZNOG VOZILA: " + car.TezinaPraznogVozila + "\nMAKSIMALNA DOZVOLJENA TEZINA: " +
                        car.MaksimalnaDozvoljenaTezina + "\nZAPREMINA REZERVOARA: " + car.ZapreminaRezervoara +
                        "\nZAPREMINA PRTLJAZNIKA: " + car.ZapreminaPrtljaznika + "\nMAKS.ZAPREMINA PRTLJAZNIKA: " +
                        car.MaksZapreminaPrtljaznika + "\nDOZVOLJEN TOVAR: " + car.DozvoljenTovar +
                        "\nDOZVOLJENO OPTERECENJE KROVA: " + car.DozvoljenoOpterecenjeKrova +
                        "\nDOZVOLJENA TEZINA PRIKOLICE BK: " + car.DozvoljenaTezinaPrikoliceBK +
                        "\nDOZVOLJENA TEZINA PRIKOLICE SK12: " + car.DozvoljenaTezinaPrikoliceSK12 +
                        "\nDOZVOLJENA TEZINA PRIKOLICE SK8: " + car.DozvoljenaTezinaPrikoliceSK8 +
                        "\nOPRERECENJE KUKE: " + car.OpterecenjeKuke + "\nRADIJUS OKRETANJA: " + car.RadijusOkretanja +
                        "\nTRAG TOCKOVA NAPRED: " + car.TragTockovaNapred + "\nTRAG TOCKOVA NAZAD: " +
                        car.TragTockovaNazad + "\nMAKSIMALNA BRZINA: " + car.MaksimalnaBrzina + "\nUBRZANJE 0-100: " +
                        car.Ubrzanje0_100 + "\nUBRZANJE 0-200: " + car.Ubrzanje0_200 + "\nUBRZANJE 80-120 FINALNI STEPEN: " +
                        car.Ubrzanje80_120FinalniStepen + "\nZAUSTAVNI PUT 100:" + car.ZaustavniPut100 + "\nVREME ZA 400m: " +
                        car.VremeZa400m + "\nPOTROSNJA GRAD: " + car.PotrosnjaGrad + "\nPOTROSNJA VAN GRADA: " +
                        car.PotrosnjaVGrada + "\nEMISIJA CO2: " + car.EmisijaCO2 + "\nDIMENZIJE PNEUMATIKA: " +
                        car.DimenzijePneumatika + "\nPREDNJE OPRUGE: " + car.PrednjeOpruge + "\nZADNJE OPRUGE: " +
                        car.ZadnjeOpruge + "\nPREDNJI STABILIZATOR: " + car.PrednjiStabilizator + "\nZADNJI STABILIZATOR: " +
                        car.ZadnjiStabilizator + "\nGARANCIJA KOROZIJA: " + car.GarancijaKorozija + "\nGARANCIJA MOTOR: " +
                        car.GarancijaMotor + "\nEURO NCAP: " + car.EuroNCAP + "\n EURO NCAP ZVEZDICE: " + car.EuroNCAPZvezdice +
                        "\nGORIVO: " + car.Gorivo + "\nBROJ VRATA: " + car.BrojVrata + "\nBROJ SJEDISTA: " + car.BrojSedista
            }
        }
    }
}