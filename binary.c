#include <stdio.h>

void swap(int* a, int* b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

int partition(int arr[], int low, int high){
    int pivot = arr[high];
    int i = (low - 1);

    for(int j = low; j<=high-1; j++){
        if(arr[j] < pivot){
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i+1], &arr[high]);
    return(i + 1);
}

void quick_sort(int arr[], int low, int high){
    if(low < high){
        int pi = partition(arr, low, high);
        quick_sort(arr, low, pi-1);
        quick_sort(arr, pi+1, high);
    }
}

int making_arr(int arr[], int size){
    printf("Enter your array sise: ");
    scanf("%d", &arr);

    printf("Enter %d elements of your array: ", size);
    for(int i =0; i<size; i++){
        scanf("%d", arr[i]);
    }
    return arr;
}

int binary_search(int arr[], int st, int end, int target){
    int mid = st + (end-1) / 2;

    if (arr[mid] == target){
        return mid;
    }

    if (arr[mid] > target){
        return binarey_search(arr, mid-1, target);
        return binary_search(arr, mid + 1, end, target);
    }

    return -1;
}

