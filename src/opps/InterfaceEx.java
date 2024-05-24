package opps;



interface printable {
    void print();
}


class A6 implements printable {
    public void print() {
        System.out.println("Interface Method Implementation");
    }
}

    public class InterfaceEx {

        public static void main(String args[]) {
            A6 obj = new A6();
            obj.print();
        }
    }
