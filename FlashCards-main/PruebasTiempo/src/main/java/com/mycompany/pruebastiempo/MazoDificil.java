/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebastiempo;

public class MazoDificil<T> {
    public Carta front, rear, ptr;
    T item;
    int count;

    public MazoDificil(){
        front = null;
        rear = null;
        ptr = null;
        count = 0;
    }

    public void enqueue(T pregunta, T respuesta, int count){
        this.count = count;
        Carta<T> newp = new Carta<>(pregunta, respuesta);
        if (rear == null){
            front = newp;
            rear = newp;
        }
        else {
            if (count != 0){
                ptr = front;
                for (int i = 0; i < count; i++){
                    ptr = ptr.next;
                }
                newp.setNext(ptr.getNext());
                ptr.setNext(newp);
            }
            else{
                rear.setNext(newp);
                rear = newp;
            }
        }
    }

    public T dequeue(){
        if (empty()){
            System.out.println("Queue is empty!");
            return null;
        }
        item = (T) front;
        front = front.getNext();
        if (front == null){
            rear = null;
        }
        return item;
    }

    public boolean empty(){
        return front == null && rear == null;
    }
    public int size() {
        int size = 0;
        ptr = front;
        while (ptr != null) {
            size++;
            ptr = ptr.getNext();
        }
        return size;
    }
}
