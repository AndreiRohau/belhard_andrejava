package els3.objects;//      https://github.com/AndreiRohau/belhard_andrejava.git

public class UserMain {

    public static void main(String[] args) {
        A a = new A(5);
        System.out.println(A.getA());
        A.setA(6);

        B b = new B(a);
        A.setA(7);
//        System.out.println(els3.objects.A.toString());
        System.out.println(A.getA());
        System.out.println(b.getB());


    }
}
