import java.util.*;
class Swap{
 static void swap(int m , int n){
int temp=m;
m=n;
n=temp;
System.out.println("After swap" + m +" "+ n);
}

public static void main(String args[]){

int m=9,n=7;
System.out.println("Before swap" + m +" "+ n);
swap(m,n);

}


}