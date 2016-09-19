String.metaClass.saludar = {
    return "Hola ${delegate}!"
}

def nombre = "Iván"
println nombre.saludar()
