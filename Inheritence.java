class Inheritance{
static int a=11,b=17,c=99,d;
static void add(){
d=a+b+c;
System.out.println(d);
}
}
class X extends Inheritance{
public static void main(String args[]){
add();
}

}