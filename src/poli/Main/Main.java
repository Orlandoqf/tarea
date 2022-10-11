package poli.Main;

import poli1.PolimorfismoInterface.Entrenador;
import poli1.PolimorfismoInterface.Futbolista;
import poli1.PolimorfismoInterface.Masajista;
import poli1.PolimorfismoInterface.SeleccionFutbol;

import java.util.ArrayList;
import java.util.Formattable;

public class Main {
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

            SeleccionFutbol UnEntrenador = new Entrenador(1,"Ricardo","Gareca",60,28489);
            SeleccionFutbol UnJugador = new Futbolista(2,"Paolo","Guerrero",29,6,"Delantero");
            SeleccionFutbol UnMasajista = new Masajista(3,"Raul","Martinez",41,"licenciado en Fisioterapia",18);
            integrantes.add(UnEntrenador);
            integrantes.add(UnJugador);
            integrantes.add(UnMasajista);
            //concentracion
        System.out.println("todos los integrantes comienzan una concentracion .(todos ejecutan el mismo metodo)");
        for(SeleccionFutbol integrante : integrantes){
            System.out.println(integrante.getNombre()+" "+ integrante.getApellidos()+"->");
            integrante.concentrarse();
        }
        //viaje
        System.out.println("\nTodos los integrantes viajan para jugar un partido (todos ejecutan el mismo metodo)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.println(integrante.getNombre()+" "+integrante.getApellidos()+"->");
            integrante.viajar();

        }
        //entrenamiento
        System.out.println("\nTodos los integrantes tienen su funcion en un entrenamiento (especializado)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.println(integrante.getNombre()+" "+integrante.getApellidos()+"->");
            integrante.jugarPartido();
        }
        //PLANIFICAR ENTRENAMIENTO
        System.out.println("\nPlanificar entrenamiento : solo el entrenador tiene el metodo para planifincar un entrenamiento");
        System.out.println(UnEntrenador.getNombre()+" "+UnEntrenador.getApellidos()+"->");
        ((Entrenador)UnEntrenador).planificarEntrenamiento();
        //Entrevista
        System.out.println("\nEntrevista : Solo el futbolista tiene el metodo para dar una entrevista:");
        System.out.println(UnJugador.getNombre()+" "+UnJugador.getApellidos()+"->");
        ((Futbolista)UnJugador).entrevista();
        //masaje
        System.out.println("\nMasaje: solo el masajista tiene el metodo para dar masaje:");
        System.out.println(UnMasajista.getNombre()+" "+UnMasajista.getApellidos()+"->");
        ((Masajista)UnMasajista).masaje();
    }
}
