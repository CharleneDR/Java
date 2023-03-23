public class ClassRoom {
    public static void main(String[] args) {
        Wilder charlene = new Wilder("Charlène", true);
        Wilder matthieu = new Wilder("Matthieu", false);
        Wilder thomas = new Wilder("Thomas", true);

        System.out.println(charlene.whoAmI());
        System.out.println(matthieu.whoAmI());
        System.out.println(thomas.whoAmI());
    }
}