package Prototype;

class PrototypeMain {
    public static void main(String[] args) {
        try {
            SuperAlienPhone S1 = new SuperAlienPhone();
            S1.getDetails();
            System.out.println(S1);
            System.out.println();

            SuperAlienPhone S2 = (SuperAlienPhone) S1.getClone();
            S2.setDriver("Grab");
            S2.getDetails();
            System.out.println(S2);

        } catch (Exception e) {
            System.out.println("whatsup");
        }
    }
}