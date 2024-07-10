package Prototype;

class PrototypeMain {
    public static void main(String[] args) {
        try {
            SuperAlienCar S1 = new SuperAlienCar();
            S1.getDetails();
            System.out.println(S1);
            System.out.println();

            SuperAlienCar S2 = (SuperAlienCar) S1.getClone();
            S2.setDriver("Grab");
            S2.getDetails();
            System.out.println(S2);

        } catch (Exception e) {
            System.out.println("whatsup");
        }
    }
}