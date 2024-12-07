/* Copyrights to venkys.io
 Visit https://venkys.io for more information */

// C++ program for implementing Linear Search
// This program demonstrates searching an element in array linearly

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Search       | O(1)      | O(n)         | O(n)       |

#include <iostream>

// class to perform Linear search
class LinearSearch {
private:
    int* arr;    // array to search in
    int n;       // size of array
    int key;     // element to search for

public:
    // function to perform linear search
    int search() {
        // looping through the array
        for (int i = 0; i < n; i++) {
            // checking if current element matches the key
            if (arr[i] == key)
                return i;  // Return the index if key is found
        }
        return -1;  // Return -1 if key is not found
    }
    
    // function to take user input
    void userInput() {
        std::cout << "Enter size of array:" << std::endl;
        std::cin >> n;
        arr = new int[n];
        
        std::cout << "Enter array elements:" << std::endl;
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
    ~LinearSearch() {
        delete[] arr;
    }
};

// main function
int main() {
    LinearSearch ls;       // Create LinearSearch object
    ls.userInput();        // Taking user input
    int result = ls.search(); // Call to search the array
    ls.printOutput(result);   // Printing output
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
// Follow us on Youtube - https://www.youtube.com/@venkysio 