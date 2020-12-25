public class Main {
    public static void main(String[] args) {
        Engine engine =new Engine("Renault", 8000);
        Car mercedes = new Car("Mercedes AMG", 2, "Silver", engine);
        //Engine engine = mercedes.getEngine();

        System.out.println(mercedes.getName());
        System.out.println("Engine Model: " + mercedes.getEngine().getModel());

      //can not change the values or parameters of 'final'  vars unless setters are used
        final Engine engine1 = new Engine ("Renault", 8000);
        engine.setRpm(10000);


    }

}
