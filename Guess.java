
import java.util.*;
public class Guess{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("--------猜拳游戏--------");
	System.out.println("请出拳 （1.剪刀 2.石头 3.布）");
	int person= in.nextInt();
	int computer=(int)(Math.random()*3)+1;	
	//有三种情况，
	//赢 条件：person>computer
	//平局 条件：person==computer
	//输 条件：person==1&&computer==2||person==2&&computer==3||person==3&&computer==1
	String Marks="拳头";
	String Marks2="拳头";
	switch(person){
		case 1:
		Marks="剪刀";
		break;
		case 2:
		Marks="石头";
		break;
		case 3:
		Marks="布";
		break;
	}
	switch(computer){
		case 1:
		Marks2="剪刀";
		break;
		case 2:
		Marks2="石头";
		break;
		case 3:
		Marks2="布";
		break;
	}
	if(person==computer){
	System.out.println("你出的是"+Marks+"，电脑出的是"+Marks2+",结果是"+"-_-平局");
	}else if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){
	 System.out.println("你出的是"+Marks+"，电脑出的是"+Marks2+",结果是"+"---你输了！");
	 }else{
	 System.out.println("你出的是"+Marks+"，电脑出的是"+Marks2+",结果是"+"---你赢了！");
	}
	}


} 