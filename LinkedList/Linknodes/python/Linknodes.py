# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Node Linking in Linked List
# This program demonstrates how to create and link nodes

# Space complexity: O(1)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Creation     | O(1)      | O(1)         | O(1)       |
#|Linking      | O(1)      | O(1)         | O(1)       |

# class to represent a Student Node in linked list
class StudentNode:
    # Constructor to initialize a node with details
    def __init__(self, student_id, name, age):
        self.student_id = student_id  # Student ID
        self.name = name              # Student Name
        self.age = age                # Student Age
        self.next = None              # Reference to the next node

# main function
def main():
    # Create the first node (head node)
    head = StudentNode(1, "Alice", 20)
    # Create the second node
    second = StudentNode(2, "Bob", 22)
    # Create the third node
    third = StudentNode(3, "Charlie", 21)

    # Link the nodes together
    head.next = second     # Link first node to second
    second.next = third    # Link second node to third

if __name__ == "__main__":
    main()

#Sample Input: None (Static node creation)
#Sample Output: None (Node linking demonstration)

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 