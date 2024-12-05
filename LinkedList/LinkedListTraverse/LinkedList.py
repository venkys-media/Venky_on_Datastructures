class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Function to traverse the linked list
def traverse(head):
    temp = head
    while temp:
        print(temp.data, end=" -> ")
        temp = temp.next
    print("None")

# Function to insert a new node at the end
def insert(head, data):
    new_node = Node(data)
    
    if not head:
        return new_node
    
    temp = head
    while temp.next:
        temp = temp.next
    
    temp.next = new_node
    return head

if __name__ == "__main__":
    head = None

    head = insert(head, 10)
    head = insert(head, 20)
    head = insert(head, 30)
    head = insert(head, 50)
    head = insert(head, 60)
    head = insert(head, 70)

    print("Linked list: ", end="")
    traverse(head)
