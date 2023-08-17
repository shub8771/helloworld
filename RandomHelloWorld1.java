import java.util.Random;

public class RandomHelloWorld1 {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int numLines = 3; // Change this to the desired number of lines
        
        for (int i = 0; i < numLines; i++) {
            printHelloWorld(random);
            System.out.println(); // Move to the next line
        }
        
    }
    
    // Function to print "hello world"
    private static void printHelloWorld(Random random) throws InterruptedException {
        String targetString = "helloworld";
        printTargetString(targetString, random);
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
