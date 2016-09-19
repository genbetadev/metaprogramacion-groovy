// Para ejecutar:
// ./gradlew build
// groovy -cp build/libs/string-extensions-1.0.jar ExtensionModule.groovy

@groovy.transform.CompileStatic
class MiClase {
    void saluda() {
        println "Iván".saludar()
    }
}

def mc = new MiClase()
mc.saluda()
