#include <stdio.h>

void printarr(int arr[], int n) {
    printf("Array elements are: ");
    for (int i = 0; i < n; i++) {  // Change <= to < to avoid out-of-bounds access
        printf("%d ", arr[i]);      // Added space for better readability
    }
    printf("\n");
}

int main() {
    int arr[] = {7, 9, 4, 2, 1, 3};
    int size = sizeof(arr) / sizeof(arr[0]);

    // Insertion sort
    for (int i = 1; i < size; i++) {  // Start from 1, not 0
        int current = arr[i];
        int j = i - 1;  // Fix assignment to j

        while (j >= 0 && arr[j] > current) {  // Corrected condition
            arr[j + 1] = arr[j];
            j--;
        }

        // Placement of the current element
        arr[j + 1] = current;
    }

    printarr(arr, size);  // Pass the correct array name (arr instead of n)
    return 0;
}
