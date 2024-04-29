package com.example.trabajo1


fun main(){

    val mune: Estudiante= Estudiante("Juan José",45,"11°A")
    mune.realizarTarea()

    val joan: Gerente= Gerente("Joan Sebastian",5000000,"Gerente",500000,0)
    joan.realizarTarea()

    val alejo: Vendedor= Vendedor("Alejandro Ospina",2000000,"Vendedor",9000,0)
    alejo.calcularSalario()

    val triangulo:FiguraGeometrica= FiguraGeometrica("triangulo","rojo")
    triangulo.obtenerColorFigura()
}