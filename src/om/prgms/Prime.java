package om.prgms;

public class Prime {
public static void main(String[] args) {
	int num=3;
	int count=0;
	for (int i = 1; i <=num/1; i++) {
		if (num%2==0) {
			count++;
		}
	}if (count==0) {
		System.out.println("prime");
	}else {
		System.out.println("not a prime");
	}
}
}
