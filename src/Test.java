public class Test {
    public static void main(String[] args){
        Steel steel = new Steel();
        Plastic plastic = new Plastic();
        Copper copper = new Copper();
        Iron iron = new Iron();
        Sword<Metal> sword = new Sword<>(steel);
        System.out.println(sword.checkEndurance());
    }
}