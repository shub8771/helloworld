import java.util.Random;

public class RandomHelloWorld {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        
        // Generate the characters for "hello"
        String targetString = "hello";
        printTargetString(targetString, random);
        
        // Generate the characters for "world"
        targetString = "world";
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
