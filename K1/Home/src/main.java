public class main {
    public static void main(String[] args) {
        Rnd rnd = new Rnd();
        int a[] = rnd.random();
        rnd.print(a);
        rnd.sort(a);
        System.out.print("\nSorted ");
        rnd.print(a);
    }
}
//۱۰ عدد صحیح random