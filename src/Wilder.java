public class Wilder {
    private String firstName;
    private boolean aware;

    public Wilder(String firstName, boolean aware){
        this.firstName = firstName;
        this.aware = aware;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String setFirstName(){
        return this.firstName;
    }

    public boolean isAware(){
        return this.aware;
    }

    public boolean setAware(){
        return this.aware;
    }

    public String whoAmI(){
        if(this.isAware()){
            return "Je m'appelle" + " " + this.getFirstName() + " " + "et je suis aware";
        }else{
            return "Je m'appelle" + " " + this.getFirstName() + " " + "et je ne suis pas aware";
        }
    };
}
