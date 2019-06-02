package LinkedList;
import java.util.*;

import LinkedList.ReverseLL.Node;

public class SnackAndLadder {
	
	static class Node{
		int data;
		Node next;
		Node random;
		
	}
	static Node head;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		Node head=new Node();
		Node itr=head;
		int val=1;
		while(val<=100){
			itr.next=new Node();
			itr=itr.next;
			itr.data=val;
			val++;//System.out.println("Enter the number:");
		}
		int number=8;
		while(number>0){
			//adding ladder
			number--;
			int ran1=0;
			int ran2=0;
			while(ran1==ran2){
			 ran1=rand.nextInt(98);
			if(ran1==1){ran1=2;}
			 ran2=rand.nextInt(98);}
			if(ran1>ran2){
		       int temp=ran1;
		       ran1=ran2;
		       ran2=temp;
			}
			ran2-=ran1;
			itr=head.next;
			Node tempNode=null;
			while(ran1>0){
				ran1--;
				itr=itr.next;
			}
			tempNode=itr;
			while(ran2>0){
				ran2--;
				itr=itr.next;
			}
			tempNode.random=itr;
			
			
		}
		number=8;
		while(number>0){
			//adding snakes
			number--;
			int ran1=0;
			int ran2=0;
			while(ran1==ran2){
			 ran1=rand.nextInt(98);
			if(ran1==1){ran1=2;}
			 ran2=rand.nextInt(98);}
			
			if(ran1<ran2){
		       int temp=ran1;
		       ran1=ran2;
		       ran2=temp;
			}
			itr=head.next;
			Node tempNode=null;
			itr=head.next;
			while(ran1>0){
				ran1--;
				itr=itr.next;
			}
			tempNode=head.next;
			while(ran2>0){
				ran2--;
				tempNode=tempNode.next;
			}
			itr.random=tempNode;
		}
		
		System.out.println("Initiated!");
		System.out.println("Collecting Information:.... ");
		System.out.println();
		
		int a=0;
		Node itr1=null,itr2=null,itr3=null,itr4=null;
		String player1="",player2="",player3="",player4="";
		while(a<2||a>4){
		System.out.println("How many players are there! (Must be less than equal to 4: )");
		a=sc.nextInt();
		switch (a){
		case 1:
			System.out.println("Atleat two player required... Ask You friends!!");
			break;
		case 2:
			System.out.println("Please enter player 1 name:");
			player1=sc.next();
			itr1=head.next;
			System.out.println("Please enter player 2 nmae:");
			player2=sc.next();
			itr2=head.next;
			System.out.println("2 players group("+ player1 + " and "+player2+") initiated!!");
			System.out.println("Enter press button 6 of your keyboard to play: ");
			
			//System.out.println("Please enter 6: ");
			int an=sc.nextInt();
			int count=1;
			System.out.println("Player 1 will start the game:");
			while(itr1.data!=100||itr2.data!=100){
				if(count%2==1){
					count++;
					int rq=0,r=0;
					while(rq!=6){
					System.out.println(player1+" Enter 6:");
					rq=sc.nextInt();
					r=1+rand.nextInt(rq);}
					System.out.println(player1+" Your Score:"+r);
					if(itr1.data+r<=100){
					while(r>0){
						r--;
						if(itr1.next!=null){
						itr1=itr1.next;}
					}}
					if(itr1.random!=null){
						if(itr1.data<itr1.random.data){
							System.out.println("Ladder!!");
						}else{
							System.out.println("Snakes!!");
						}
						itr1=itr1.random;
					}
					System.out.println(player1+" you are at: "+itr1.data);
					System.out.println();
				}else{
					count++;
					int rq=0,r=0;
					while(rq!=6){
					System.out.println(player2+" Enter 6:");
					rq=sc.nextInt();
					r=1+rand.nextInt(rq);}
					System.out.println(player2+" you Score:"+r);
					if(itr2.data+r<=100){
					while(r>0){
						r--;
						if(itr2.next!=null){
						itr2=itr2.next;}
					}}
					if(itr2.random!=null){
						if(itr2.data<itr2.random.data){
							System.out.println("Ladder!!");
						}else{
							System.out.println("Snakes!!");
						}
						itr2=itr2.random;
					}
					System.out.println(player2 +" You are at: "+itr2.data);
					System.out.println();
				}
				if(itr1.data==100){
					System.out.println("Congratulations!! "+player1+ " you won!!");
				}
				if(itr2.data==100){
					System.out.println("Congratulations!! "+player2+ " you won!!");
				}
			}
			break;
		case 3:
			System.out.println("Please enter player 1 name:");
			player1=sc.next();
			itr1=head.next;
			System.out.println("Please enter player 2 nmae:");
			player2=sc.next();
			itr2=head.next;
			System.out.println("Please enter player 3 nmae:");
			player3=sc.next();
			itr3=head.next;
			System.out.println("3 players group("+ player1 + ","+player2+" and "+player3+") initiated!!");
			System.out.println("Enter press button 6 of your keyboard to play: ");
			
			//System.out.println("Please enter 6: ");
			int an3=sc.nextInt();
			int count3=1;
			System.out.println("Player 1 will start the game:");
			while(itr1.data!=100||itr2.data!=100||itr3.data!=100){
				if(count3%4==1){
					count3++;
					int rq=0,r=0;
					while(rq!=6){
					System.out.println(player1+" Enter 6:");
					rq=sc.nextInt();
					r=1+rand.nextInt(rq);}
					System.out.println(player1+" Your Score:"+r);
					if(itr1.data+r<=100){
					while(r>0){
						r--;
						if(itr1.next!=null){
						itr1=itr1.next;}
					}}
					if(itr1.random!=null){
						if(itr1.data<itr1.random.data){
							System.out.println("Ladder!!");
						}else{
							System.out.println("Snakes!!");
						}
						itr1=itr1.random;
					}
					System.out.println(player1+" you are at: "+itr1.data);
					System.out.println();
				}else if(count3%4==2){
					count3++;
					int rq=0,r=0;
					while(rq!=6){
					System.out.println(player2+" Enter 6:");
					rq=sc.nextInt();
					r=1+rand.nextInt(rq);}
					System.out.println(player2+" you Score:"+r);
					if(itr2.data+r<=100){
					while(r>0){
						r--;
						if(itr2.next!=null){
						itr2=itr2.next;}
					}}
					if(itr2.random!=null){
						if(itr2.data<itr2.random.data){
							System.out.println("Ladder!!");
						}else{
							System.out.println("Snakes!!");
						}
						itr2=itr2.random;
					}
					System.out.println(player2 +" You are at: "+itr2.data);
					System.out.println();
				}else{
					count3+=2;
					int rq=0,r=0;
					while(rq!=6){
					System.out.println(player3+" Enter 6:");
					rq=sc.nextInt();
					r=1+rand.nextInt(rq);}
					System.out.println(player3+" you Score:"+r);
					if(itr3.data+r<=100){
					while(r>0){
						r--;
						if(itr3.next!=null){
						itr3=itr3.next;}
					}}
					if(itr3.random!=null){
						if(itr3.data<itr3.random.data){
							System.out.println("Ladder!!");
						}else{
							System.out.println("Snakes!!");
						}
						itr3=itr3.random;
					}
					System.out.println(player3 +" You are at: "+itr3.data);
					System.out.println();
				}
				if(itr1.data==100){
					System.out.println("Congratulations!! "+player1+ " you won!!");
				}
				if(itr2.data==100){
					System.out.println("Congratulations!! "+player2+ " you won!!");
				}
				if(itr3.data==100){
					System.out.println("Congratulations!! "+player3+ " you won!!");
				}
			}
			
			break;
		case 4:
			System.out.println("Please enter player 1 name:");
			player1=sc.next();
			itr1=head.next;
			System.out.println("Please enter player 2 nmae:");
			player2=sc.next();
			itr2=head.next;
			System.out.println("Please enter player 3 nmae:");
			player3=sc.next();
			itr3=head.next;
			System.out.println("Please enter player 4 name:");
			player4=sc.next();
			itr4=head.next;
			System.out.println("4 players group("+ player1 + " , "+player2+" , "+player3+" and "+player4+") initiated!!");
			System.out.println("Enter press button 6 of your keyboard to play: ");
			
			//System.out.println("Please enter 6: ");
			int an4=sc.nextInt();
			int count4=1;
			System.out.println("Player 1 will start the game:");
			while(itr1.data!=100||itr2.data!=100){
				if(count4%5==1){
					count4++;
					int rq=0,r=0;
					while(rq!=6){
					System.out.println(player1+" Enter 6:");
					rq=sc.nextInt();
					r=1+rand.nextInt(rq);}
					System.out.println(player1+" Your Score:"+r);
					if(itr1.data+r<=100){
					while(r>0){
						r--;
						if(itr1.next!=null){
						itr1=itr1.next;}
					}}
					if(itr1.random!=null){
						if(itr1.data<itr1.random.data){
							System.out.println("Ladder!!");
						}else{
							System.out.println("Snakes!!");
						}
						itr1=itr1.random;
					}
					System.out.println(player1+" you are at: "+itr1.data);
					System.out.println();
				}else if(count4%5==2){
					count4++;
					int rq=0,r=0;
					while(rq!=6){
					System.out.println(player2+" Enter 6:");
					rq=sc.nextInt();
					r=1+rand.nextInt(rq);}
					System.out.println(player2+" you Score:"+r);
					if(itr2.data+r<=100){
					while(r>0){
						r--;
						if(itr2.next!=null){
						itr2=itr2.next;}
					}}
					if(itr2.random!=null){
						if(itr2.data<itr2.random.data){
							System.out.println("Ladder!!");
						}else{
							System.out.println("Snakes!!");
						}
						itr2=itr2.random;
					}
					System.out.println(player2 +" You are at: "+itr2.data);
					System.out.println();
				}else if(count4%5==3){
					count4++;
					int rq=0,r=0;
					while(rq!=6){
					System.out.println(player3+" Enter 6:");
					rq=sc.nextInt();
					r=1+rand.nextInt(rq);}
					System.out.println(player3+" you Score:"+r);
					if(itr3.data+r<=100){
					while(r>0){
						r--;
						if(itr3.next!=null){
						itr3=itr3.next;}
					}}
					if(itr3.random!=null){
						if(itr3.data<itr3.random.data){
							System.out.println("Ladder!!");
						}else{
							System.out.println("Snakes!!");
						}
						itr3=itr3.random;
					}
					System.out.println(player3 +" You are at: "+itr3.data);
					System.out.println();
				}else{
					count4++;
					count4++;
					int rq=0,r=0;
					while(rq!=6){
					System.out.println(player4+" Enter 6:");
					rq=sc.nextInt();
					r=1+rand.nextInt(rq);}
					System.out.println(player4+" you Score:"+r);
					if(itr4.data+r<=100){
					while(r>0){
						r--;
						if(itr4.next!=null){
						itr4=itr4.next;}
					}}
					if(itr4.random!=null){
						if(itr4.data<itr4.random.data){
							System.out.println("Ladder!!");
						}else{
							System.out.println("Snakes!!");
						}
						itr4=itr4.random;
					}
					System.out.println(player4 +" You are at: "+itr4.data);
					System.out.println();
				}
				if(itr1.data==100){
					System.out.println("Congratulations!! "+player1+ " you won!!");
				}
				if(itr2.data==100){
					System.out.println("Congratulations!! "+player2+ " you won!!");
				}
				if(itr3.data==100){
					System.out.println("Congratulations!! "+player3+ " you won!!");
				}
				if(itr4.data==100){
					System.out.println("Congratulations!! "+player4+ " you won!!");
				}
			}
			break;
		default:
			System.out.println("Invalid memeber selection:..... Can't be more than 4 ");
			
		}
		}

		
		
	}

}
