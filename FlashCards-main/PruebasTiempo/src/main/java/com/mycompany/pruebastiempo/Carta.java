/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebastiempo;


class Carta<T> {
    public T pregunta;
    public T respuesta;
    public Carta<T> next;
    
    public Carta(T pregunta, T respuesta){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        next = null;
    }
    
    public T getPregunta(){
        return pregunta;
    }
    
    public T getRespuesta(){
        return respuesta;
    }
    
    public void setPregunta(T pregunta){
        this.pregunta = pregunta;
    }
    
    public void setRespuesta(T respuesta){
        this.respuesta = respuesta;
    }
    
    public Carta getNext(){
        return next;
    }
    
    public void setNext(Carta<T> next){
        this.next = next;
    }
}
