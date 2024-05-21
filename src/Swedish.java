
public class Swedish extends Human {

    public Swedish(String name){
        super (name);

    }

    public String getNationalSong(){
        return "Du gamla du fria du";
    }

    public void talk(){
        System.out.println("Hej mitt namn är" + name + "Eres viejo eres libre");
    }
}