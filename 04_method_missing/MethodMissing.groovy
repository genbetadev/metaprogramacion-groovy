class Coche {
    Integer velocidad = 0

    def methodMissing(String name, args) {
        switch(name) {
            case 'avanzar':
                velocidad = args[0]
                break
            case 'acelerar':
                velocidad += args[0]
                break
            case 'parar':
                velocidad = 0
                break
            default:
                throw new MissingMethodException(name, this.class, args)
        }
    }
}

def coche = new Coche()
println "El coche está parado. Velocidad = ${coche.velocidad}"

coche.avanzar(20)
println "El coche avanza a ${coche.velocidad} km/h"

coche.acelerar(50)
println "El coche acelera hasta los ${coche.velocidad} km/h"

coche.parar()
println "El coche está parado. Velocidad = ${coche.velocidad}"

//coche.turbo()
// Esto lanzará MissingMethodException
