import java.util.*;

class shuffling{
    static void randomize(int array[],int n)
    {
        //object for Random class
        Random random = new Random();

        //itterating each element of the array
        for( int i=n-1; i>0 ; i-- )
        {
            //Generating random number from range 0 to i+1
            int randomIndex=random.nextInt(i+1);

            //Swapping to random index
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;

        }

        //Printing the array after shuffle
        System.out.println(Arrays.toString(array));

    }

    public static void main(String args[]){

        //Array to be shuffled
        int[] array={1,2,3,4,5,6,7};

        //Array size
        int n=array.length;

        //Calling randomize function
        randomize(array,n);

    }

}