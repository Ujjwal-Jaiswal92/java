public class sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] arg){
        int arr[] ={7,3,5,1,4,9,2};

        //bubbble sorting
        for(int i=0; i<arr.length;i++){//n-1
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }
        printArray(arr);
    }

}
    

