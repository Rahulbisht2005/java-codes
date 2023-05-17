public class rahul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name:");
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++){
           char ch=name.charAt(i);
           if(Character.isUpperCase(ch)){
           System.out.println(Character.isLowerCase(ch));


           }
           else{
            System.out.println(Character.toUpperCase(ch));
           }
          
        }
        }
}
