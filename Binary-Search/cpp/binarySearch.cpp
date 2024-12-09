/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Binary Search
// This program demonstrates searching an element in sorted array

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Search       | O(1)      | O(log n)     | O(log n)   |

#include <iostream>

// class to perform Binary search
class BinarySearch {
private:
    int* arr;    // array to search in
    int n;       // size of array
    int key;     // element to search for

public:
    // function to perform binary search
    int search() {
        int left = 0, right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key)
                return mid;  // Return the index if key is found
            
            if (arr[mid] < key)
                left = mid + 1;  // Search in right half
            else
                right = mid - 1;  // Search in left half
        }
        return -1;  // Return -1 if key is not found
    }
    
    // function to take user input
    void userInput() {
        std::cout << "Enter size of array:" << std::endl;
        std::cin >> n;
        arr = new int[n];
        
        std::cout << "Enter sorted array elements:" << std::endl;
        for(int i = 0; i < n; i++) {
            std::cin >> arr[i];
        }
        
        std::cout << "Enter element to search:" << std::endl;
        std::cin >> key;
    }
    
    // function to print output
    void printOutput(int result) {
        if (result == -1)
            std::cout << "Element " << key << " not found in the array." << std::endl;
        else
            std::cout << "Element " << key << " found at index: " << result << std::endl;
    }
    
    // destructor to free memory
    ~BinarySearch() {
        delete[] arr;
    }
};

// main function
int main() {
    BinarySearch bs;       // Create BinarySearch object
    bs.userInput();        // Taking user input
    int result = bs.search(); // Call to search the array
    bs.printOutput(result);   // Printing output
    return 0;
}

//Sample Input: 5
//             10 20 30 40 50
//             30
//Sample Output: Element 30 found at index: 2

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 