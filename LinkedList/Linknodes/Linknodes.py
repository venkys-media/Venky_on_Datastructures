class StudentNode:
    def __init__(self, student_id, name, age):
        self.student_id = student_id  # Student ID
        self.name = name              # Student Name
        self.age = age                # Student Age
        self.next = None              # Pointer to the next node

def main():
    # Create the first node (head node)
    head = StudentNode(1, "Alice", 20)
    # Create the second node
    second = StudentNode(2, "Bob", 22)
    # Create the third node
    third = StudentNode(3, "Charlie", 21)
    head.next = second 

    # Link the first node to the second node
    second.next = third 

if __name__ == "__main__":
    main()