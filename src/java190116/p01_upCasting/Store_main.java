package java190116.p01_upCasting;

public class Store_main {

    //

    public static void main(String[] args) {
        ParentStore parents = new ParentStore();
        ChildStore childs = new ChildStore();

        parents.jajang();
        childs.jajang();
        childs.zzambbong();
        childs.tangsu();

        System.out.println("============================");

        parents = new ChildStore();
        parents.jajang();
        parents.zzambbong();


        System.out.println("============================");


    }


}
