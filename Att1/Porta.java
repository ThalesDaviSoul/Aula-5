package Att1;
public class Porta {
    private String state;

    public Porta(boolean isOpen){
        if(isOpen == true){
            this.state = "open";
        }else{
            this.state = "close";
        }
    }
    
    public boolean isOpen(){
        if(state == "open"){
            return true;
        }else{
            return false;
        }
    }

    

}
