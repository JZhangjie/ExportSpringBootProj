package test.demo.examples;

import java.util.ArrayList;
import java.util.List;

import test.demo.PackageBuilder;
import test.demo.entity.Entity;
import test.demo.entity.Filed;
import test.demo.entity.Function;

public class UserRoleOrg extends PackageBuilder {
	
	protected List<Entity> buildEntities() {
		List<Entity> list = new ArrayList<Entity>();
		//构建Fileds
		List<Filed> fileds = new ArrayList<Filed>();
		fileds.add(new Filed("id", "Id", "VARCHAR", "String"));
		fileds.add(new Filed("name", "Name", "VARCHAR", "String"));
		fileds.add(new Filed("alias", "Alias", "VARCHAR", "String"));
		fileds.add(new Filed("type", "Type", "VARCHAR", "String"));
		fileds.add(new Filed("parentid", "Parentid", "VARCHAR", "String"));
		fileds.add(new Filed("remark", "Remark", "VARCHAR", "String"));
		//构建函数
		List<Function> functions = new ArrayList<Function>();
		functions.add(new Function("getUsers", "List","list", "List<User>"));
		//构建实体
		Entity entity = new Entity();
		entity.setEntityname("Module");
		entity.setEntitynamelow("module");
		entity.setEntitytable("g_module");
		entity.setPagekname("com.github.ManageService");
		entity.setAttrs(fileds);
		entity.setFunctions(functions);

		list.add(entity);
		
		return list;
	}
}
