public class English extends Human{

    //Nedan är det konstruktorn
    public English (String name){

        super (name);

    }

    public String getNationalSong(){
        return "Du gamla du fria";
    }

    public void talk(){
        System.out.println("Hello my name is: " + name + "and our national anthem is: " + getNationalSong()+"");
    }

}