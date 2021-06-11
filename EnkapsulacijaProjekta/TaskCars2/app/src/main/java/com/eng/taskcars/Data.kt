package com.eng.taskcars

object DataGlobal{

    val metode = Methods()

    data class Logotip(val slika: Int, val naziv: String)
    data class CarImage(val image: Int, val car: String)

    val cars: ArrayList<Car> = arrayListOf()
    var searchArray: ArrayList<ChosenBrandCar> = arrayListOf()

    var carModel = ""
    var carLogo: Int = 0

    data class ChosenBrandCar(val image: Int,
                              val model: String,
                              val price: String,
                              val brand: String,
                              val engine: String,
                              val equipmentPackage: String,
                              val emptyVehicleWeight: String)

    data class Car(
        val Marka: String,
        val Model: String,
        val Motor: String,
        val PaketOpreme: String,
        val Cena: String,
        val RasporedCilindara: String,
        val BrojVentila: String,
        val PrecnikHodKlipa: String,
        val TipUbrizgavanja: String,
        val SistemOtvaranjaVentila: String,
        val Turbo: String,
        val ZapreminaMotora: String,
        val KW: String,
        val KS: String,
        val SnagaPriObrtajima: String,
        val ObrtniMoment: String,
        val ObrtniMomentPriObrtajima: String,
        val StepenKompresije: String,
        val TipMenjaca: String,
        val BrojStepeniPrenosa: String,
        val Pogon: String,
        val Duzina: String,
        val Sirina: String,
        val Visina: String,
        val MedjuosovinskoRastojanje: String,
        val TezinaPraznogVozila: String,
        val MaksimalnaDozvoljenaTezina: String,
        val ZapreminaRezervoara: String,
        val ZapreminaPrtljaznika: String,
        val MaksZapreminaPrtljaznika: String,
        val DozvoljenTovar: String,
        val DozvoljenoOpterecenjeKrova: String,
        val DozvoljenaTezinaPrikoliceBK: String,
        val DozvoljenaTezinaPrikoliceSK12: String,
        val DozvoljenaTezinaPrikoliceSK8: String,
        val OpterecenjeKuke: String,
        val RadijusOkretanja: String,
        val TragTockovaNapred: String,
        val TragTockovaNazad: String,
        val MaksimalnaBrzina: String,
        val Ubrzanje0_100: String,
        val Ubrzanje0_200: String,
        val Ubrzanje80_120FinalniStepen: String,
        val ZaustavniPut100: String,
        val VremeZa400m: String,
        val PotrosnjaGrad: String,
        val PotrosnjaVGrada: String,
        val EmisijaCO2: String,
        val Katalizator: String,
        val DimenzijePneumatika: String,
        val PrednjeOpruge: String,
        val ZadnjeOpruge: String,
        val PrednjiStabilizator: String,
        val ZadnjiStabilizator: String,
        val GarancijaKorozija: String,
        val GarancijaMotor: String,
        val EuroNCAP: String,
        val EuroNCAPZvezdice: String,
        val Gorivo: String,
        val BrojVrata: String,
        val BrojSedista: String
    )
}