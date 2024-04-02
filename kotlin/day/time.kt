import java.time.LocalDate
import  java.time .LocalTime


fun main(){
    var time: LocalTime = LocalTime.now()
    var clock: LocalTime = LocalTime.NOON
    var date = LocalDate.now()
    var day =date.dayOfWeek
    var month =date.month
    var year =date.year
    var leap =date.isLeapYear
    var daZS:Int = 365
    println(time)
    println(day)
    println(month)
    println(year)
    println(leap)
    if (time > LocalTime.NOON){
        println("Good afternoon")
    }else if(time < LocalTime.NOON)
        println("Good morning")
    if(daZS == 365){
        println("Leap year")
    }else if(daZS < 365){
        println("not leap year")
    }





}

