#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int *array;
    size_t size;
    size_t capacity;
} Vector;

void init_vector(Vector *vec, size_t initial_capacity) {
    vec->array = (int *)malloc(initial_capacity * sizeof(int));
    vec->size = 0;
    vec->capacity = initial_capacity;
}

void resize_vector(Vector *vec) {
    vec->capacity *= 2;
    vec->array = (int *)realloc(vec->array, vec->capacity * sizeof(int));
}

void push_back(Vector *vec, int value) {
    if (vec->size == vec->capacity) {
        resize_vector(vec);
    }
    vec->array[vec->size] = value;
    vec->size++;
}

int get(Vector *vec, size_t index) {
    if (index < vec->size) {
        return vec->array[index];
    }
    return -1;
}

void free_vector(Vector *vec) {
    free(vec->array);
    vec->array = NULL;
    vec->size = 0;
    vec->capacity = 0;
}

int main() {
    Vector vec;
    init_vector(&vec, 4);

    // Adding elements
    for (int i = 0; i < 10; i++) {
        push_back(&vec, i * 10);
    }

    // Accessing elements
    for (int i = 0; i < vec.size; i++) {
        printf("vec[%d] = %d\n", i, get(&vec, i));
    }

    // Freeing memory
    free_vector(&vec);

    return 0;
}
