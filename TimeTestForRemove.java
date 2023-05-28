import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimeTestForRemove {


    public static void main(String[] args) throws IOException {
        ArrayList<FibonacciHeap> heaps = new ArrayList<>();
        ArrayList<FibonacciHeap> heapsForRemove = new ArrayList<>();
        int N = -1;
        for (int i = 1; i < 1001; i++) {
            Scanner in = new Scanner(new FileInputStream("text" + i + ".txt"));
            FibonacciHeap H1 = new FibonacciHeap();
            while (N != 0 && in.hasNext()) {
                N = in.nextInt();
                for (int k = 0; k < N; k++) {
                    int number = in.nextInt();
//                    Node node = new Node("fff", number);
                    H1.insert("fff", number);
                }
            }
            heaps.add(H1);
            in.close();
        }
        File file = new File("src/TimeRemove.txt");
        Writer writer = new FileWriter("src/TimeRemove.txt");
        for (int i = 0; i < 1000; i++) {
            double start = System.nanoTime();
            heaps.get(i).removeMin();
            double end = System.nanoTime();
            double ready = end - start;
            writer.write(String.format("%.2f", ready) + "\n");
        }
        System.out.println(heaps);
        writer.close();
    }
}


