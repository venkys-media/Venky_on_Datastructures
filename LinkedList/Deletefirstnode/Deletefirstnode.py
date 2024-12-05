class Node:
    def __init__(self, data):
        self.data = data  # Node data
        self.next = None  # Pointer to the next node

def delete_first_node(head):
    # If the list is empty
    if head is None:
        return None

    # If the list has only one node
    if head.next is None:
        return None  # Explicitly set head to None

    # If the list has multiple nodes
    head = head.next  # Move head to the next node
    return head

def print_list(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print()

def main():
    head = None  # Head of the linked list

    n = int(input("Enter the number of nodes: "))

    for i in range(n):
        data = int(input(f"Enter data for node {i + 1}: "))
        new_node = Node(data)

        if head is None:
            head = new_node  # First node becomes head
        else:
            temp = head
            while temp.next is not None:
                temp = temp.next  # Traverse to the last node
            temp.next = new_node  # Link the new node to the last node

    print("Original Linked List:")
    print_list(head)

    # Deleting the first node
    head = delete_first_node(head)

    print("Linked List after deleting the first node:")
    print_list(head)

if __name__ == "__main__":
    main()