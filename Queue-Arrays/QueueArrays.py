class Queue:
    MAX = 1000  # Maximum size of the queue

    def __init__(self):
        self.front = self.size = 0
        self.rear = self.MAX - 1
        self.arr = [0] * self.MAX  # Array to store queue elements

    def enqueue(self, item):
        if self.is_full():
            print("Queue Overflow")
            return False

        self.rear = (self.rear + 1) % self.MAX  # Circular increment
        self.arr[self.rear] = item
        self.size += 1
        print(f"{item} enqueued to queue")
        return True

    def dequeue(self):
        if self.is_empty():
            print("Queue Underflow")
            return 0  # Return 0 on underflow

        item = self.arr[self.front]
        self.front = (self.front + 1) % self.MAX  # Circular increment
        self.size -= 1
        return item

    def get_front(self):
        if self.is_empty():
            print("Queue is Empty")
            return 0  # Return 0 if empty
        return self.arr[self.front]

    def get_rear(self):
        if self.is_empty():
            print("Queue is Empty")
            return 0  # Return 0 if empty
        return self.arr[self.rear]

    def is_empty(self):
        return self.size == 0

    def is_full(self):
        return self.size == self.MAX


# Main function to demonstrate queue operations
if __name__ == "__main__":
    q = Queue()  # Create a queue instance

    q.enqueue(10)
    q.enqueue(20)
    q.enqueue(30)
    q.enqueue(40)

    print(f"{q.dequeue()} dequeued from queue")
    print(f"Front item is {q.get_front()}")
    print(f"Rear item is {q.get_rear()}")
