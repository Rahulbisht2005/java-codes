/*class java6{
    public static void main(String args[]){
        
        int i;
        int j;
        for(i=1;i<=100;i++){
            int count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count+=1;
                }
                
               
            }
            if(count==2){
                System.out.println(i);
            }

        }
    }
}*/





/*class armstrong{
    public static void main(String args[]){
        int i,s,r,temp;
        for(i=1;i<=500;i++){
            s=0;
            temp=i;
            while(temp!=0){
                r=temp%10;
                s+=r*r*r;
                temp=temp/10;
            }
            if(i==s){
                System.out.println(i);
            }
        }
    }
}*/



/*class Break{

    public static void main(String args[]){
        int i,j;
        first:for(i=1;i<10;i++){
            for(j=1;j<=5;j++){
                if(i+j>8){
                    break first;
                }
                System.out.println(i+j);
            }
        }
    }
}*/



/*class Break{
    public static void main(String args[]){
        int arr[]={5,6,7,8,9};
        for(int i : arr){
            System.out.println("value is" +i);
        }
    }
}*/




/*class Break{
    public static void main(String[] args){
        int w=4;
        switch(w){
            case 1:System.out.println("monday");break;
            case 2:System.out.println("tuesday");break;
            case 3:System.out.println("wednesday");break;
            case 4:System.out.println("thursday");break;
            case 5:System.out.println("friday");break;
            case 7:System.out.println("saturday");break;
            case 8:System.out.println("sunday");break;

        }

    }
}*/




/*class Break{
    public static void main(String args[]){
        char a='a';
        int value=a;
        System.out.println(value);


    }
}*/




/*class Break{
    public static void main(String agrs[]){
        char a='b';
        if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            System.out.println("it is a vowel");
        }
        else{
            System.out.println("it is a consonent");
        }
    }
}*/



/*class Break{
    public static void main(String agrs[]){
         int year=2020 ;
         if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("it is leap year");
         }
         else{
            System.out.println("it is not a leap year");
         }
    }
}*/




/*class Break{
    public static void main(String args[]){
        double p=1000,r=10,t=2,ci;
        ci=p*(Math.pow(1+r,t));
        System.out.println(ci);

    }
}*/




/*class Box {
    int length,breadth,height;
    void setDimension(int x,int y,int z){
        length=x;
        breadth=y;
        height=z;
    }
    void showDimension(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Height: "+height);
    }
        public static void main(String[] args) {
            Box b1=new Box();
            b1.setDimension(10, 20, 30);
            b1.showDimension();
            Box b2=new Box();
            b2.setDimension(107, 207, 307);
            b2.showDimension();
        
    }
}*/




/*class Test{
    int a=1,b=-1;
    static int k=5;
    void setA(int x){
        a=x;
    }
    void setB(int y){
        b=y;
    }
    void setC(int z){
        k=z;
    }

}
class Helloworld{
    public static void main(String args[]){
        Test t1=new Test();
        Test t2=new Test();
        t1.setA(5);
        t1.setB(10);
        t2.setA(20);
        t2.setB(25);
        t2.setC(50);
        System.out.println("a="+t1.a+"b="+t1.b);
        System.out.println("a="+t2.a+"b="+t2.b);
        System.out.println(t1.k);
        System.out.println(t2.k);

    }
}*/



/*class Example{
    int a,b;
    private int k;
    void setA(x){
        y=x;
    }
    static void setB(w){
        z=w;
    }
    public static void main(String args[]){
        int x=5;
        System.out.println("x",+x);
        System.out.println("x",+y);
        System.out.println("x",+z);
    }
}*/




/*class Pattern{
    public static void main(String artgs[]){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=0;j<=5;j++){
               if(j>5-i){
                System.out.println("*");
         }
         else{
            System.out.print("  ");
         }
            }
          
        }
    }
}*/





/*class Pattern{
    public static void main(String args[]){
        int i,j,row=5;
        for(i=1;i<row;i++){
            for(j=0;j<row-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/





// // class Pattern{
//     public static void main(String args[]){
//         int i,j;
//         for(i=1;i<5+1;i++){
//             for(j=1;j<i;j++){
//                 System.out.print(i-j);
//             }
//             System.out.println();
//         }
//     }
// }



// class Pattern{
//     public static void main(String args[]){
//         int i,j,k;
//         for(i=1;i<5+1;i++){
//             for(j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//         for(k=0;k<5+1-i;k++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// }

    


// class Pattern{
//     public static void main(String args[]){
//         int i,j,k;
//         for(i=1;i<5+1;i++){
//             for(j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//         for(k=0;k<5+1-i;k++){
//             System.out.print(k+1);
//         }
//         System.out.println();
//     }
// }
// }




    
// class Pattern{
//     public static void main(String args[]){
//         char i,j,k;
//         for(i=1;i<5+1;i++){
//             for(j=1;j<i-1;j++){
//                 System.out.print(" ");
//             }
//         for(k=65;k<=70;k++){
//             System.out.print((char)k);
//         }
//         System.out.println();
//     }
// }
// }





// class Pattern{
//     public static void main(String args[]){
//         int i,j,k,row=5;
//         for(i=1;i<5+1;i++){
//             for(j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//         for(k=65;k<65+row-i;k++){
//             System.out.print((char)k);
//         }
//         System.out.println();
//     }
// }
// }





// class Pattern{
//     public static void main(String args[]){
//         int i,j;
//         for(i=1;i<5+1;i++){
//             for(j=1;j<i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
        
//     }
//     for(i=5+1;i>=0;i--){
//         for(j=0;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();

// }
// }
// }




// class Pattern{
//     public static void main(String args[]){
//         int i,j,k,row=5;
//         for(i=0;i<=row;i++){
//             for(j=0;j<=5-i+1;j++){
//                 System.out.print(" ");
//             }
//             for(k=0;k<2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(i=6;i>=0;i--){
//             for(j=0;j<=5-i+1;j++){
//                 System.out.print(" ");
//             }
//             for(k=0;k<2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//     }
// }
// }






// class Array{
//     public static void main(String[] args) {
//         int arr[]={1,2,3};
//         int i;
//         String name[]={"kanishk","nischal"};
//         char n[]={'a','b'};
//         int a[]={};
//         for(i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
       
//     }
// }
