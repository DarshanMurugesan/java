import java.util.*;

public class CollectionReverseIteratorDemo {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("ArrayList (reverse):");
        ListIterator<String> arrayListIt = arrayList.listIterator(arrayList.size());
        while (arrayListIt.hasPrevious()) {
            System.out.println(arrayListIt.previous());
        }

        
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Dog", "Elephant", "Frog"));
        System.out.println("\nLinkedList (reverse):");
        ListIterator<String> linkedListIt = linkedList.listIterator(linkedList.size());
        while (linkedListIt.hasPrevious()) {
            System.out.println(linkedListIt.previous());
        }

        
        Vector<String> vector = new Vector<>(Arrays.asList("Giraffe", "Horse", "Iguana"));
        System.out.println("\nVector (reverse):");
        ListIterator<String> vectorIt = vector.listIterator(vector.size());
        while (vectorIt.hasPrevious()) {
            System.out.println(vectorIt.previous());
        }

        
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList("Jackal", "Kangaroo", "Lion"));
        System.out.println("\nStack (reverse):");
        ListIterator<String> stackIt = stack.listIterator(stack.size());
        while (stackIt.hasPrevious()) {
            System.out.println(stackIt.previous());
        }

        
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Arrays.asList("Monkey", "Narwhal", "Octopus"));
        System.out.println("\nPriorityQueue (reverse):");
        List<String> pqList = new ArrayList<>(priorityQueue);
        Collections.sort(pqList, Collections.reverseOrder());  // Optional: reverse natural order
        ListIterator<String> pqIt = pqList.listIterator(pqList.size());
        while (pqIt.hasPrevious()) {
            System.out.println(pqIt.previous());
        }

        
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(Arrays.asList("Penguin", "Quail", "Rabbit"));
        System.out.println("\nArrayDeque (reverse):");
        List<String> dequeList = new ArrayList<>(arrayDeque);
        ListIterator<String> dequeIt = dequeList.listIterator(dequeList.size());
        while (dequeIt.hasPrevious()) {
            System.out.println(dequeIt.previous());
        }

        
        Set<String> set = new HashSet<>(Arrays.asList("Snake", "Tiger", "Umbrella bird"));
        System.out.println("\nSet (HashSet - reverse):");
        List<String> setList = new ArrayList<>(set);
        ListIterator<String> setIt = setList.listIterator(setList.size());
        while (setIt.hasPrevious()) {
            System.out.println(setIt.previous());
        }

    
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Vulture");
        map.put(2, "Wolf");
        map.put(3, "Xerus");
        System.out.println("\nMap (HashMap - reverse):");
        List<Map.Entry<Integer, String>> mapEntries = new ArrayList<>(map.entrySet());
        ListIterator<Map.Entry<Integer, String>> mapIt = mapEntries.listIterator(mapEntries.size());
        while (mapIt.hasPrevious()) {
            Map.Entry<Integer, String> entry = mapIt.previous();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
________________________________________
