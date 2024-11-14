#include <iostream>
using namespace std;

int linearSearch(int arr[], int n, int key) {
    for (int i = 0; i < n; i++) {
        if (arr[i] == key)
            return i; // Return the index if key is found
    }
    return -1; // Return -1 if key is not found
}

int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]);
    int key = 30;
    
    int result = linearSearch(arr, n, key);
    if (result == -1)
        cout << "Element not found in the array." << endl;
    else
        cout << "Element found at index: " << result << endl;

    return 0;
}
