package ss10_list.bai_tap.array_list;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> listInteger= new MyList<Integer>();
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(2, 13);

        System.out.println("xóa"+listInteger.remove(1));
        System.out.println(listInteger.get(0));
        System.out.println(listInteger.get(1));
        System.out.println(listInteger.get(2));
        System.out.println(listInteger.get(3));
        System.out.println(listInteger.size());

        listInteger.clear();
        System.out.println("after run method clear: "+listInteger.size());
    }
}
