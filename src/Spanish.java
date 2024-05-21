
public class Spanish extends Human{


    public Spanish (String name){

        super (name);

    }

    public String getNationalSong(){
        return "Du gamla du fria";
    }

    public void talk(){
        System.out.println("Hej mitt namn är" + name + "Eres viejo eres libre");
    }
}