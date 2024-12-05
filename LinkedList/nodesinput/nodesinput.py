class StudentNode:
    def __init__(self, student_id):
        self.student_id = student_id  # Student ID
        self.next = None               # Pointer to the next node

def print_list(head):
    temp = head
    while temp is not None:
        print(temp.student_id, end=" ")
        temp = temp.next
    print()

def main():
    n = int(input("Enter the number of nodes: "))
    head = None
    previous = None

    for i in range(n):
        data = int(input(f"Enter data for node {i + 1}: "))
        current = StudentNode(data)
        if head is None:
            head = current  # First node becomes head
        else:
            previous.next = current  # Link the previous node to the current node
        previous = current  # Move previous to current

    # Print the linked list
    print_list(head)

if __name__ == "__main__":
    main()