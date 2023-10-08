/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CrearMazo;


class Carta1<T> {
    public T pregunta;
    public T respuesta;
    public Carta1<T> next;
    
    public Carta1(T pregunta, T respuesta){
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
    
    public Carta1 getNext(){
        return next;
    }
    
    public void setNext(Carta1<T> next){
        this.next = next;
    }
}
