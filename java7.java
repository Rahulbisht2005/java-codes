



//  class Array{
//     public static void main(String[] args) {
//         int i;
//         double arr[]={1.2,2.6,3.2};
//         double sum=0;
//         for(i=0;i<arr.length;i++){
//             sum=sum+arr[i];

//         }
//         System.out.println(sum);
//     }
//  }



// import java.util.Scanner;
// class Matrix{
// public static void main(String[] args) {
//     // int a,b,sum;
//     // Scanner sc=new Scanner(System.in);
//     // System.out.println("enter the first  value");
//     // a=sc.nextInt();
//     // System.out.println("enter the second value");
//     // b=sc.nextInt();
//     // System.out.println((a+b));
//     // int a,fact=1,i;
//     // Scanner sc=new Scanner(System.in);
//     // System.out.println("enter the value");
//     // a=sc.nextInt();
//     // for(i=1;i<=a;i++){
//     // fact=fact*i;
//     // }
//     // System.out.println(fact);


//     int a[][]=new int[2][2];
//     int b[][]=new int[2][2];
//     int c[][]=new int[2][2];
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the first matrix");
//     for(int i=0;i<2;i++){
//         for(int j=0;j<2;j++){
//             a[i][j]=sc.nextInt();

//         }
//     }
//     System.out.println("enter the second matrix");
//    for(int i=0;i<2;i++){
//         for(int j=0;j<2;j++){
//             b[i][j]=sc.nextInt();
            
//         }
//     }

//     System.out.println("first matrix ix ");
//     for(int i=0;i<2;i++){
//         for(int j=0;j<2;j++){
//             System.out.print( a[i][j]+"  ");
//         }
//         System.out.println();
//     }

//     System.out.println("second matrix ix ");
//     for(int i=0;i<2;i++){
//         for(int j=0;j<2;j++){
//             System.out.print( b[i][j]+"  ");
//         }
//         System.out.println();
//     }

//     System.out.println("multiplication of the two matrix is");
//     for(int i=0;i<2;i++){
//          for(int j=0;j<2;j++){
//             c[i][j]=0;
//             for(int k=0;k<2;k++){
               
//              c[i][j]+=a[i][k]*b[k][j];
//             }
//              System.out.print(c[i][j]+"  ");
//          }
//          System.out.println();
//      } 


// }    
// }




// import java.nio.channels.NonWritableChannelException;
// import java.util.Scanner;
// class input{
// public static void main(String[] args) {
//     // int a,b,sum;
//     // Scanner sc=new Scanner(System.in);
//     // System.out.println("enter the first  value");
//     // a=sc.nextInt();
//     // System.out.println("enter the second value");
//     // b=sc.nextInt();
//     // System.out.println((a+b));
//     // int a,fact=1,i;
//     // Scanner sc=new Scanner(System.in);
//     // System.out.println("enter the value");
//     // a=sc.nextInt();
//     // for(i=1;i<=a;i++){
//     // fact=fact*i;
//     // }
//     // System.out.println(fact);


//     int a[][]=new int[2][2];
    
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the first matrix");
//     for(int i=0;i<2;i++){
//         for(int j=0;j<2;j++){
//             a[i][j]=sc.nextInt();

//         }
//     }
  

//     System.out.println("first matrix ix ");
//     for(int i=0;i<2;i++){
//         for(int j=0;j<2;j++){
//             System.out.print( a[i][j]+"  ");
//         }
//         System.out.println();
//     }

//     System.out.println("second matrix ix ");
//     for(int i=0;i<2;i++){
//         for(int j=0;j<2;j++){
//             System.out.print( a[i][j]+"  ");
//         }
//         System.out.println();
//     }
//     System.out.println("second matrix ix ");
//     for(int i=0;i<2;i++){
//         for(int j=0;j<2;j++){
//             System.out.print( a[j][i]+"  ");
//         }
//         System.out.println();
//     }


    


// }    
// }




/*class Reverse{
    public static void main(String[] args) {
        int i;
        int arr[]={1,21,3,5,6};
        for(i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}*/




/*class Max{
    public static void main(String[] args) {
        int i;
        int arr[]={1,3,5,8,9,2};
        int max=0;
        for(int element:arr){
            if(max<element){
                max=element;
            }
        }
        System.out.println(max+" ");
    }
}*/




/*class Sorting{
    public static void main(String[] args) {
        int i;
        int j,temp;
        int arr[]={1,4,2,7,9};
        int max=0;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            for(i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
}*/




/*class Insertion{
    public static void main(String[] args) {
        int i, pos=4;
        int arr[]={19,23,43,44,76,54,0};
       for(i=arr.length-1;i>pos-1;i--){
         arr[i]=arr[i-1];

    }
    arr[pos-1]=100;
    for(i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}*/



/*class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the no of elements in array:");
        n=sc.nextInt();
        int a[]=new int[n+1];
        for(i=0;i<n;i++){
            System.out.print("enter element"+(i+1));
            a[i]=sc.nextInt();
        }
        System.out.println("enter the position:");
        int pos=sc.nextInt();
        System.out.println("enter the element:");
        int e=sc.nextInt();
        System.out.println("the original elemnents are:");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }
}*/




/*import java.util.Scanner;
class Test
{public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i,n,j,count=0;
System.out.println("Enter no of elements is array");
n=sc.nextInt();
int a[]=new int[n+1];
for(i=0;i<n;i++){
    System.out.println("ENter element "+(i+1));
    a[i]=sc.nextInt();
}
System.out.println("Enter the element: ");
int element=sc.nextInt();

for(i=0;i<a.length;i++){
    if (a[i]==element){
        
        for(j=i;j<n;j++){
            a[j]=a[j+1];
    }count+=1;
    break;
}
}
if(count==1){
    System.out.println("Element found");
    for(i=0;i<n-1;i++){
        System.out.println(a[i]);
}
}
else{
System.out.println("Element not found");
    }
}









    }*/


import java.util.Scanner;
// class string{
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int vc=0;
//         /*System.out.println("enter the name:");
//         String name=sc.nextLine();*/
//         String name="     pratyush mishra       ";
//         System.out.println(name);
//         System.out.println(name.length());
//         System.out.println(name.toUpperCase());
//         System.out.println(name.toLowerCase());
//         System.err.println(name.trim());
//         // for(int i=name.length()-1;i>=0;i--){
//         //     System.out.println("index is at "+i +""+name.charAt(i));
//         // }


        


// class string{
//     public static void main(String[] args) {
//     String name="Harshwardhan Joshi";
//     int vc=0;
//     for(int i=0;i<name.length();i++){
//     if (name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u' || name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O' || name.charAt(i)=='U'){
//             vc+=1;

//     }
// }System.out.println(vc);
// }
// }




// class string{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the name:");
//         String name=sc.nextLine();
//         String rev="";
//         for(int i=name.length()-1;i>=0;i--){
//             rev=rev+name.charAt(i);
//         }
//         System.out.println(rev);
//         if(name.equals(rev)){
//             System.out.println("string is palindrome");
//         }
//         else{
//             System.out.println("string is not palindrome");
//         }
//     }
// }




// class string{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the name:");
//         String name=sc.nextLine();
//        System.out.println(name.replace(" ", " $"));
        
//     }
// }




/*class string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name:");
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++){
           char ch=name.charAt(i);
           if(Character.isUpperCase(ch)){
           System.out.print(Character.isLowerCase(ch));


           }
           else{
            System.out.print(Character.toUpperCase(ch));
           }
          
        }
        }
      
    }*/



/*class A{
    
    
        int a,b;
        void input(){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the value:");
            a=sc.nextInt();
            System.out.println("enter the value:");
            b=sc.nextInt();
            
        }
        void add(){
            System.out.println("addition is "+(a+b));
        }


    }
    class B extends A{
        int c;
        void getdata(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value:");
            c=sc.nextInt();
        }
        void display(){
            System.out.println("addition is "+(a+b+c));


        }
    }
    class C{
        public static void main(String[] args) {
            B bb=new B();
            bb.input();
            bb.getdata();
            bb.display();
        }
    }*/




    /*class A{
    
    
        int a;
        void input(){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the value:");
            a=sc.nextInt();
            
        }
       


    }
    class B extends A{
        int b;
        void getvalue(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value:");
            b=sc.nextInt();
        }
        
    }
    class C extends B{
        int c;
        void getdata(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value:");
            c=sc.nextInt();
        }
        void display(){
            System.out.println("addition is "+(a+b+c));


        }
    }
    class D{
        public static void main(String[] args) {
            C bb=new C();
            bb.input();
            bb.getvalue();
            bb.getdata();
            bb.display();
        }
    }*/






    /*class A{
    
    
        int a;
        int b;
        void input(){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the value:");
            a=sc.nextInt();
            System.out.print("enter the value of b");
            b=sc.nextInt();
            
        }
       


    }
    class B extends A{
       
        void display(){
            
            System.out.println("the sum is :"+(a+b));
           
        }
        
    }
    class C extends B{
        
      
        
        void funplay(){
            System.out.println("sub is "+(a-b));


        }
    }
    class D{
        public static void main(String[] args) {
           B bb1=new B();
           C bb3=new C();
           bb1.input();
           bb1.display();
           bb3.input();
           bb3.funplay();
        }
    }*/




    
    /*class A{
        
        void wish(){
            
            System.out.println("good morning");
            
        }
        
    }
    class B extends A{
        
        void say(){
            System.out.println("good night ");


        }
    }
    class D{
        public static void main(String[] args) {
            B p1=new B();
            p1.say();

           
        }
    }*/



/*class Overloading{
    void show(String name){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Overloading s1=new Overloading();
        s1.show(7);
    }
}*/



//METHOD OVERLOADING
// SAME NAME 
// SAME CLASS 
// DIFFERENT ARGUMENTS
// 1.NO OF ARGUMENTS
// 2.SEQUENCE OF ARGUMENTS
// 3.TYPES OF ARGUMENT


//METHOD OVERWRITING
// SAME NAME
// DIFFERENT CLASS
// SAME ARGUMENTS
// 1.NO OF ARGUMENTS
// 2.SEQUENCE OF ARGUMENTS
// 3.TYPES OF ARGUMENTS




/*class ThisDemo{
    int i;
    void setvalue(int i){
    this.i=i;
    }
    void show(){
        System.out.println(i);
    }
   
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
        t.setvalue(5);
        t.show();
        
    }
}*/



class Encapsulation{
    private int empid=90;
    public void setdata(int emp_id) {
        empid=emp_id;

        
    }
    public int showdata(){
        return empid;
    }
}
class capsule extends Encapsulation{
    public static void main(String[] args) {
    Encapsulation t=new Encapsulation();
    //t.setdata(420);
    System.out.println(t.showdata());
}
}




