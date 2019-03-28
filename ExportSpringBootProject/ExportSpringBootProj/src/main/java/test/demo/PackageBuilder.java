package test.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import test.demo.entity.Entity;

public abstract class PackageBuilder {
	String templateDir = System.getProperty("user.dir")+"\\src\\template";
	
	public boolean build(String rootPath,String template) {
		List<Entity> list = buildEntities();
		
		if(list!=null) {
			for (Entity entity : list) {
				buildFiles(rootPath, entity);
			}
		}
		return true;
	}
	
	protected abstract List<Entity> buildEntities();
	
	private void buildFiles(String rootPath,Entity entity) {         
        System.out.println( "开始执行==》"+entity.getEntityname() );
        Properties pro = new Properties();
        pro.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
        pro.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, templateDir);
        VelocityEngine velocityEngine = new VelocityEngine(pro);
        velocityEngine.init(); 
        
        VelocityContext ctx = buildContext(entity);
        
        Template actionTpt = velocityEngine.getTemplate("dao.xml.vm","UTF-8"); 
        Template actionTpt2 = velocityEngine.getTemplate("dao.java.vm","UTF-8"); 
        Template actionTpt3 = velocityEngine.getTemplate("entity.vm","UTF-8"); 
        Template actionTpt4 = velocityEngine.getTemplate("service.vm","UTF-8"); 
        Template actionTpt5 = velocityEngine.getTemplate("endpoint.vm","UTF-8"); 
        
        outFile(actionTpt,ctx, makeDir(rootPath+"/dao/"),     entity.getEntityname()+"Mapper.xml"); 
        outFile(actionTpt2,ctx,makeDir(rootPath+"/dao/"),     entity.getEntityname()+"Mapper.java"); 
        outFile(actionTpt3,ctx,makeDir(rootPath+"/entity/"),  entity.getEntityname()+".java"); 
        outFile(actionTpt4,ctx,makeDir(rootPath+"/service/"), entity.getEntityname()+"Service.java"); 
        outFile(actionTpt5,ctx,makeDir(rootPath+"/endpoint/"),entity.getEntityname()+"Controller.java"); 
        System.out.println( "执行完成==》"+entity.getEntityname() );
    }
	
	/*
	 * 使用Entity构建VelocityContext对象
	 */
	private VelocityContext buildContext(Entity entity) {
        VelocityContext ctx = new VelocityContext(); 
        ctx.put("root_package_name", entity.getPagekname());
        ctx.put("entity_name", entity.getEntityname()); 
        ctx.put("entity_name_low", entity.getEntitynamelow());
        ctx.put("entity_table", entity.getEntitytable());
        ctx.put("entity_attrs", entity.getAttrs()); 
        ctx.put("entity_functions", entity.getFunctions()); 
        return ctx;
	}
	
    private void outFile(Template template, VelocityContext ctx, String path,String filename) { 
    	 PrintWriter writer = null; 
    	 try { 
	    	 writer = new PrintWriter(path+"\\"+filename); 
	    	 template.merge(ctx, writer); 
	    	 writer.flush(); 
    	 } catch (FileNotFoundException e) { 
    		 e.printStackTrace(); 
    	 } finally { 
    		 writer.close(); 
    	 } 
    }
    
    private String makeDir(String path) {
    	File file = new File(path);
    	if(!file.exists()) {
    		file.mkdir();
    	}
    	return path;
    }
}
