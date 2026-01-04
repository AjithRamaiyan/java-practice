class Hello{
    public static void main(String args[]){
    
        System.out.println("Hello World");

        //data types
        int num = 4;
        char letter = 'e';
        double point = 3.5;
        boolean isFun = true;
        String name = "Ajith";

        System.out.println(num);
        System.out.println(letter);
        System.out.println(point);
        System.out.println(isFun);
        System.out.println(name);

        //add or even
        int number = 20;
        if(number%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        //print the number 1 to 5.
        for(int i = 1; i<=5; i++){
            System.out.print(i+" ");
        }

        //print sum of numbers 1 to 5.
        int j=5, sum=0;
        for(int k=1; k<=j; k++){
            sum+=k;
        }
        System.out.println("\n"+sum);

        //print numbers 1 to 10.
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        //print sum of numbers 1 to 10.
        int total=0;
        for(int i=1; i<=10; i++){
            total+=i;
        }
        System.out.println(total);

        //print even numbers from 1 to 20.
        for(int i=1; i<=20; i++){
            if(i%2==0){
                System.out.println("even num: "+i);
            }
        }

        //print table of 5
        int table = 5;
        for(int i=1; i<=20; i++){
            System.out.println(i+"X"+table+"="+i*table);
        }


    }
}