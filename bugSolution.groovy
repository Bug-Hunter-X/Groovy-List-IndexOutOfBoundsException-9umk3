def list = [1, 2, 3]

if (list.size() > 3 && list[3] !=null){
    println list[3] 
} else {
    println "Index out of bounds or null element at index 3"
}
//Alternatively, using the elvis operator
println list[3] ?: "Index out of bounds or null element at index 3"