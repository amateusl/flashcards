package CrearMazo;

public class Carta {
    private String clave;
    private String respuesta;

    public Carta(String clave, String respuesta) {
        this.clave = clave;
        this.respuesta = respuesta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Palabra clave: " + clave + "\nRespuesta: " + respuesta;
    } 
}
