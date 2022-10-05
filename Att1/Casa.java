package Att1;
public class Casa {
    private String color;
    private int totalDoors;
    private Porta doors[];

    public Casa(String color, int totalDoors){
        this.color = color;
        this.totalDoors = totalDoors;
        this.doors = new Porta[totalDoors];
        for(int i = 0; i < totalDoors; i++){
            doors[i] = new Porta(true);
        }
    }
    
    public void paintHouse(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public int openDoors(){
        int counter = 0;
        for(Porta door : doors){
            if(door.isOpen()){
                counter++;
            }
        }
        return counter;
    }

    public int getTotalDoors(){
        return totalDoors;
    }

    public void addDoor(Porta nw){
        int i;
        Porta d[] = new Porta[totalDoors + 1];
        for(i = 0; i < totalDoors; i++){
            d[i] = doors[i];
        }
        d[i] = nw;
        totalDoors++;
        doors = d;
    }

}
