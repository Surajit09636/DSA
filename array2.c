#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main(){
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];
    printf("Enter the elements of the array: ");
    for(int i = 0; i < size; i++){
        scanf("%d", &arr[i]); 
    }

    int maxSum = INT_MIN;
   
    for (int st = 0; st < size; st++){
        int currSum = 0;
        for(int end = st; end < size; end++){
           currSum += arr[end];
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
    }

    printf("Maximum subarray sum is: %d", maxSum);

    return 0;
}
