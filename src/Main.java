public class Main {
    public static void main(String[] args) {
        KnifeStore store = new EuropeKnifeStore();
        Knife knife= store.orderKnife("chef");
        System.out.println(knife.name);

        store = new USKnifeStore();
        knife = store.orderKnife("chef");
        System.out.println(knife.name);

    }
}