class Node:
    def __init__(self, val):
        self.data = val
        self.next = None


def insert_node(head, data, position):
    new_node = Node(data)

    if position == 1:  # Insert at the head
        new_node.next = head
        return new_node

    current = head
    for _ in range(1, position - 1):
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
    current = head
    while current is not None:
        print(current.data, end=" -> ")
        current = current.next
    print("None")


if __name__ == "__main__":
    # Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
    head = Node(1)
    head.next = Node(2)
    head.next.next = Node(3)
    head.next.next.next = Node(4)
    head.next.next.next.next = Node(5)

    # Print the original list
    print("Original list: ", end="")
    print_list(head)

    # Insert a new node with value 2.5 at position 3
    head = insert_node(head, 2.5, 3)

    # Print the modified list
    print("List after inserting 2.5 at position 3: ", end="")
    print_list(head)

    # Clean up remaining nodes
    while head is not None:
        temp = head
        head = head.next
        del temp
