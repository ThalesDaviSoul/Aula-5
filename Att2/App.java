package Att2;

public class App {
    public static void main(String[] args) {
        int elements[] = new int[10];

        for(int i = 0; i < elements.length; i++){
            elements[i] = i;
        }
        elements[5] = 4;
        Estatistica att = new Estatistica(elements);
        System.out.println(att.moda());

    }
    
}
