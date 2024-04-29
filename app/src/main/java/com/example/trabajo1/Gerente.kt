package com.example.trabajo1

class Gerente(private var _nombre:String, private var _salario:Int, private var _cargo:String, private var _bono:Int, private var _salarioNeto:Int):Empleado(_nombre,_salario,_cargo) {
    public fun calcularSalario(){
        _bono = 100000

        _salarioNeto = _salario + _bono

        println("El salario del Gerente es: ${_salarioNeto}")
    }
}