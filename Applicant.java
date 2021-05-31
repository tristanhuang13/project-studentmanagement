public class Applicant {
	private String name;
	private int idNumber;
	private String email;
	private boolean hasFamily;
	private boolean hasFinancialAid;
	public Applicant(String name, int idNumber, String email, boolean hasFamily) {
		this.name = name;
		this.idNumber = idNumber;
		this.email = email;
		this.hasFamily = hasFamily;
		if (hasFamily) {
			hasFinancialAid = true;
		}
		else {
			hasFinancialAid = false;
		}
	}
	public String getID() {
		return idNumber;
	}
	public void createID() {
		int number = rand.nextInt(10000);
		idNumber = year + number;
	}
}