package Att2;

public class App {
    public static void main(String[] args) {
        int elements[] = new int[10];

        for(int i = 0; i < elements.length; i++){
            elements[i] = i;
        }
        elements[5] = 8;
        Estatistica att = new Estatistica(elements);
        for(int element : att.getElements()){
            System.out.println(element);
        }
        System.out.println("Moda: "+att.moda());
        System.out.println("Mediana: "+att.mediana());
        System.out.println("Media: "+ att.media());
    }
    
}
