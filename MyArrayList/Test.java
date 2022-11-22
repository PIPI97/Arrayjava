public class Test {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        list.add(2, 99);
//        System.out.println(list.remove(3));
//        list.clear();
//        System.out.println(list.get(3));
        System.out.println(list);

    }
}
