import java.util.Scanner;
public class LinkedList
{
	 static Scanner in=new Scanner(System.in);
	 Node p=null;
	 
	 //CREATING A VERTICALLY LINKED LIST
	 public static Node pushdown(Node p, int key)
	 {
	     Node newNode = new Node();
	     newNode.data = key;
	     //newNode.next = null;
	     newNode.down=p;
	     return newNode; //RETURNS EACH NODE CREATED
	  }
	 
	  //INSERTION OF ALL ELEMENTS INTO A SINGLE FLATTENED LIST
	  void Insert(int value)
	  {
		  Node newnode = new Node();
		  newnode.data=value;
		  newnode.next=null;
		  newnode.next=p;
		  p=newnode;
	  }
	 
	 //FLATTENING OF LL- TRAVERSAL HAPPENS IN BOTH DIRECTIONS
	 //GOES TO EACH HEAD NODE AND ADDS THE SUBSEQUENT NODE(ELEMENT(S)) IN THE VERTICAL LIST TO THE FLATTENED LIST
	 void flatten(Node root)
	 {
		 Node hor=root;
			 while(hor!=null)
			 {
				 Node ver=hor;
				 while(ver!=null)
				 {
					 Insert(ver.data);
					 ver=ver.down;//TRAVERSING OF VERTICAL LIST
				 }
				 hor=hor.next;//HORIZONTAL MOVEMENT-MAIN LIST TRAVERSAL
			 }
	  }
	 
	  void ll_test(Node root)
	  {
		  Node hor=root,temp;
		  temp=hor;
		  while(temp!=null)
		  {
			  System.out.print(temp.data+"\t");
			  temp=temp.next;
		  }
		  System.out.println();
		  
		  while(hor!=null)
			 {
				 Node ver=hor;
				 while(ver!=null)
				 {
					System.out.print(ver.data+"\t");
					 ver=ver.down;
				 }System.out.println();
				 hor=hor.next;//HORIZONTAL MOVEMENT
			 }
	 }
	 
	 //SORTING OF THE FLATTENED LIST
	 void sort_ll()
	 {
		 Node current=null,Next=null;
		 int temp;
		 current=p;
		 if(p==null)
		 {
			 System.out.println("EMPTY");
		 }
		 else
		 {
			 while(current!=null)
			 {
				 Next=current.next;
				 while(Next!=null)
				 {
					 while(current.data>Next.data)
					 {
						 temp=current.data;
						 current.data=Next.data;
						 Next.data=temp;
					 }
					 Next=Next.next;
				 }
				 current=current.next;
			 }
		 }
	 }
	 
	 void traversal()
	 {
		if(p==null)
	    {
	        System.out.println("LIST IS EMPTY");
	    }
	    else
	    {
	        Node temp=p;
	        System.out.print(temp.data);
	        while(temp.next!=null)
	        {
	        	//System.out.print(temp.data+"-->");
	            temp=temp.next;
	            System.out.print("-->"+temp.data);
	           
	         }
	    }
	    System.out.println();
	  }
	 
	  //METHOD TO CREATE VERTICAL LIST
	  public Node createVerticalList(Node head, int[] arr)
	  {
	     for (int key: arr) //GOES THROUGH EACH ELEMENT
	     {
	        head = pushdown(head, key);
	     }
	     return head;//RETURNS HEAD OF THE MAIN LIST
	  } 
	
	  //A METHOD TO INPUT ELEMENTS FOR THE LIST IN THE FORM OF AN ARRAY
	  void inputArray(int arr[],int size)
	  {
		 int ele;
		 for(int i=size-1;i>=0;i--)
		 {
			 ele=in.nextInt();
			 arr[i]=ele;
		 }
		 System.out.println();
	  }
	
	  public static void main(String[] args)
	  {
		    Node head = null;
			LinkedList l= new LinkedList();
		
		    int[] arr1 = new int[4];
	        int[] arr2 = new int[4];
	        int[] arr3 = new int[3];
	        int[] arr4 = new int[2];
	        
	        l.inputArray(arr1, 4);
	        l.inputArray(arr2, 4);
	        l.inputArray(arr3, 3);
	        l.inputArray(arr4, 2);
		 
		    //LINKING LIST VERTICALLY
	        System.out.println();
	        head = l.createVerticalList(head, arr1);
	        head.next = l.createVerticalList(head.next, arr2);
	        head.next.next = l.createVerticalList(head.next.next, arr3);
	        head.next.next.next = l.createVerticalList(head.next.next.next, arr4);
	      
	        l.flatten(head);
	        l.sort_ll();
	        l.ll_test(head);
	        System.out.println();
	        l.traversal();
	}
}