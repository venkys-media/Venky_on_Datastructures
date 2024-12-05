class Node:
    def __init__(self, data):
        self.data = data  # Node data
        self.next = None  # Pointer to the next node

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

    # Optional: Print the linked list
    temp = head
    print("Linked list:", end=" ")
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print()

if __name__ == "__main__":
    main()