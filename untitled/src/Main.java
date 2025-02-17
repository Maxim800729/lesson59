import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;


class Person {
    String name;
    String surname;
    String pin;


    public Person(String name, String surname, String pin) {
        this.name = name;
        this.surname = surname;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return name + ' ' + surname + ' ' + pin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pin.equals(person.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin);
    }
}


class MySet<E> {
    private ArrayList<E> elements;  // Динамический массив для хранения элементов

    // Конструктор
    public MySet() {
        elements = new ArrayList<>();
    }

    // 1. Добавляет элемент в множество, если его еще нет
    public boolean add(E e) {
        if (!contains(e)) {
            elements.add(e);
            return true;
        }
        return false;
        // TODO: Реализация
    }

    // 2. Удаляет элемент из множества
    public boolean remove(Object o) {
        // TODO: Реализация
        return elements.remove(o);
    }


    // 3. Проверяет, содержит ли множество указанный элемент
    public boolean contains(Object o) {
        // TODO: Реализация
        return elements.contains(o);
    }

    // 4. Возвращает количество элементов в множестве
    public int size() {
        // TODO: Реализация
        return elements.size();
    }

    // 5. Проверяет, пусто ли множество
    public boolean isEmpty() {
// TODO: Реализация
//    return false;
        return elements.isEmpty();
    }

    // 6. Удаляет все элементы из множества
    public void clear() {
//    // TODO: Реализация
        elements.clear();
    }

    // 7. Добавляет все элементы из указанной коллекции в множество
    public boolean addAll(Collection<? extends E> c) {
//    // TODO: Реализация
        boolean modified = false;
        for (E e : c) {
            if (add(e)) {
                modified = true;
            }
        }
        return modified;
    }

    // 8. Проверяет, содержит ли множество все элементы из указанной коллекции
    public boolean containsAll(Collection<?> c) {
        // TODO: Реализация
        return elements.containsAll(c);
    }

    // 9. Удаляет из множества все элементы, которые есть в указанной коллекции
    public boolean removeAll(Collection<?> c) {
        // TODO: Реализация
        return elements.removeAll(c);
    }
//

    /// / 10. Сохраняет только те элементы, которые есть в указанной коллекции
    public boolean retainAll(Collection<?> c) {
//    // TODO: Реализация
        return elements.retainAll(c);
    }

    public void printElements() {
        System.out.println(elements);
    }
}


public class Main {
    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(40);
        mySet.printElements();

        Collection<Integer> removeSet = new ArrayList<>();
        removeSet.add(20);
        removeSet.add(30);
        System.out.println(mySet.removeAll(removeSet));
        mySet.printElements();

        Collection<Integer> retainSet = new ArrayList<>();
        retainSet.add(40);
        retainSet.add(50);
        System.out.println(mySet.retainAll(retainSet));
        mySet.printElements();

        mySet.clear();
        System.out.println(mySet.isEmpty());
        mySet.printElements();
    }
}
//        HashSet<Person> people = new HashSet<>();
//        people.add(new Person("Farid","Abdullayev","11111"));
//        people.add(new Person("н","н","11111"));
//        people.add(new Person("x","x","2222"));
//        people.add(new Person("x","x","2222"));
//        people.add(new Person("Dima","Zaycev","33333"));
//        people.add(new Person("Oleq","Qazmanov","44444"));
//
//
//        System.out.println(people);


//        String str1 = new String("Farid");
//        String str2 = new String("Farid");
//
//        System.out.println(str1==str2);


//        System.out.println("Farid");
//        System.out.println("Farid");

//        System.out.println(str1);
//        System.out.println(str2);

//        System.out.println(str1.hashCode());//67649106
//        System.out.println(str2.hashCode());//67649106
//        System.out.println("FArid".hashCode());//67649106
//        System.out.println("Farid".hashCode());//67649106

//       SortedSet<String> sortedSet = new TreeSet<>();
//       sortedSet.add("Zena Qerakl");
//       sortedSet.add("Zena Qerakl");
//       sortedSet.add("Yaquar Priora");
//       sortedSet.add("Yaquar Priora");
//       sortedSet.add("Qazmanov Oleq");
//       sortedSet.add("Qazmanov Oleq");
//       sortedSet.add("Abdullayev Farid");
//       sortedSet.add("Abdullayev Farid");
//       sortedSet.add("Abdullayev Anna");
//       sortedSet.add("Abdullayev Anna");

//
//        System.out.println(new Character('A').hashCode());
//
//
//
//
//        HashSet<Object> hashSet = new HashSet<>();
//        hashSet.add(new Character('A'));
//        hashSet.add(65);
//        System.out.println(hashSet);


//        System.out.println(sortedSet);


//        Set<String> set1 = new LinkedHashSet<>();


//        Set<String> set1 = new HashSet<>();
//        set1.add("1");//-
//        set1.add("3");
//        set1.add("4");//-
//        Set<String> set2 = new HashSet<>();
//        set2.add("1");
//        set2.add("2");
//        set2.add("4");
//        set2.add("5");
//        set2.add("6");


//        set1.removeAll(set2);

//
//        System.out.println(set1);
//        System.out.println(set2);


/// ///////////////////////////////////////////////////////////////

//        Set<String> set = new HashSet<>();
//        //UNIQUE
//        //Poryadok ne qarantirovan
//        //Null 1
//
//        set.add("Farid Abdullayev");
/// /        set.add("Farid");
//        set.add("Dima");
//        set.add("Dima");
//        set.add("Oleq");
//        set.add("Oleq");


//        System.out.println(set.remove(" 1"));

//        System.out.println(set.contains("Farid"));
//        set.clear();
//        set.isEmpty();

//        set.removeAll(set);
//        set.retainAll(set);

//        for (String value:set) {
//            System.out.print(value + " ");
//        }


/// ///////////////////////////////////////////////////////////////

//FIFO First in First Out

//        Queue<Integer> queue = new LinkedList<>();
//        Queue<Integer> queue = new PriorityQueue<>();
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.offer(1);//Add end (return true , false)
//        queue.offer(2);//Add end (return true , false)
//        queue.offer(3);//Add end (return true , false)
//        queue.offer(4);//Add end (return true , false)
//        queue.clear();
//        queue.add(10);//Add end
//        Integer removed = queue.remove();//
//        Integer removed = queue.poll();//
//        Integer val = queue.element();//
//        Integer val = queue.peek();//
/// /        System.out.println(removed + " bil udalen");
//        System.out.println(val + " sled element");
//        for (Integer num:queue) {
//            System.out.print(num + " ");
//        }

//LIFO Last in First Out

//        Stack<Integer> stack
//        Deque<Integer> deque;
//        ArrayDeque<Integer> deque;
//        ArrayDeque<Integer> deque;


//        Deque<Integer> deque = new ArrayDeque<>();
//
//
//        deque.push(1);
//        deque.push(2);
//        deque.push(3);
//        deque.push(4);
//// deque.clear();
////        deque.add(1);
////        deque.add(2);
////        deque.add(3);
////        deque.add(4);
//
//        for (Integer val: deque) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
//
//      Integer val = deque.pop();
////      Integer val = deque.peek();
//        System.out.println(val + " bil udalen");
//        for (Integer num: deque) {
//            System.out.print(num + " ");
//        }


//       FIFO (Queue)           LIFO (Stack)
//    First in First Out    Last in First Out
//       Ocered zadac         Alqoritmi poiska
//       ArrayDeque             ArrayDeque
//       LinkedList             Stack
//       PriroriyQueue


//        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
//
//
//        arrayDeque.addFirst("1");//add v nacalo
//        arrayDeque.addLast("2");//add konec
//
//        arrayDeque.offerFirst("3");//add v nacalo
//        arrayDeque.offerLast("4");//add konec
//        arrayDeque.add("5");//add konec
//        arrayDeque.offer("6");//add konec
//        arrayDeque.push("6");//add konec
//
//        for (String val:arrayDeque) {
//            System.out.print( val + " ");
//        }
//        System.out.println();

//        arrayDeque.clear();
//        System.out.println( arrayDeque.removeLast() + " bil udalen");//exception
//        System.out.println( arrayDeque.removeFirst() + " bil udalen");//exception

//
//        System.out.println( arrayDeque.pop() + " bil udalen analoq removeFirst");//null
//        System.out.println( arrayDeque.pollFirst() + " bil udalen");//null
//        System.out.println( arrayDeque.pollLast() + " bil udalen");//null


//        System.out.println(arrayDeque.getFirst());//no such element exception
//        System.out.println(arrayDeque.getLast());//no such element exception


//        System.out.println( arrayDeque.peek() + " vernuli analoq peekFirst");//null
//        System.out.println(arrayDeque.peekFirst());//null
//        System.out.println(arrayDeque.peekLast());//null


//        for (String val:arrayDeque) {
//            System.out.print( val + " ");
//        }
//        System.out.println();


//        Queue<String> queue = new ArrayBlockingQueue<>(3);
//        System.out.println(queue.offer("1"));
//        System.out.println(queue.offer("2"));
//        System.out.println(queue.offer("3"));
//        System.out.println(queue.offer("4"));
//        System.out.println(queue.offer("5"));
//
//        for (String val:queue) {
//            System.out.print( val 