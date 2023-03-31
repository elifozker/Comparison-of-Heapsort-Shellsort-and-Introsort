package Homework;

import java.util.Arrays;
import java.util.Random;

public class SortingClass {

	public static void main(String[] args) {
		
		HeapSort heapSort = new HeapSort();
		ShellSort shellSort = new ShellSort();
		Introsort introSort = new Introsort(10000);
		
		int[] randomHeap1 = new int[10000];
		for (int i = 0; i < randomHeap1.length; i++) {
			Random rnd = new Random();
			randomHeap1[i] = rnd.nextInt();
		}
		int[] randomShell1 = Arrays.copyOf(randomHeap1, 10000);
		
		int[] randomIntro1 = Arrays.copyOf(randomHeap1, 10000);
		for (int i = 0; i < randomIntro1.length; i++) {
			introSort.dataAppend(randomIntro1[i]);
		}		
		long startTime2 = System.nanoTime();		
		shellSort.sort(randomShell1);
		long end2 = System.nanoTime();
		long result2 = end2 - startTime2;
		System.out.println(result2);

	}
	public static int[] EqualArray1() {
		int[] EqualArray1 = new int[1000];
		for (int i = 0; i < EqualArray1.length; i++) {
			EqualArray1[i] = 5;
		}	
		return EqualArray1;
		
	}
	public static int[] EqualArray2() {
		int[] EqualArray2 = new int[10000];
		for (int i = 0; i < EqualArray2.length; i++) {
			EqualArray2[i] = 5;
		}	
		return EqualArray2;
		
	}
	public static int[] EqualArray3() {
		int[] EqualArray3 = new int[100000];
		for (int i = 0; i < EqualArray3.length; i++) {
			EqualArray3[i] = 5;
		}	
		return EqualArray3;
		
	}
	public static int[] increasingArray1() {
		int[] increasing1 = new int[1000];
		int count = 2;
		for (int i = 0; i < increasing1.length; i++) {
			increasing1[i] = count;
			count += 1;
		}
		return increasing1;
	}
	public static int[] increasingArray2() {
		int[] increasing2 = new int[10000];
		int count = 2;
		for (int i = 0; i < increasing2.length; i++) {
			increasing2[i] = count;
			count += 1;
		}
		return increasing2;
	}
	public static int[] increasingArray3() {
		int[] increasing3 = new int[100000];
		int count = 2;
		for (int i = 0; i < increasing3.length; i++) {
			increasing3[i] = count;
			count += 1;
		}
		return increasing3;
	}
	public static int[] decreasingArray1() {
		
		int[] decreasing1 = new int[1000];
		int count = 99999999;
		for (int i = 0; i < decreasing1.length; i++) {
			decreasing1[i] = count;
			count -= 10;
		}
		return decreasing1;
		
	}
	public static int[] decreasingArray2() {
		
		int[] decreasing2 = new int[10000];
		int count = 99999999;
		for (int i = 0; i < decreasing2.length; i++) {
			decreasing2[i] = count;
			count -= 10;
		}
		return decreasing2;
		
	}
	public static int[] decreasingArray3() {
		
		int[] decreasing3 = new int[100000];
		int count = 99999999;
		for (int i = 0; i < decreasing3.length; i++) {
			decreasing3[i] = count;
			count -= 10;
		}
		return decreasing3;
		
	}


}
