#ifndef MY_FUNCTIONS_H
#define MY_FUNCTIONS_H

#include <bits/stdc++.h>
using namespace std;

class Node
{
    public:
    int data;
    Node *next;

    public:
    Node(int data1, Node *next1)
    {
        data = data1;
        next = next1;
    }

    Node (int node_data){
            this->data = node_data;
            this->next = nullptr;
    
    }
};

/**
 * @brief INSERTION
 */

//using first constrcutor 
Node *insertInLinkedList(vector<int> &arr){
    Node *head = new Node(arr[0]);
    Node *temp = head;
    for (int i = 1; i < arr.size(); i++)
    {
        temp->next = new Node(arr[i]);
        temp = temp->next;
    }
    return head;

}
/* //using second constructor
Node *insertInLinkedList(vector<int> &arr){
    Node *head = new Node(arr[0], nullptr);
    Node *temp = head;
    for (int i = 1; i < arr.size(); i++)
    {
        temp->next = new Node(arr[i], nullptr);
        temp = temp->next;
    }
    return head;

}


*/

//using first constrcutor 
Node *insertAtPosition(Node *head, int data, int pos)
{
    if (pos == 0)
    {
        Node *temp = new Node(data);
        temp->next = head;
        return temp;
    }

    Node *temp = head;
    for (int i = 0; i < pos - 1; i++)
    {
        if (temp == nullptr)
        {
            return head;
        }
        temp = temp->next;
    }

    if (temp == nullptr)
    {
        return head;
    }
    Node *temp1 = new Node(data);
    /*
        @first_constructor_def : // using first constructor
                           //you have to use temp1->next = temp->next;
                           //because temp1->next is nullptr by default.
    */
    temp1->next = temp->next;
    temp->next = temp1;
    return head;
}
/* //Using second constructor 
Node *insertAtPosition(Node *head, int data, int pos)
{
    if (pos == 0)
    {
        Node *temp = new Node(data, head);
        return temp;
    }

    Node *temp = head;
    for (int i = 0; i < pos - 1; i++)
    {
        if (temp == nullptr)
        {
            return head;
        }
        temp = temp->next;
    }

    if (temp == nullptr)
    {
        return head;
    }
    Node *temp1 = new Node(data, temp->next);
    temp->next = temp1;
    return head;
}

*/


Node *insertAtTail(Node *head, int data)
{
    if (head == nullptr)
    {
        head = new Node(data, nullptr);
        return head;
    }
    Node *temp = head;
    while (temp->next != nullptr)
    {
        temp = temp->next;
    }
    temp->next = new Node(data, nullptr);
    return head;
}

Node *insertAtHead(Node *head, int data)
{
    Node *temp = new Node(data, head);
    return temp;
}

/**
 * @brief DELETION
 */

Node *deleteAtHead(Node *head)
{
    if (head == nullptr)
    {
        return nullptr;
    }
    Node *temp = head;
    head = head->next;
    delete temp;
    return head;
}

Node *deleteAtTail(Node *head)
{
    //if no element
    if (head == nullptr)
    {
        return nullptr;
    }
    //if only one element
    if (head->next == nullptr)
    {
        delete head;
        return nullptr;
    }
    //if more than one element
    Node *temp = head;
    while (temp->next->next != nullptr)
    {
        temp = temp->next;
    }
    delete temp->next;
    temp->next = nullptr;
    return head;
}

Node *deleteAtPosition(Node *head, int pos)
{
    //if no element
    if (head == nullptr)
    {
        return nullptr;
    }
    //if only one element
    if (pos == 0)
    {
        Node *temp = head;
        head = head->next;
        delete temp;
        return head;
    }
    //if more than one element
    Node *temp = head;
    for (int i = 0; i < pos - 1; i++)
    {
        if (temp == nullptr)
        {
            return head;
        }
        temp = temp->next;
    }
    if (temp == nullptr || temp->next == nullptr)
    {
        return head;
    }
    Node *temp1 = temp->next;
    temp->next = temp1->next;
    delete temp1;
    return head;
}

Node *deleteLinkedList(Node *head)
{
    while (head)
    {
        Node *temp = head;
        head = head->next;
        delete temp;
    }
    return nullptr;
}

inline void solve()
{
    // Create a linked list
    vector<int> v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Node *head = insertInLinkedList(v);
    head = insertAtTail(head, 11);
    head = insertAtHead(head, 0);
    head = deleteAtHead(head);
    head = deleteAtTail(head);
    head = deleteAtPosition(head, 3);
    head = insertAtPosition(head, 32, 3);
    // head = deleteLinkedList(head);
    
    // Traversing the linked list
    Node *temp = head;
    while (temp)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
}

#endif