package test.demo.examples;

import java.util.ArrayList;
import java.util.List;

import test.demo.PackageBuilder;
import test.demo.entity.Entity;
import test.demo.entity.Filed;
import test.demo.entity.Function;

public class DDMapE extends PackageBuilder {
	
	protected List<Entity> buildEntities() {
		List<Entity> list = new ArrayList<Entity>();
		//构建Fileds
		List<Filed> fileds = new ArrayList<Filed>();
		fileds.add(new Filed("id", "Id", "VARCHAR", "String"));
		fileds.add(new Filed("typename", "Typename", "VARCHAR", "String"));
		fileds.add(new Filed("typelevel1", "Typelevel1", "VARCHAR", "String"));
		fileds.add(new Filed("typelevel2", "Typelevel2", "VARCHAR", "String"));
		fileds.add(new Filed("name", "Name", "VARCHAR", "String"));
		fileds.add(new Filed("jzlb", "Jzlb", "VARCHAR", "String"));
		fileds.add(new Filed("jblb", "Jblb", "VARCHAR", "String"));
		fileds.add(new Filed("zylx", "Zylx", "VARCHAR", "String"));
		fileds.add(new Filed("gylb", "Gylb", "VARCHAR", "String"));
		fileds.add(new Filed("gyxt", "Gyxt", "VARCHAR", "String"));
		fileds.add(new Filed("cclb", "Cclb", "VARCHAR", "String"));
		fileds.add(new Filed("syzk", "Syzk", "VARCHAR", "String"));
		fileds.add(new Filed("sfjg", "Sfjg", "BOOLEAN", "boolean"));
		fileds.add(new Filed("parentid", "Parentid", "VARCHAR", "String"));
		fileds.add(new Filed("lng", "Lng", "VARCHAR", "String"));
		fileds.add(new Filed("lat", "Lat", "VARCHAR", "String"));
		fileds.add(new Filed("locationname", "Locationname", "VARCHAR", "String"));
		fileds.add(new Filed("addr", "Addr", "VARCHAR", "String"));
		fileds.add(new Filed("creatername", "Creatername", "VARCHAR", "String"));
		fileds.add(new Filed("createtime", "Createtime", "VARCHAR", "String"));
		fileds.add(new Filed("mobile", "Mobile", "VARCHAR", "String"));
		fileds.add(new Filed("attachmentpath", "Attachmentpath", "VARCHAR", "String"));
		//构建函数
		List<Function> functions = new ArrayList<Function>();
		//functions.add(new Function("getUsers", "List","list", "List<String>"));
		//构建实体
		Entity entity = new Entity();
		entity.setEntityname("POIEntity");
		entity.setEntitynamelow("poientity");
		entity.setEntitytable("xz_poi_cj");
		entity.setPagekname("com.github.DDService");
		entity.setAttrs(fileds);
		entity.setFunctions(functions);

		list.add(entity);
		
		return list;
	}
}
