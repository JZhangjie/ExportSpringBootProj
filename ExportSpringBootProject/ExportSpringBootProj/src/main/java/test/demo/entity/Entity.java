package test.demo.entity;

import java.util.List;

public class Entity {
	private String pagekname;
	private String entityname;
	private String entitynamelow;
	private String entitytable;
	private List<Filed> attrs;
	private List<Function> functions;
	public String getPagekname() {
		return pagekname;
	}
	public void setPagekname(String pagekname) {
		this.pagekname = pagekname;
	}
	public String getEntityname() {
		return entityname;
	}
	public void setEntityname(String entityname) {
		this.entityname = entityname;
	}
	public String getEntitynamelow() {
		return entitynamelow;
	}
	public void setEntitynamelow(String entitynamelow) {
		this.entitynamelow = entitynamelow;
	}
	public String getEntitytable() {
		return entitytable;
	}
	public void setEntitytable(String entitytable) {
		this.entitytable = entitytable;
	}
	public List<Filed> getAttrs() {
		return attrs;
	}
	public void setAttrs(List<Filed> attrs) {
		this.attrs = attrs;
	}
	public List<Function> getFunctions() {
		return functions;
	}
	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}
	
	
}
