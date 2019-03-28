package test.demo.entity;

import java.util.List;

public class Function {
	private String name;
	private String paramtype;
	private String paramname;
	private String result;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getParamtype() {
		return paramtype;
	}
	public void setParamtype(String paramtype) {
		this.paramtype = paramtype;
	}
	public String getParamname() {
		return paramname;
	}
	public void setParamname(String paramname) {
		this.paramname = paramname;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Function(String name, String paramtype, String paramname, String result) {
		super();
		this.name = name;
		this.paramtype = paramtype;
		this.paramname = paramname;
		this.result = result;
	}
	
}
