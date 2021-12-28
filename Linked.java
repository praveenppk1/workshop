//SLL
import java.util.Scanner;
 class Linked{
static Scanner sc;
static Node header,t,p;
static class Node{
int data;
Node next;
Node(int data){
this.data=data;
}
}
public static Linked insert(Linked list,int ele){
int ch,r,j;
Node temp=new Node(ele);
if(header==null){
temp.next=null;
header=temp;\
System.out.println("llist is empty");
}
else
{
p=header;
System.out.println("1.START\n2.MID\n3.END");
System.out.println("Enter your choice ");
ch=sc.nextInt();
switch(ch){
case 1: temp.next=header;
        header=temp;
break;
case 2: System.out.println("Enter position ");
r=sc.nextInt();
for(j=1;j<r;++j){
t=p;
p=p.next;
               }
t.next=temp;
temp.next=p;
break;
case 3 : while(p.next!=null){
p=p.next;
}
temp.next=null;
p.next=temp;
}
}
return list;
}
public static Linked delete(Linked list){
int ch,r,j;

if(header==null){
System.out.println("List is empty");
}
else
{
p=header;
System.out.println("1.START\n2.MID\n3.END");
System.out.println("Enter your choice ");
ch=sc.nextInt();
switch(ch){
case 1:   header=header.next;
break;
case 2: System.out.println("Enter position ");
r=sc.nextInt();
for(j=1;j<r;++j){
t=p;
p=p.next;
}
t.next=p.next;
break;
case 3 : while(p.next!=null){
t=p;
p=p.next;
}
t.next=null;
}
}
return list;
}
public static void display(Linked list){
if(header==null){
System.out.println("List is empty!!!");
}
else{
p=header;
while(p!=null){
System.out.print(p.data+"->");
p=p.next;
}
}
System.out.println();
}
public static void main(String[] args)
{
sc=new Scanner(System.in);
Linked list=new Linked();
int ch,ele;
do{
System.out.println("1.INSERT\n2.DELETE\n3.DISPLAY\n4.EXIT");
System.out.println("Enter choice ");
ch=sc.nextInt();
switch(ch){
case 1: System.out.println("Enter an element ");
ele=sc.nextInt();
list=insert(list,ele);
break;
case 2: list=delete(list); break;
case 3: display(list); break;
}

}while(ch!=4);
}
}



