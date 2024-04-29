package com.example.trabajo1

open class Empleado(private var _nombre:String, private var _salario:Int, private var _cargo:String):Trabajador {

    public fun establecerNombre(_nombre:String){
        this._nombre=_nombre;
    }

    public fun obtenerNombre():String{
        return this._nombre;
    }

    public fun establecerSalario(_salario: Int){
        this._salario=_salario;
    }

    public fun obtenerSalario():Int{
        return this._salario;
    }

    public fun establecerCargo(_cargo: String){
        this._cargo=_cargo;
    }

    public fun obtenerCargo():String{
        return this._cargo;
    }

    override fun realizarTarea() {
        println("Realizando tarea laboral");
    }

}