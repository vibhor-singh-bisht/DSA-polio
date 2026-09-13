// Demonstrates variable categories in Java: local, instance, static, and final.
public class Variables {

    static int staticCounter = 0;      // shared across all instances, one copy per class
    int instanceField = 0;             // one copy per object
    final double PI_APPROX = 3.14159;  // final: must be assigned once, cannot change after

    void increment() {
        int local = 1;          // local variable: only exists inside this method
        staticCounter += local;
        instanceField += local;
    }

    public static void main(String[] args) {
        Variables v1 = new Variables();
        Variables v2 = new Variables();

        v1.increment();
        v2.increment();

        // static field is shared -> both increments add up
        System.out.println("staticCounter: " + staticCounter); // 2

        // instance field is per-object
        System.out.println("v1.instanceField: " + v1.instanceField); // 1
        System.out.println("v2.instanceField: " + v2.instanceField); // 1

        System.out.println("PI_APPROX: " + v1.PI_APPROX);

        // Local variable scope example
        for (int i = 0; i < 3; i++) {
            int loopLocal = i * i; // scoped to the loop body
            System.out.println("loopLocal: " + loopLocal);
        }
    }
}
