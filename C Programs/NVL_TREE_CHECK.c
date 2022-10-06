#include<stdio.h>
#include<stdlib.h>

typedef struct NODE {
	struct NODE* left;
	int value;
	struct NODE* right;
}node;

node* root = NULL;

node* create(int num) {
	node* result = (node*)malloc(sizeof(node));
	result->left = NULL;
	result->value = num;
	result->right = NULL;
	return result;
}
int max(int num1, int num2)
{
    return (num1 > num2 ) ? num1 : num2;
}

node* insert(node* node, int key)
{
	// If the tree is empty, return a new node
	if (node == NULL) {
		node = create(key);
	}
	// Else recur down the tree
	if(key < node->value)
		node->left = insert(node->left, key);
	else if (key > node->value)
		node->right = insert(node->right, key);

	return node;
}

void inorder(node* root)
{
	if (root != NULL) {
		inorder(root->left);
		printf("%d \n", root->value);
		inorder(root->right);
	}
}

int height(node* ptr) {
	if (ptr == NULL) {
		return -1;
	}
	else {
		return 1 + max(height(ptr->left), height(ptr->right));
	}
}

void isBalance(node* head) {
	if (abs(height(head->left) - height(head->right)) <= 1) {
		printf("Tree is balanced");
	}
	else { printf("Tree is unbalanced"); }
}

int main() {
	/*root = insert(root,25);
	insert(root,12);
	insert(root,6);
	insert(root,-1);
	insert(root,-1);
	insert(root, 15);
	insert(root,-1);
	insert(root,-1);
	insert(root, 30);
	insert(root, 27);
	insert(root,-1);
	insert(root,-1);
	insert(root,42);
	insert(root,-1);
	insert(root,-1);*/ // Balanced Tree input

	root = insert(root,1);
	insert(root,2);
	insert(root,3);
	insert(root,4);
	insert(root,5);
	insert(root, 6);
	insert(root,7);
	insert(root,8);
	insert(root, 9); // Unbalanced Tree output


	inorder(root);

	isBalance(root);
}
