class Node:
    def __init__(self, val):
        self.data = val
        self.next = None


def count_list_size(head):
    size = 0
    while head is not None:
        size += 1
        head = head.next
    return size


def delete_any_node(head, node_num):
    list_size = count_list_size(head)

    # If the list is empty
    if list_size == 0:
        print("List is empty. Nothing to delete.")
        return None

    # If the list has only one node
    if list_size == 1:
        if node_num == 1:
            del head  # Not strictly necessary in Python, but shown for clarity
            return None
        else:
            print("Invalid node number to delete.")
            return head

    # If the node_num is greater than the size of the list
    if node_num > list_size:
        print("Invalid node number to delete.")
        return head

    # If the node to delete is the head node
    if node_num == 1:
        to_delete = head
        head = head.next
        del to_delete
        return head

    # Traverse to the node just before the one to be deleted
    current = head
    for _ in range(1, node_num - 1):
        current = current.next

    # Delete the node
    to_delete = current.next
    current.next = to_delete.next
    del to_delete

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

    # Delete the node at position 3
    head = delete_any_node(head, 3)

    # Print the modified list
    print("List after deleting node at position 3: ", end="")
    print_list(head)

    # Clean up remaining nodes
    while head is not None:
        temp = head
        head = head.next
        del temp
