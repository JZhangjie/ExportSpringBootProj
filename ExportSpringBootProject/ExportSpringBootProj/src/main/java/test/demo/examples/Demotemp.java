package test.demo.examples;

import java.util.ArrayList;
import java.util.List;

import test.demo.PackageBuilder;
import test.demo.entity.Entity;
import test.demo.entity.Filed;
import test.demo.entity.Function;

public class Demotemp extends PackageBuilder {
	
	protected List<Entity> buildEntities() {
		List<Entity> list = new ArrayList<Entity>();
		//构建Fileds
		List<Filed> fileds = new ArrayList<Filed>();
		fileds.add(new Filed("id", "Id", "VARCHAR", "String"));
		fileds.add(new Filed("name", "Name", "VARCHAR", "String"));
		fileds.add(new Filed("status", "Status", "VARCHAR", "String"));
		fileds.add(new Filed("type", "Type", "VARCHAR", "String"));
		//构建函数
		List<Function> functions = new ArrayList<Function>();
		functions.add(new Function("getUsers", "List","list", "List<String>"));
		//构建实体
		Entity entity = new Entity();
		entity.setEntityname("DicEntity");
		entity.setEntitynamelow("dicEntity");
		entity.setEntitytable("g_dic");
		entity.setPagekname("com.github.ManageService");
		entity.setAttrs(fileds);
		entity.setFunctions(functions);

		list.add(entity);
		
		return list;
	}
}
