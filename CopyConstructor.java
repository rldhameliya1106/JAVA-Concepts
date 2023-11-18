package JAVA;

public class CopyConstructor {
int id;String name;
    CopyConstructor(int x,String y){
        id=x;
        name=y;
    }
    CopyConstructor(CopyConstructor CC){
        id = CC.id;
        name = CC.name;
    }

    void display(){
        System.out.println("id: "+id + "\t" + "Name: " + name);
    }
    public static void main(String[] args) {
        CopyConstructor CC = new CopyConstructor(1,"RD");
        CopyConstructor CC1 = new CopyConstructor(CC);
        CC.display();
        CC1.display();
    }
}
