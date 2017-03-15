
public class ToggleString {

	public static void main(String[] args) {
		String op = "BhuSHAn";
		

		String str = op, tmp ="";
		char[] aa = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(aa[i])) {
				tmp = tmp + Character.toString(aa[i]).toLowerCase();
		
			}
			else{
				char lower=aa[i];
				tmp= tmp+ Character.toString(lower).toUpperCase();
			}
		}
		System.out.println(tmp);

	}

}
