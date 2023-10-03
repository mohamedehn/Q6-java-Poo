public class Classroom{
    public static void main(String[] args) {

        Wilder Marc = new Wilder("Marc", false);
        System.out.println(Marc.whoAmI());

        Wilder Jennifer = new Wilder("Jennifer", true);
        System.out.println(Jennifer.whoAmI());

        Wilder Edward = new Wilder("Edward", true);
        System.out.println(Edward.whoAmI());

        Wilder Florent = new Wilder("Florent", false);
        System.out.println(Florent.whoAmI());
    }


}