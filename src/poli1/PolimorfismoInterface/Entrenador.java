package poli1.PolimorfismoInterface;

public class Entrenador extends SeleccionFutbol{
    private int idFederacion;

    public Entrenador(){
        super();
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void entrenar() {
        System.out.println("Dirige un entrenamiento (clase entrenador)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Dirige un partido (clase entrenador)");
    }

    public void planificarEntrenamiento(){
        System.out.println("planificar entrenamiento");
    }
}
