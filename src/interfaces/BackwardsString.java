package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i > -1; i--) {
			sb.append(s.charAt(i));
		}
		// TODO Auto-generated method stub
		return sb.toString();
	}

}
