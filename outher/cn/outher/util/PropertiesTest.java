package cn.outher.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 读取properties文件里的信息
 * @author Administrator
 *
 */
public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prp=new Properties();
		String property = System.getProperty("user.dir");
		prp.load(new FileInputStream(new File(property+"/spring/resources/db.properties")));
		String name=(String) prp.get("name");
		System.out.println(name);
	}
}
