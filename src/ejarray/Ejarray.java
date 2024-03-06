package ejarray;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejarray {

    public static void main(String[] args) {
        System.out.println("ejcutaer");
        ArrayList<Aprendiz> listaAprendiz = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Aprendiz miAprendiz = new Aprendiz();
            miAprendiz.setId(i);
            System.out.println("ingrese el nombre edel niño");
            miAprendiz.setNombre(teclado.next());
            miAprendiz.setN1(7);
            miAprendiz.setN2(4);
            miAprendiz.setN3(9);
            listaAprendiz.add(miAprendiz);
        }

        System.out.println("imprimiendo lo aprendices agregados a la lista");
        for (Aprendiz var : listaAprendiz) {
            System.out.println("id "+var.getId());
            System.err.println("mi nombre es"+var.getId());
            
            
        }
    }

}
