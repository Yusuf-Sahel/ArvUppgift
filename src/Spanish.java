
public class Spanish extends Human{


    public Spanish (String name){

        super (name);

    }


    public String getNationalSong(){
        return "Du gamla du fria";
    }

    @Override
    public void talk(){
        System.out.println("Hola, mi nombre es: " + name + "y nuestro himno nacional es: " + getNationalSong()+"");
    }
}