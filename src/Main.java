import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

            Set<Integer> hashSet = new HashSet<>();
            Set<Integer> linkedHashSet = new LinkedHashSet<>();
            Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(50) + 1;
            hashSet.add(randomNumber);
            linkedHashSet.add(randomNumber);
            treeSet.add(randomNumber);
        }

             System.out.println("HashSet:");
                for (Integer number : hashSet) {
                  System.out.print(number + " ");
        }
                System.out.println("\n\nLinkedHashSet:");
                for (Integer number : linkedHashSet) {
                 System.out.print(number + " ");
        }

                 System.out.println("\n\nTreeSet:");
                for (Integer number : treeSet) {
                 System.out.print(number + " ");
        }





    }
}