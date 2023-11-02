package om.prgms;

public class CountofDigit {
public static void main(String[] args) {
	int num =  5678;
	int res =  0;
	while (num>0) {
		res++;
	    num=num/10;
		
	}System.out.println(res);
}
}
