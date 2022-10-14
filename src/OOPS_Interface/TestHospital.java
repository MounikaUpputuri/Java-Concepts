package OOPS_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital f=new FortisHospital();
		f.Cardioservices();
		f.dentalservices();
		f.emergency();
		f.entservices();
		f.medicaltraining();
		f.oncologyservices();
		f.optservices();
		f.pediaservices();
		f.Phsycioservices();
		f.skincareservices();
		USMedical.billing();
		f.payment();
		f.payment();
		f.covidtest();
		f.covidvaccine();
		f.covidinfo();
		
		//top casting can accessed all the methods in usmedical
		USMedical us=new FortisHospital();
		us.Cardioservices();
		us.emergency();
		us.oncologyservices();
		us.Phsycioservices();
		
		UKMedical uk=new FortisHospital();
		uk.emergency();
		uk.entservices();
		uk.pediaservices();
		
		
		
		
		
	}

}
