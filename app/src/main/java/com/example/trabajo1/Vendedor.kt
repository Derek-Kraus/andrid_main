package com.example.trabajo1

class Vendedor(private var _nombre:String, private var _salario:Int, private var _cargo:String, private var _comisionVenta:Int, private var _salarioNeto:Int):Empleado(_nombre,_salario,_cargo) {
    public fun calcularSalario(){
        _comisionVenta = 10000

        _salarioNeto = _salario + _comisionVenta

        println("El salario del Vendedor es: ${_salarioNeto}")
    }
}