fun main(){
    println("Enter temp in Celsius:")
    var celcius = readLine()?.toDoubleOrNull()
    if(celcius != null){
        var fahrenheit = celcius * 9 / 5 + 32
        println("Temperature in fahreheit: $fahrenheit")

    }else {

        println("invalid input.")


}










}