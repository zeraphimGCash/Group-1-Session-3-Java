package Prototype;



class PrototypeMain {
    public static void main(String[] args) {
        try {
            SuperAlienPhone S1 = new SuperAlienPhone();
            S1.getDetails();
            S1.phoneSpecs();
            System.out.println();

            SuperAlienPhone S2 = (SuperAlienPhone) S1.getClone();
            S2.setPhone("Samsung");
            S2.getDetails();
            S2.phoneSpecs();
            System.out.println();


        } catch (Exception e) {
            System.out.println("whatsup");
        }
    }
}