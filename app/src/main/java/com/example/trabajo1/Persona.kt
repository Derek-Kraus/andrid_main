package com.example.trabajo1

open class Persona(private var _nombre:String, private var _edad:Int) {
    public fun establecerNombre(_nombre:String){
        this._nombre=_nombre;
    }

    public fun obtenerNombre():String{
        return this._nombre;
    }

    public fun establecerEdad(_edad:Int){
        this._edad=_edad;
    }

    public fun obtenerEdad():Int{
        return this._edad;

    }

}