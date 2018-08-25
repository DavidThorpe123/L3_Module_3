package interfaces;

public class MixedCapsString extends SpecialString  {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
	
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
			sb.append(s.toLowerCase().charAt(i));
			}
			else {
				sb.append(s.toUpperCase().charAt(i));
			}
		
			
		}
		return sb.toString();
	}

}
