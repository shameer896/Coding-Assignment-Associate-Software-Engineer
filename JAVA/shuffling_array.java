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
        System.out.println("Array after swapping : "+Arrays.toString(array));

    }

    public static void main(String args[]){

        //Array to be shuffled
        int[] array={1,2,3,4,5,6,7};

        //Array size
        int n=array.length;

        //Printing the array before swapping
        System.out.println("Array before swapping : "+Arrays.toString(array));

        //Calling randomize function
        randomize(array,n);

    }

}

/********************************/
/*** Few Output For This Code ***/
/********************************/

/*
Output 1

Array before swapping : [1, 2, 3, 4, 5, 6, 7]
Array after swapping : [5, 7, 2, 6, 1, 3, 4]

*/

/*
Output 2

Array before swapping : [1, 2, 3, 4, 5, 6, 7]
Array after swapping : [4, 6, 7, 3, 1, 2, 5]

*/

