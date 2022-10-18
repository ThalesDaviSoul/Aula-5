package Att3;

public class TrianguloPascal {
    private int numero_linhas;
    
    public TrianguloPascal(int numero_linhas){
        this.numero_linhas = numero_linhas;
    }


    public int[][] calcularTrianguloPascal(){
        int[][] triangulo = new int[numero_linhas][numero_linhas];
        for(int i = 0; i < numero_linhas; i++){
            for(int j = 0; j <= i; j++){
                if(i == 0 && j == 0){
                    triangulo[i][j] = 1;
                }else if(j == 0){
                    triangulo[i][j] = triangulo[i-1][j];
                }else{
                    triangulo[i][j] = 0;
                    triangulo[i][j] += triangulo[i-1][j-1];
                    triangulo[i][j] += triangulo[i-1][j];
                }
            }
        }
        return triangulo;
    }

    public void printTrianguloPascal(){
        int[][] triangulo = calcularTrianguloPascal();
        for(int i = 0; i < numero_linhas; i++){
            for(int j = 0; j < numero_linhas; j++){
                if(triangulo[i][j] == 0){
                    continue;
                }
                System.out.print(triangulo[i][j]+" ");
            }
            System.out.println();
        }
    }

}
