import java.util.Random;

public class ConcurrentRandomHelloWorld {
    public static void main(String[] args) {
        int numLines = 3; // Change this to the desired number of lines
        int linesPerThread = 2; // Change this to the desired number of lines per thread
        
        for (int i = 0; i < numLines; i += linesPerThread) {
            for (int j = 0; j < linesPerThread; j++) {
                Thread thread = new Thread(new HelloWorldPrinter());
                thread.start();
            }
            
            // Wait for both threads to complete before proceeding
            try {
                Thread.sleep(2000); // Adjust the time based on your needs
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        try {
            printHelloWorld(random);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    // Function to print "hello world"
    private static void printHelloWorld(Random random) throws InterruptedException {
        String targetString = "helloworld";
        printTargetString(targetString, random);
        System.out.println(); // Move to the next line after printing
    }
    
    // Function to print the characters of the target string
    private static void printTargetString(String target, Random random) throws InterruptedException {
        for (char targetChar : target.toCharArray()) {
            char randomChar;
            do {
                randomChar = (char) (random.nextInt(26) + 'a');
                System.out.print(randomChar);
                Thread.sleep(100);
                System.out.print("\b");
            } while (randomChar != targetChar);
            System.out.print(targetChar);
        }
    }
}
