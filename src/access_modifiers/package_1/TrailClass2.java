package access_modifiers.package_1;

public class TrailClass2 {
    public int publicVar2;
    private int privateVar2;
    protected int protectedVar2;
    int defaultVar2;

    public void publicMeth2(){
        System.out.println("Hello form publicMeth2");

    }
    private void privateMeth2(){
        System.out.println("Hello form privateMeth2");

    }

    protected void protectedMeth2(){
        System.out.println("Hello form protectedMeth2");

    }

    void defaultMeth2(){
        System.out.println("Hello form defaultMeth2");

    }
    TrailClass2(){
    }

    public static void main(String[] args) {







    }
}

class TrailClass2_SubClass extends TrailClass2{

}


