package ConstructorConcept;

public class BrowserVersion {
	private String name;
	private double version;
	private String plugin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getPlugin() {
		return plugin;
	}

	public void setPlugin(String plugin) {
		this.plugin = plugin;
	}

	public BrowserVersion(String name, double version, String plugin) {

		this.name = name;
		this.version = version;
		this.plugin = plugin;
	}
	public void browserversion(String name, double version, String plugin)
	{
		System.out.println(name +" "+version+" "+plugin);
	}

	public static void main(String[] args) {

	}

}
