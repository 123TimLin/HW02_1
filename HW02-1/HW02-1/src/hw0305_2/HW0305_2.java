package hw0305_2;

import java.util.Scanner;

public class HW0305_2 {
	static String fever;
	static String cough;
	static String Lazy;
	static String highbool;
	static String dry;
	static String sweats;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�w��ϥ������t�ΡA�Ш̧Ǧ^�����D");
		System.out.println("===========================");
		System.out.print("�аݱz�̪�O�_�o�N");
		fever = scanner.next();
		
		if (fever.toLowerCase().equals("y")) {
			System.out.print("�аݱz�̪�O�_�y��?:");
			cough = scanner.next();
			
			if(cough.toLowerCase().equals("y")) {
				System.out.print("�аݱz�̪�O�_�h��?:");
				Lazy = scanner.next();
				
				if(Lazy.toLowerCase().equals("y")) {
					System.out.print("����/�p�j�z�i��o�P�_!!");
				}
				else {
					System.out.print("����/�p�j�z�i��o��L�t��!!");
				}
			}
			else {
				System.out.print("�аݱz�̪�O�_������?:");
				highbool = scanner.next();
				
				if(highbool.toLowerCase().equals("y")) {
					System.out.print("�аݱz�̪�O�_�f��?:");					
					dry = scanner.next();
					
					if(dry.toLowerCase().equals("y")) {
						System.out.print("����/�p�j�z�i��o�x�f!!");
					}
					else {
						System.out.print("�z�i��O��L�t��");
					}
				}
				else {
					System.out.print("�аݱz�̪�O�_�s��?");
					sweats=scanner.next();
					
					if(sweats.toLowerCase().equals("y")) {
						System.out.print("����/�p�j�z�i��o�ͯf");
					}
					else {
						System.out.print("�z�i��O��L�t��");
					}
				}
			}
		}
		else {
			System.out.print("�z�O���`��");
		}
	}

}
