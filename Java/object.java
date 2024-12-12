class car {
    int topspeed;
    int power;
    int torque;
    String model;

    boolean ispanronicsunroof(boolean input) {
        return input;

    }

    static void isweight(int kilo) {
        System.out.print(kilo);
    }
}

    class object {
        public static void main(String[] args) {
            car tesla = new car();
            tesla.topspeed = 299;
            tesla.power = 186;
            tesla.torque = 350;
            tesla.model = "x";
            car.isweight(4250);
            boolean feature = tesla.ispanronicsunroof(false);
            System.out.print(feature);
            // System.out.println(tesla.topspeed);
            // System.out.println(tesla.power);
            // System.out.println(tesla.torque);
            // System.out.println(tesla.model);

        }
    }

