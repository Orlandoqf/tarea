package poli1.PolimorfismoInterface;

public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;
    public Futbolista(){
        super();
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void entrenar() {
        System.out.println("realiza un entrenamiento(clase futbolista)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugar un partido(clase futbolista)");
    }

    public void entrevista (){
        System.out.println("da una entrevista");
    }
}
