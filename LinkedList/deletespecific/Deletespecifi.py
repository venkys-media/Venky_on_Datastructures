class Node:
    def __init__(self, data):
        self.data = data  # Node data
        self.next = None  # Pointer to the next node

def count_list_size(head):
    size = 0
    temp = head
    while temp is not None:
        size += 1
        temp = temp.next
    return size

def delete_any_node(head, node_num):
    if head is None or node_num < 1:
        print("Invalid operation.")
        return head

    if node_num == 1:
        return head.next  # Delete head

    current = head
    for i in range(1):
        if current.next is None or i >= node_num - 1:
            print("Position exceeds list size.")
            return head
        current = current.next

    if current.next is None:
        print("Position exceeds list size.")
        return head

    current.next = current.next.next  # Bypass node
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

    print("Original Linked List:")
    print_list(head)

    head = delete_any_node(head, 3)  # Delete node at position 3

    print("After deleting position 3:")
    print_list(head)

if __name__ == "__main__":
    main()