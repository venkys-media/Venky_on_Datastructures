# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Queue using Linked List
# This program demonstrates basic queue operations using linked list

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Enqueue      | O(1)      | O(1)         | O(1)       |
#|Dequeue      | O(1)      | O(1)         | O(1)       |
#|Front/Rear   | O(1)      | O(1)         | O(1)       |

class QueueNode:
    def __init__(self, data):
        self.data = data    # Data stored in the node
        self.next = None    # Reference to the next node

class Queue:
    def __init__(self):
        self.front = None   # Reference to the front of the queue
        self.rear = None    # Reference to the rear of the queue

    def enqueue(self, data):
        new_node = QueueNode(data)  # Create a new node

        if self.rear is None:  # If the queue is empty
            self.front = self.rear = new_node  # Both front and rear point to new node
            print(f"{data} enqueued to queue")
            return

        self.rear.next = new_node  # Link the old rear to the new node
        self.rear = new_node       # Update the rear to the new node
        print(f"{data} enqueued to queue")

    def dequeue(self):
        if self.is_empty():
            print("Queue Underflow")
            return 0  # Return 0 on underflow

        temp = self.front  # Store the front node
        self.front = self.front.next  # Move front to the next node

        if self.front is None:  # If the queue is now empty
            self.rear = None  # Update rear to None

        item = temp.data  # Get the data from the dequeued node
        return item

    def get_front(self):
        if self.is_empty():
            print("Queue is Empty")
            return 0  # Return 0 if empty
        return self.front.data

    def get_rear(self):
        if self.is_empty():
            print("Queue is Empty")
            return 0  # Return 0 if empty
        return self.rear.data

    def is_empty(self):
        return self.front is None

# Main function to demonstrate queue operations
if __name__ == "__main__":
    q = Queue()  # Create a queue instance

    q.enqueue(10)
    q.enqueue(20)
    q.enqueue(30)

    print(f"{q.dequeue()} dequeued from queue")
    print(f"Front item is {q.get_front()}")
    print(f"Rear item is {q.get_rear()}")

#Sample Input: enqueue(10), enqueue(20), enqueue(30)
#Sample Output: 10 dequeued from queue
#              Front item is 20
#              Rear item is 30

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 