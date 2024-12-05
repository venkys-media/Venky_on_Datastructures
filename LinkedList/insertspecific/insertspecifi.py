class Node:
    def __init__(self, data):
        self.data = data  # Node data
        self.next = None  # Pointer to the next node

def insert_node(head, data, position):
    new_node = Node(data)
    if position == 1:  # Insert at the head
        new_node.next = head
        return new_node

    current = head
    for i in range(1, position - 1):
        if current is None:
            print("Invalid position!")
            return head
        current = current.next

    if current is None:  # Position is beyond the list length
        print("Invalid position!")
        return head

    new_node.next = current.next
    current.next = new_node
    return head

def print_list(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print()

def main():
    # Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
    head = Node(1)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(4)
    head.next.next.next.next = Node(5)

    # Insert a new node with value 2 at position 3
    head = insert_node(head, 2, 3)

    # Print the updated linked list
    print("Updated Linked List:", end=" ")
    print_list(head)

if __name__ == "__main__":
    main()