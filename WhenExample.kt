fun main(args: Array<String>) { 
    var color = "green"
    var colorProvidor = when( color)
    {
        "blue" -> "blue color is availabel"
        "red" -> "red color is availabel"
        "black" -> "black color is availabel"
        "yellow" -> "yellow color is availabel"
        else -> "Not available"
    }
    println(colorProvidor)
}