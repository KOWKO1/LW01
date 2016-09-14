package work1;
import java.util.Scanner;

import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.Collections; 
import java.util.HashSet; 
import java.util.Set;




public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入红包总金额为（单位：元）: ");
	    float sumMoney = input.nextFloat();//输入金额
		
		
	
		System.out.print("请输入红包总数为（单位：个）: ");
		int NumberOfPeople = input.nextInt();//输入给出红包数
		
		int[] x= new int[NumberOfPeople];
	  float[] y= new float[NumberOfPeople];
		for(int i = 0; i <NumberOfPeople ; i++){
			 x[i]=(int)(1+Math.random()*10);
			}//形成一个随机数组存在X[]中
		
		
		int sum=0;	
		for(int i = 0; i <NumberOfPeople ; i++){
			sum=x[i]+sum;
	        }//计算随机数组之和，用于计算比例和分的金额
		
	   for(int i = 0; i <NumberOfPeople ; i++)	{
		y[i]=sumMoney*x[i]/sum;
		System.out.printf("第%d个人抢到金额为（单位元）：%.2f\n",i+1,y[i]);	
	    }//计算出每个红包金额
		
 }
}
