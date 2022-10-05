package Att1;
public class App{
    public static void main(String[] args) {
        Casa c1 = new Casa("Verde", 0);
        //Pintando a casa
        c1.paintHouse("Vermelho");
        
        //Adicionando 3 portas
        c1.addDoor(new Porta(true));
        c1.addDoor(new Porta(true));
        c1.addDoor(new Porta(false));

        //Escrevendo o num de portas e quantas delas estão abertas
        System.out.println("O número total de portas é: "+c1.getTotalDoors()+" das quais "+c1.openDoors()+" estão abertas.");

        //Escrevendo a cor da casa
        System.out.println("Cor da casa: "+c1.getColor());
    }
}