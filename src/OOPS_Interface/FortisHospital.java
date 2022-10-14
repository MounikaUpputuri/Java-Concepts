package OOPS_Interface;

public class FortisHospital extends UNHG implements USMedical, UKMedical, INmedical {

	// multiple inheritance

	@Override
	public void Phsycioservices() {
		System.out.println("FH-Phy");

	}

	@Override
	public void Cardioservices() {
		System.out.println("FH-cardio");
	}

	@Override
	public void oncologyservices() {
		System.out.println("FH-oncology");

	}

	@Override
	public void entservices() {
		System.out.println("ent-UK");

	}

	@Override
	public void pediaservices() {
		System.out.println("FH-Pedia-UK");

	}

	@Override
	public void dentalservices() {
		System.out.println("Dental-in");
	}

	@Override
	public void skincareservices() {
		System.out.println("Skin-IN");

	}
	public void medicaltraining()
	{
		System.out.println("own method-medical training");
	}
	public void optservices()
	{
		System.out.println("OPT services");
	}

	@Override
	public void emergency() {
		System.out.println("emegency-own");
	}
	@Override
	public  void payment() {
			System.out.println("US medical payment");
		}

	@Override
	public void covidtest() {
		System.out.println("Covid test");
		
	}

	@Override
	public void covidvaccine() {
		System.out.println("Covid vaccine");		
	}
	}

