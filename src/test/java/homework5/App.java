package homework5;

public class App {
    public static void main(String[] args) throws InterruptedException {
        float[] array = createArray();
        float []leftSide = new float[array.length/2];
        float []rightSide = new float[array.length/2];

        System.arraycopy(array, 0, leftSide, 0, array.length/ 2);
        System.arraycopy(array, args.length / 2, rightSide, 0, array.length / 2);


        Thread thread1 = new Thread(new MyThreadOne(leftSide));
        Thread thread2 = new Thread(new MyThreadOne(rightSide));

        long startTime = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        if (thread1.isAlive()) {
            thread1.join();
        }
        if (thread2.isAlive()) {
            thread2.join();
        }

        System.arraycopy(leftSide, 0, array, 0, leftSide.length);
        System.arraycopy(rightSide, 0, array, array.length/2, rightSide.length);

        System.out.println("Заняло времени: "+ (System.currentTimeMillis()-startTime));
    }


    public static float[] createArray() throws InterruptedException {
        int size = 10_000_000;
        float[] array = new float[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
        return array;
    }

    public static void calculation(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }


    static class MyThreadOne implements Runnable {
        private float[] array;

        MyThreadOne(float[] array) {
            this.array = array;
        }

        @Override
        public void run() {
            calculation(array);
        }
    }

}
