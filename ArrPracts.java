public class ArrPracts {
    public static void main(String[] a){
        //Print all the elements in an arrys
        int[] arr = {1,4,5,6,7};
        for(int i=0;i<arr.length;i++){
            System.out.println("Index "+i+" "+arr[i]);
        }

        //Find the sum of all elements in an integer array.
        int[] arrSum={29,51,45,53};
        int sum=0;
        for(int i=0;i<arrSum.length;i++){
            sum+=arrSum[i];
        }
        System.out.println("sum of all integer in an integer array :"+sum);

        //Find the biggest integer in an array
        int large = 0;
        int[] arrBig = {33,45,34,344,235,345};
        for(int i=0;i<arrBig.length;i++){
            if(large<arrBig[i]){
                large = arrBig[i];
            }
        }
        System.out.println("Biggest integer in an array :"+large);

        //Find the small integer in an array
        int j=0;
        int[] arrSmall = {23,45,56,69,23,12};
        int small = arrSmall[0];
        while(j<arrSmall.length){
            if(small>arrSmall[j]){
                small=arrSmall[j];
            }
            j++;
        }
        System.out.println("smallest integer in an array :"+small);
    }
}


