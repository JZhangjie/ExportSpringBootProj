package test.demo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import test.demo.examples.DDMapE;

/**
 * 自动生成java文件
 *
 */
public class App 
{
	/*
	 * ${entity_name}
	 * ${entity_name_low}
	 * ${root_package_name}
	 * ${entity_table}
	 * entity_attrs [['id','VARCHAR','String'],['name','VARCHAR','String']]
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String rootPath ="D:\\work\\workspace\\GIS\\DDProject\\test\\src\\main\\java\\com\\github\\DDService";
        PackageBuilder pBuilder = new DDMapE();
        pBuilder.build(rootPath,"");

    }
}
