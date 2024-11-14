class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Function to count the number of nodes in the linked list
def count_list_size(head):
    size = 0
    temp = head
    while temp is not None:
        size += 1  # Increment size for each node
        temp = temp.next  # Move to the next node
    return size

if __name__ == "__main__":
    # Create a linked list: 1 -> 2 -> 3 -> 5
    head = Node(1)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(5)

    # Count the number of nodes in the list
    size = count_list_size(head)
    print("Number of nodes in the list:", size)

    # Clean up memory (not necessary in Python due to automatic garbage collection)
    head = None  # Just set head to None to break the links, and Python's GC will take care of the rest
