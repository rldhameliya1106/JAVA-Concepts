package JAVA;
class OuterClass{
    int x=20;
    public class IClass{
        int s(){
            return x;
        }

    }
}
public class InnerClass {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.IClass y = o.new IClass();
        System.out.println(y.s());
    }
}
