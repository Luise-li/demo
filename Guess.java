
import java.util.*;
public class Guess{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("--------��ȭ��Ϸ--------");
	System.out.println("���ȭ ��1.���� 2.ʯͷ 3.����");
	int person= in.nextInt();
	int computer=(int)(Math.random()*3)+1;	
	//�����������
	//Ӯ ������person>computer
	//ƽ�� ������person==computer
	//�� ������person==1&&computer==2||person==2&&computer==3||person==3&&computer==1
	String Marks="ȭͷ";
	String Marks2="ȭͷ";
	switch(person){
		case 1:
		Marks="����";
		break;
		case 2:
		Marks="ʯͷ";
		break;
		case 3:
		Marks="��";
		break;
	}
	switch(computer){
		case 1:
		Marks2="����";
		break;
		case 2:
		Marks2="ʯͷ";
		break;
		case 3:
		Marks2="��";
		break;
	}
	if(person==computer){
	System.out.println("�������"+Marks+"�����Գ�����"+Marks2+",�����"+"-_-ƽ��");
	}else if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){
	 System.out.println("�������"+Marks+"�����Գ�����"+Marks2+",�����"+"---�����ˣ�");
	 }else{
	 System.out.println("�������"+Marks+"�����Գ�����"+Marks2+",�����"+"---��Ӯ�ˣ�");
	}
	}


} 