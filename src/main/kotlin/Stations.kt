import java.awt.datatransfer.StringSelection

data class Station(val price: Int, val number: Int, val stationName: String)

fun String.parseToStation(): Station {
        val listOfDetails = this.split(";")
        return Station(listOfDetails[0].toInt(), listOfDetails[1].toInt(), listOfDetails[2])
}

fun main(){
    //println("1;3;Sta.Apolonia".parseToStation())
    val stringStations = FileAccess.readFile("BILHETES_VENDIDOS")
    for (item in stringStations){
        println(item.parseToStation())
    }
}