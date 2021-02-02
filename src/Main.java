import java.util.*;

public class Main {
    /*
    * Version 1 of lambdas expressions
    * */
    public void ordenar() {
        List<String> lista = new ArrayList<String>();
        lista.add("Roberto");
        lista.add("Citlaly");
        lista.add("Maradonio");
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String el : lista) {
            System.out.println(el);
        }
    }
    public void ordenarLambda() {
        List<String> lista = new ArrayList<String>();
        lista.add("Roberto");
        lista.add("Citlaly");
        lista.add("Maradonio");
        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
        lista.forEach(System.out::println);
    }
    public void calcular() {
        Operacion operacion = new Operacion() {
            @Override
            public double calcArg(double n1, double n2) {
                return (n1 + n2) / 2;
            }
        };
        System.out.println(operacion.calcArg(3, 4));
    }
    public void calLambda() {
//        Operacion operacion = (double x, double y) -> (x + y) / 2;
        Operacion operacion = (double x, double y) -> {
            return (x + y) / 2;
        };

        System.out.println(operacion.calcArg(3,4));
    }

    public static void main(String[] args) {
        Main app = new Main();
        System.out.println("");
        app.ordenar();
        System.out.println("");
        app.ordenarLambda();
        System.out.println("");
        app.calcular();
        System.out.println("");
        app.calLambda();
//        System.out.println("hola mundo");
    }


}
