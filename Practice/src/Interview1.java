//class Interview1 {
//    int m(){
//        try{
//            return 10;
//        }
//        catch(Exception e){
//            return 20;
//        }
//        finally{
//            return 40;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(m());
//    }
//}


class A{
    int x = 10;

    void val(){
        System.out.println("A");
    }
}

class B extends A{
    int x = 20;

    void val(){
        System.out.println("B");
    }
}

class C{
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
        a.val();

    }
}