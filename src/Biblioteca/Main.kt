package biblioteca

fun main() {
    // Crear libros
    val libro1 = LibroDigital("Kotlin Avanzado", "Juan Pérez", 200, 5.6)
    val libro2 = LibroFisico("Algoritmos", "María López", 350, 800)

    libro1.mostrarInfo()
    libro2.mostrarInfo()

    // Crear usuarios
    val estudiante = EstudiantePrestamo("Ana")
    val profesor = ProfesorPrestamo("Carlos")

    // Préstamos
    estudiante.prestar(libro1)
    estudiante.devolver(libro1)

    profesor.prestar(libro2)
    profesor.devolver(libro2)
}
//Tarea terminada