package Arrays;
import java.util.*;
public class Ascend {
	public static void main(String[] args) {
		int a[] = {9,8,7,3,5,4,1,6};
		for(int i=0;i<a.length;i++) {
			for(int j =i+1;j<a.length;j++) {
				 if (a[i] > a[j]) {
	                    int temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
				 }
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
