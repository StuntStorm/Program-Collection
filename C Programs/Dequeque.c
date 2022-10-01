#include <stdio.h>

int isEmpty();
int isFull();
int capacity, front = -1, rear = -1, size = 0;

void fnq(int q[])
{
    if (!isFull())
    {
        int n;
        printf("enter the element:");
        scanf("%d", &n);

        if (front != -1)
        {
            front = (front - 1 + capacity) % capacity;
            q[front] = n;
            size++;
        }
        else
        {
            front = 0;
            rear = 0;

            q[front] = n;
            size++;
        }
    }
    else
        printf("the QUEUE is full\n");
}
void fdq(int q[])
{
    if (!isEmpty())
    {
        printf("the poped element is: %d\n", q[front]);
        front = (front + 1) % capacity;
        size--;
    }
    else
        printf("the QUEUE is empty\n");
}
void rnq(int q[])
{
    if (!isFull())
    {
        int n;
        printf("enter the element:");
        scanf("%d", &n);

        rear = (rear + 1) % capacity;
        q[rear] = n;

        if (front == -1)
            front = rear;
        size++;
    }
    else
        printf("the QUEUE is full\n");
}
void rdq(int q[])
{
    if (!isEmpty())
    {
        printf("the poped element is: %d\n", q[rear]);
        rear = (rear - 1 + capacity) % capacity;
        size--;
    }
    else
        printf("the QUEUE is empty\n");
}
void display(int q[])
{
    if (isEmpty())
    {
        printf("the QUEUE is empty\n");
    }
    else
    {
        int i = front;
        while (i != rear)
        {
            printf("%d ", q[i]);
            i = (i + 1) % capacity;
        }
        printf("%d\n", q[rear]);
    }
}
int isFull()
{
    if (capacity == size)
        return 1;
    else
        return 0;
}
int isEmpty()
{
    if (size == 0)
        return 1;
    else
        return 0;
}

int main()
{
    printf("enter the max size of the queue\n");
    scanf("%d", &capacity);

    int q[capacity - 1];

    printf("\n1. fenqueue\n2. fdequeue\n3. renqueue\n4. rdequeue\n5. display\n6. EXIT\n");
    int n;

    do
    {
        printf("\nenter your choice: ");
        scanf("%d", &n);

        switch (n)
        {
        case 1:
            fnq(q);
            break;

        case 2:
            fdq(q);
            break;

        case 3:
            rnq(q);
            break;

        case 4:
            rdq(q);
            break;

        case 5:
            display(q);
            break;

        case 6:
            printf("\n______EXIT POINT______\n ");
            break;

        default:
            printf("INVALID CHOICE\n");
            break;
        }

    } while (n != 6);

    return 0;
}
