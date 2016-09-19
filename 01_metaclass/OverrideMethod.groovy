def rnd = new Random()

3.times {
    println rnd.nextInt() // Obtendremos 3 valores aleatorios
}

Random.metaClass.nextInt = {
    return 42
}
3.times {
    println rnd.nextInt() // Obtendremos 42 siempre
}
