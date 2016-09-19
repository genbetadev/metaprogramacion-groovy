class Utils {
    static String saludar(String nombre) {
        return "Hola ${nombre}"
    }
}

def nombre = "Iván"
use(Utils) {
    println nombre.saludar()
}

// Fuera de la closure anterior el método saludar() no existe. El siguiente
// código lanza una groovy.lang.MissingMethodException
// println nombre.saludar()
