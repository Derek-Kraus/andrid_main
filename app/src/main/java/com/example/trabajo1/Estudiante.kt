package com.example.trabajo1


class Estudiante(private var _nombre:String, private var _edad:Int, private var _grado:String):Persona(_nombre, _edad),Trabajador {

    public fun establecerGrado(_grado:Int){
        this._grado = _grado.toString();
    }
    public fun obtenerGrado():String{
        return this._grado
    }

    override fun realizarTarea() {
        println("Realizando tarea escolar");
    }
}