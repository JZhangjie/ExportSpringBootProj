package test.demo.examples;

import java.util.ArrayList;
import java.util.List;

import test.demo.PackageBuilder;
import test.demo.entity.Entity;
import test.demo.entity.Filed;
import test.demo.entity.Function;

public class MeetingRecordResource extends PackageBuilder {
	
	protected List<Entity> buildEntities() {
		List<Entity> list = new ArrayList<Entity>();
		//构建Fileds
		List<Filed> fileds = new ArrayList<Filed>();
		fileds.add(new Filed("id", "Id", "VARCHAR", "String"));
		fileds.add(new Filed("title", "Title", "VARCHAR", "String"));
		fileds.add(new Filed("content", "Content", "VARCHAR", "String"));
		fileds.add(new Filed("starttime", "Starttime", "VARCHAR", "String"));
		fileds.add(new Filed("endtime", "Endtime", "VARCHAR", "String"));
		fileds.add(new Filed("createrid", "Createrid", "VARCHAR", "String"));
		fileds.add(new Filed("creatername", "Creatername", "VARCHAR", "String"));
		fileds.add(new Filed("createtime", "Createtime", "VARCHAR", "String"));
		
		//构建函数
		List<Function> functions = new ArrayList<Function>();
		//functions.add(new Function("getUsers", "List","list", "List<String>"));
		//构建实体
		Entity entity = new Entity();
		entity.setEntityname("MeetingRecord");
		entity.setEntitynamelow("meetingRecord");
		entity.setEntitytable("CA_MEETINGRECORD");
		entity.setPagekname("com.github.CalendarService");
		entity.setAttrs(fileds);
		entity.setFunctions(functions);

		list.add(entity);
		
		return list;
	}
}
