package adventures;

public class Adventures {

    public static void main(String[] args) {
        makeHeroes();
    }


    public static void makeHeroes() {
        Hero mirana=new Hero();
        Hero doom=new Hero("Doom", 36,21,28);
//        System.out.println(mirana.toString() + doom.toString());

        Mage kotl = new Mage("Kotl", 20, 22, 36, 380);
        System.out.println(kotl);

        kotl.addArtefact("arkane boots");
        System.out.println(kotl);


        kotl.updateArtefact(1, "qurterstaff");
        System.out.println(kotl);

        kotl.deleteArtefact(2);
        System.out.println(kotl);
    }


}
