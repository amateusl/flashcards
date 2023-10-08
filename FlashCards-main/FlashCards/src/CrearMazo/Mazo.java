package CrearMazo;
import java.util.ArrayList;

public class Mazo {
    private String nombre;
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Mazo(String nombre, ArrayList<Carta> cartas) {
        this.nombre = nombre;
        this.cartas = cartas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    
    public void añadirCarta(Carta carta){
        cartas.add(carta);
    }
    
    public void eliminarCarta(String nombre){
        for(int i=0;i<cartas.size();i++){
            if(cartas.get(i).getClave().equals(nombre)){
                cartas.remove(i);
            }
        }
    }
    
    public void mostrarCartas(){
        for(int i=0;i<cartas.size();){
            System.out.println(cartas.get(i));
        }
    }

    @Override
    public String toString() {
        return "Mazo{" + "nombre=" + nombre + ", cartas=" + cartas + '}';
    }
   
}
