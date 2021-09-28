package CollectionFramework.PracticeAssignment;

// Write a program to perform flowing operations on arraylist.
//a. Read all elements of arraylist using iterator.
//b. To sort an arraylist using comparator.
//c. Reverse elements of arraylist
class Testarray3{
    public static void main(String[] args){
//declaring and initializing 2D array
        int[][] arr ={{1,2,3},{2,4,5},{4,4,5}};
//printing 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        int[][] arr1 = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[4];
        arr1[2] = new int[2];
//initializing a jagged array
        int count = 0;
        for (int i=0; i<arr1.length; i++)
            for(int j=0; j<arr1[i].length; j++)
                arr1[i][j] = count++;

//printing the data of a jagged array
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();//new line
        }
    } }