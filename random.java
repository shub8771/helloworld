import java.util.Random;

public class random {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        char randomChar = 'e';
        // Generate a random character between 'a' and 'z'
        // int k=0;
        while (randomChar != 'l') {
            randomChar = (char) (random.nextInt(26) + 'a');
            System.out.print(randomChar);
            // k++;
            Thread.sleep(100);
            // if(randomChar!='l'){
            /*
             * System.out.print("\033[H\033[2J");
             * System.out.flush();
             */
            // for(int i=0;i<k;i++){
            if (randomChar != 'h') {
                System.out.print("\b");
            }
            // }
            // }
        }
        char randomCha = 'l';
        while (randomCha != 'e') {
            randomCha = (char) (random.nextInt(26) + 'a');
            System.out.print(randomCha);
            Thread.sleep(100);
            if (randomCha != 'e') {
                System.out.print("\b");
            }
        }
        char l = 'e';
        while (l != 'l') {
            l = (char) (random.nextInt(26) + 'a');
            System.out.print(l);
            Thread.sleep(100);
            if (l != 'e') {
                System.out.print("\b");
            }
        }

    }
}