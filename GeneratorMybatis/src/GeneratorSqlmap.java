

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorSqlmap {

	public void generator() throws Exception{

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
		File configFile = new File("GeneratorMybatis/generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);

	}

	static ArrayList<String> list  = new ArrayList<>();
	public static void main(String[] args) {
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
//		[aaa, bbb, ccc]
		System.out.println("------------"+"[aaa, bbb, ccc]");
//		try {
//			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
//			generatorSqlmap.generator();
//		} catch (Exception e) {
//			System.out.println("-------"+e.getMessage());
//			e.printStackTrace();
//		}
		
	}

}


