package test.demo.entity;

public class Filed {
	private String name;
	private String nameupper;
	private String dbtype="VARCHAR";
	private String javatype="String";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameupper() {
		return nameupper;
	}
	public void setNameupper(String nameupper) {
		this.nameupper = nameupper;
	}
	public String getDbtype() {
		return dbtype;
	}
	public void setDbtype(String dbtype) {
		this.dbtype = dbtype;
	}
	public String getJavatype() {
		return javatype;
	}
	public void setJavatype(String javatype) {
		this.javatype = javatype;
	}
	public Filed(String name, String nameupper, String dbtype, String javatype) {
		this.name = name;
		this.nameupper = nameupper;
		this.dbtype = dbtype;
		this.javatype = javatype;
	}
	
	
}
