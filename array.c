#include <stdio.h>
#include <limits.h>

int find_smallest(int arr[], int size){
    int smallest = INT_MAX;
    int index = 0;
    for(int i =0; i<size; i++){
        if(arr[i] < smallest){
            smallest = arr[i];
            index = i;
        }
       
    }
    printf("Your smallest number is: %d and found at index: %d", smallest,index);

    
    
}

int find_largest(int arr[], int size){
    int largest = INT_MIN;
    int index = 0;
    for(int i = 1; i<size; i++){
        if(arr[i] > largest){
            largest = arr[i];
            index = i;
        }
    }
    printf("The largest number is: %d and found at index: %d",largest,index);

    
}

int main (){
    int size; 
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];
    printf("Enter %d elements of the array: ", size);
    for(int i = 0; i<size; i++){
        scanf("%d", &arr[i]);
    }

    find_smallest(arr,size);
    find_largest(arr,size);


    return 0;
}