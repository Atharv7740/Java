package access_modifiers.package_2;
import access_modifiers.package_1.TrailClass2;

public class CheckClass extends TrailClass2{
    public static void main(String[] args) {
        CheckClass obj = new CheckClass();
        CheckClass.staticVar2=50;
        System.out.println(staticVar2);




    }
}

class CheckClass_SubClass extends TrailClass2 {

}
