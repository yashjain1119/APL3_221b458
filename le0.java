class Juet
{
int age;
String name;
public void SetageAndname(int a, String n){
    this.age=a;
    this.name=n;

}
public void getageandname(){
    System.out.println(name+" age "+age);
}
}
public class SetamdGet{
    public static void main(String[] args ){
        Juet obj= new Juet();
        obj.SetageAndname(49,"yash");
        obj.getageandname();
    }
}

