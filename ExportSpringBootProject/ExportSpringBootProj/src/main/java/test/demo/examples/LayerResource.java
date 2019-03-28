package test.demo.examples;

import java.util.ArrayList;
import java.util.List;

import test.demo.PackageBuilder;
import test.demo.entity.Entity;
import test.demo.entity.Filed;
import test.demo.entity.Function;

public class LayerResource extends PackageBuilder {
	
	protected List<Entity> buildEntities() {
		List<Entity> list = new ArrayList<Entity>();
		//构建Fileds
		List<Filed> fileds = new ArrayList<Filed>();
		fileds.add(new Filed("id", "Id", "VARCHAR", "String"));
		fileds.add(new Filed("key", "Key", "VARCHAR", "String"));
		fileds.add(new Filed("label", "Label", "VARCHAR", "String"));
		fileds.add(new Filed("type", "Type", "VARCHAR", "String"));
		fileds.add(new Filed("visible", "Visible", "BOOLEAN", "boolean"));
		fileds.add(new Filed("opacity", "Opacity", "REAL", "float"));
		fileds.add(new Filed("url", "Url", "VARCHAR", "String"));
		//构建函数
		List<Function> functions = new ArrayList<Function>();
		//functions.add(new Function("getUsers", "List","list", "List<String>"));
		//构建实体
		Entity entity = new Entity();
		entity.setEntityname("Layer");
		entity.setEntitynamelow("layer");
		entity.setEntitytable("g_layer_resource");
		entity.setPagekname("com.github.ManageService");
		entity.setAttrs(fileds);
		entity.setFunctions(functions);

		list.add(entity);
		
		return list;
	}
}
