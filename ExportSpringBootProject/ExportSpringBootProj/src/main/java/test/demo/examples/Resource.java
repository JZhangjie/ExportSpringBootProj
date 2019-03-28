package test.demo.examples;

import java.util.ArrayList;
import java.util.List;

import test.demo.PackageBuilder;
import test.demo.entity.Entity;
import test.demo.entity.Filed;
import test.demo.entity.Function;

public class Resource extends PackageBuilder {
	
	protected List<Entity> buildEntities() {
		List<Entity> list = new ArrayList<Entity>();

		list.add(this.buildResourceEntity());
		list.add(this.buildResourceDicEntity());
		list.add(this.buildResourcePermissionEntity());
		list.add(this.buildKVNode());
		
		return list;
	}
	private Entity buildKVNode() {
		//构建Fileds
		List<Filed> fileds = new ArrayList<Filed>();
		fileds.add(new Filed("id", "Id", "VARCHAR", "String"));
		fileds.add(new Filed("name", "Name", "VARCHAR", "String"));
		fileds.add(new Filed("alias", "Alias", "VARCHAR", "String"));
		fileds.add(new Filed("parentid", "Parentid", "VARCHAR", "String"));
		fileds.add(new Filed("sortid", "Sortid", "INTEGER", "int"));
		fileds.add(new Filed("status", "Status", "VARCHAR", "String"));
		fileds.add(new Filed("remark", "Remark", "VARCHAR", "String"));
		//构建函数
		List<Function> functions = new ArrayList<Function>();
		//functions.add(new Function("getUsers", "List list", "List<User>"));
		//构建实体
		Entity entity = new Entity();
		entity.setEntityname("KVNode");
		entity.setEntitynamelow("kvnode");
		entity.setEntitytable("g_kvnode");
		entity.setPagekname("com.github.ManageService");
		entity.setAttrs(fileds);
		entity.setFunctions(functions);
		
		return entity;
	}
	
	private Entity buildResourceEntity() {
		//构建Fileds
		List<Filed> fileds = new ArrayList<Filed>();
		fileds.add(new Filed("id", "Id", "VARCHAR", "String"));
		fileds.add(new Filed("name", "Name", "VARCHAR", "String"));
		fileds.add(new Filed("alias", "Alias", "VARCHAR", "String"));
		fileds.add(new Filed("content", "Content", "VARCHAR", "String"));
		fileds.add(new Filed("parentid", "Parentid", "VARCHAR", "String"));
		fileds.add(new Filed("type", "Type", "VARCHAR", "String"));
		fileds.add(new Filed("remark", "Remark", "VARCHAR", "String"));
		//构建函数
		List<Function> functions = new ArrayList<Function>();
		//functions.add(new Function("getUsers", "List list", "List<User>"));
		//构建实体
		Entity entity = new Entity();
		entity.setEntityname("Resource");
		entity.setEntitynamelow("resource");
		entity.setEntitytable("g_resource");
		entity.setPagekname("com.github.ManageService");
		entity.setAttrs(fileds);
		entity.setFunctions(functions);
		
		return entity;
	}
	private Entity buildResourceDicEntity() {
		//构建Fileds
		List<Filed> fileds = new ArrayList<Filed>();
		fileds.add(new Filed("id", "Id", "VARCHAR", "String"));
		fileds.add(new Filed("name", "Name", "VARCHAR", "String"));
		fileds.add(new Filed("alias", "Alias", "VARCHAR", "String"));
		fileds.add(new Filed("parentid", "Parentid", "VARCHAR", "String"));
		fileds.add(new Filed("type", "Type", "VARCHAR", "String"));
		fileds.add(new Filed("remark", "Remark", "VARCHAR", "String"));
		//构建函数
		List<Function> functions = new ArrayList<Function>();
		//functions.add(new Function("getUsers", "List list", "List<User>"));
		//构建实体
		Entity entity = new Entity();
		entity.setEntityname("ResourceDic");
		entity.setEntitynamelow("resourceDic");
		entity.setEntitytable("g_resource_dic");
		entity.setPagekname("com.github.ManageService");
		entity.setAttrs(fileds);
		entity.setFunctions(functions);
		
		return entity;
	}
	private Entity buildResourcePermissionEntity() {
		//构建Fileds
		List<Filed> fileds = new ArrayList<Filed>();
		fileds.add(new Filed("id", "Id", "VARCHAR", "String"));
		fileds.add(new Filed("type", "Type", "VARCHAR", "String"));
		fileds.add(new Filed("roleid", "Roleid", "VARCHAR", "String"));
		fileds.add(new Filed("resourceid", "Resourceid", "VARCHAR", "String"));
		fileds.add(new Filed("statusid", "Statusid", "VARCHAR", "String"));
		//构建函数
		List<Function> functions = new ArrayList<Function>();
		//functions.add(new Function("getUsers", "List","list", "List<User>"));
		//构建实体
		Entity entity = new Entity();
		entity.setEntityname("ResourcePermission");
		entity.setEntitynamelow("resourcePermission");
		entity.setEntitytable("g_resource_permission");
		entity.setPagekname("com.github.ManageService");
		entity.setAttrs(fileds);
		entity.setFunctions(functions);
		
		return entity;
	}
}
