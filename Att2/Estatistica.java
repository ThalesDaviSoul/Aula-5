package Att2;


public class Estatistica {
    private int elements[];

    public int[] getElements(){
        return this.elements;
    }

    public Estatistica(int elements[]){
        this.elements = elements;
    }

    public void printE(){
        for(int i = 0; i < elements.length; i++){
            System.out.println(elements[i]);
        }
    }

    public int moda(){
        int counter = 0;
        int actual;
        int tendency = 0;
        int tCount = 0;
        for(int i = 0; i < elements.length; i++){
            actual = elements[i];
            for(int j = 0; j < elements.length; j++){
                if(actual == elements[j]){
                    counter++;
                }
            }
            if(tCount < counter){
                tendency = actual;
                tCount = counter;
            }
            counter = 0;
        }
        if(tCount == 1 && elements.length != 1){
            return 0;
        }
        return tendency;
    }


    public float mediana(){
        float resultado = 0;
        if(elements.length % 2 == 0){
            resultado += elements[(int)(elements.length/2)-1];
            resultado += elements[(int)(elements.length/2)];
            resultado /= 2;

        }else{
            resultado += elements[elements.length/2];
        }
        return resultado;
    }

    public float media(){
        float media = 0;
        for(int e : elements){
            media+=e;
        }
        return media/elements.length;
    }

}
