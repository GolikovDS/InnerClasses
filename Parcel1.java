package innerclasses;


public class Parcel1 {

    public Parcel1() {
        System.out.println("Constructor Parcel1");
    }

    class Contents {
        public Contents() {
            System.out.println("Constructor Inner Contents");
        }

        private int i = 11;
        public int value() { return i; }
    }

    class Destination {

        public Destination() {
            System.out.println("Constructor Inner Destination()");
        }

        private String label;

        Destination(String whereTo) {
            System.out.println("Constructor Inner Destination(String)");
            label = whereTo;
        }
        String readLabel() { return label; }
    }

    public void ship(String dest) {
        Contents c = new Contents();
        c.value();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }

}
