package src.multithreading;

public class Multithreading {

    public static void main(String[] args) {

//    ThreadClass myThread0 = new ThreadClass();
//    ThreadClass myThread1 = new ThreadClass();
//
//    myThread0.start();
//    myThread1.start();

        for (int i = 0; i < 3; i++) {
            ThreadClass myThread = new ThreadClass(i);
            myThread.start();
        }




    }
}
