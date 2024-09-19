class Array{

public static void main(String args[]){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int []arr={a,b,c};
int sum=0;
for(int i=0;i<arr.length;i++){

sum +=arr[i];
}
System.out.println(sum);
}

}