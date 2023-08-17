public class OverwriteOutputExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Progress:");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + "%");
            Thread.sleep(500); // Simulate some work
            int numBackspaces = String.valueOf(i).length() + 2; // Calculate the number of backspaces needed
            for (int j = 0; j < numBackspaces; j++) {
                System.out.print("\b");
            }
        }
        System.out.println(" Done!");
    }
}

