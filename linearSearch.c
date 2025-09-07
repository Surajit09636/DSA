#include <stdio.h>


int linearSearch(int arr[], int size, int target) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == target) {
            return i;  
        }
    }
    return -1;  
}

int main() {
    int size = 0;

    
    printf("Enter the size of your array: ");
    scanf("%d", &size);

    int arr[size];

   
    printf("Enter your elements:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);  
    }

    int target;

    
    printf("Enter your target number: ");
    scanf("%d", &target);

    
    int result = linearSearch(arr, size, target);

    
    if (result != -1) {
        printf("Target found at index: %d\n", result);
    } else {
        printf("Target not found\n");
    }

    return 0;
}
