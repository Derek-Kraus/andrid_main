package com.example.trabajo1

open class FiguraGeometrica(private var _nombreFigura:String, private var _colorFigura:String) {
    public fun establecerNombreFigura(_nombreFigura: String){
        this._nombreFigura=_nombreFigura;
    }

    public fun obtenerNombreFigura():String{
        return this._nombreFigura;
    }

    public fun establecerColorFigura(_colorFigura: String){
        this._colorFigura=_colorFigura;
    }

    public fun obtenerColorFigura():String{
        return this._colorFigura;
    }


}