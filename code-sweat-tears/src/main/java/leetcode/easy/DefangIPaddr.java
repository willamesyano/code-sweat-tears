package leetcode.easy;

public class DefangIPaddr {

	public static void main(String[] args) {
		DefangIPaddr defang = new DefangIPaddr();
		defang.defangIPaddr("1.1.1.1");
	
	}
	public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
