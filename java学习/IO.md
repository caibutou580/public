## IO流

​	1、IO原理：用于处理设备上的数据的技术。设备：内存，硬盘，光盘。

​	2、什么是流：流指系统资源。【注意】使用完资源一定要记住***释放***。

​	3、IO中的常见类：

#### File 类。常见方法：

* 获取文件名称的方法。getName();

* 获取文件空间大小的方法。length();

* 获取路径的方法。

  getAbsolutePath();  获取文件对象的绝对路径，即使封装的相对的，获取到的也是绝对的。

  getPath();   获取的是file对象的封装的路径，封装的是什么，获取到的就是什么。

* 获取最后一次修改时间。lastModified();

* 判断该文件是否为隐藏文件。isHidden();

* 创建文件 createNewFile();

* 删除文件  delete();

* 判断文件是否存在 exists();

* 创建文件夹  mkdir();

* 创建多级目录  mkdirs();



~~~java
package com.io;

import java.io.File;
import java.io.IOException;

// File类，常见的方法。

public class File_01 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\zy\\Desktop\\haha");	// 初始化 File类。
		
//		Demo1(file);
		Demo2();	
	}

	private static void Demo1(File file) {

	// File类，获取文件名称的方法。
	String file_name = file.getName();

	// File类，获取文件空间大小的方法。
	Long file_void = file.length();
	
	// File类，获取路径的方法。
	String Abso = file.getAbsolutePath(); // 获取文件对象的绝对路径，即使封装的相对的，获取到的也是绝对的。 
	String path =file.getPath();	// 获取的是file对象的封装的路径，封装的是什么，获取到的就是什么。
	
	// 获取最后一次修改时间。
	Long time = file.lastModified();
	
	// 判断该文件是否为隐藏文件。
	boolean b = file.isHidden();
	}

	private static void Demo2() throws IOException {
		File Show = new File("C:\\Users\\zy\\Desktop\\hu");
		// 创建文件
		boolean NewFile = Show.createNewFile();
//		System.out.println(NewFile);
		
		// 删除文件
//		boolean Del = Show.delete();
//		System.out.println(Del); // 注意：删除后不可恢复。
	
//		// 判断文件是否存在。
//		boolean k = Show.exists();
//		System.out.println(k);
		
		// 创建文件夹
//		boolean dir = Show.mkdir();
//		System.out.println(dir);
		//创建多级目录
//		boolean dirs = Show.mkdirs();
//		System.out.println(dirs);
//		
//		boolean DelDir = Show.delete();
//		System.out.println(DelDir);
		
	}
}
~~~



##### 文件过滤：

1、文件名过滤器。FilenameFilter

~~~java
package com.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.attribute.FileAttribute;

// 获取后缀名为.java的文件。
public class Demo04 {
	public static void main(String[] args) {
		File file = new File("D:\\");

//		String[] name = file.list(new book("o"));	// 查找后缀多个字符
		String[] name = file.list(new note(""));	// 查找包含的多个字符
		
		for (String str : name) {
			System.out.println(str);
			
		}
	}

}


// 查找包含字符方法。
class note implements FilenameFilter{
	String get;


	public note(String get) {
		super();
		this.get = get;
	}

	@Override
	public boolean accept(File file, String name) {
	
		return name.contains(get);
	}
}


// 查找后缀多个字符方法。
class book implements FilenameFilter{
	
	String cat;
	
	public book(String cat) {
		super();
		this.cat = cat;
	}

	@Override
	public boolean accept(File file, String name) {
		
		return name.endsWith(cat) ;
	}
}
~~~



2、文件过滤器。  FileFilter

~~~Java
import java.io.File;
import java.io.FileFilter;

// 文件过滤器
public class Filedel_File {
	public static void main(String[] args) {
		
		File file = new File("D:\\");
		
		File[] jk = file.listFiles(new book());
		
		for (File fi : jk) {
			System.out.println(fi);
		}
		
	}
}


class book implements FileFilter{

	@Override
	public boolean accept(File get) {
		// TODO Auto-generated method stub
		return get.isFile();
	}
}
~~~



##### 获取子目录内容：

​	采取***递归***遍历文件夹对象数组。

~~~java
package com.io;

import java.io.File;

// 查看文件夹所有子目录的文件（遍历子目录）

public class FileDir {
	public static void main(String[] args) {

		File file = new File("I:\\hadoop2.0全套视频");

		get(file);

	}

	private static void get(File file) {

		// 获取文件对象数组。
		File[] set = file.listFiles();

		// 遍历数组，
		for (File fi : set) {
			if (fi.isDirectory()) {
				get(fi);	// 如果是文件夹，调用get方法继续遍历该文件夹（递归遍历）
			} else {
				System.out.println(fi);
			}

		}
	}

}
~~~





##### 删除文件夹及文件夹下文件

~~~java

package com.io;

import java.io.File;

//删除文件夹及文件夹下的文件。

public class diguiDemo {
	public static void main(String[] args) {
		
		File file = new File("I:\\hadoop2.0全套视频 - 副本");
		dele(file);
	}

	private static void dele(File file) {
		
		File[] sta = file.listFiles();
		for (File fi : sta) {
			if(fi.isDirectory()) {
				dele(fi);
				System.out.println();
			}else {
				System.out.println(fi.delete());
			}
		}
		System.out.println(file.delete());	
	}

}

~~~



#### IO流常用基类：

![IO流](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1579064822855&di=ef9d566b82795de03cfc14a742a49831&imgtype=jpg&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D178245042%2C3820891335%26fm%3D214%26gp%3D0.jpg)

---

##### 字节流的抽象基类：

​	1、输出流（写数据）：OutputStream

---

【注意】:

1、字节流只能对字节数进行操作（Byte类型）

2、输出流操作文件时，如果该目录下不存在该文件就会创建，若有该文件就会覆盖。

3、输出流写完数据后记得一定要**释放资源**（XXX.close)



```java
package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 向文件中写入数据（output)
	
public class output {
	public static void main(String[] args) throws IOException {
		
		//创建多级文件夹：
		
		File dir = new File("H:\\temp");
		if(!dir.exists()) { 	// 判断该文件夹是否存在。
			boolean dirs = dir.mkdirs();
		}
		
		//1、 创建字节流对象 (字节流只能操作字节)
			   // 输出流所操作的文件，若该地址下不存在就会创建，若存在就覆盖。
		FileOutputStream sta1 = new FileOutputStream("H:\\temp\\haha.txt");
			
		// 2、调用输出流的写功能。
			  // 写入过程中将字符串转换成字节数组
			sta1.write("diuyfgqiw".getBytes()); 
			
			
		// 3、释放资源	
		sta1.close();
	}

}
```



4、对文件进行续写。<font size="4" color="red">注意：</font> 续写过程中的<font color="red">换行</font>推荐调用方法，可实现跨平台。

~~~Java
package works;

import java.io.FileOutputStream;
import java.io.IOException;

public class green {
	private static final String huanhang = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		//初始化文件
		FileOutputStream sta1 = new FileOutputStream("C:\\Users\\猜不透！\\Desktop\\123.txt",true);  //  添加 true 就可对文件进行续写（追加） 
		
		// 写入数据
		sta1.write("hello".getBytes());
		sta1.write("\rjava".getBytes()); //  \r 表示换行(windows中使用)
		
	
		// 跨平台换行解决方案：调用方法(huanhang)。
		String str = huanhang+ "green";
		sta1.write(str.getBytes());
		
		// 释放资源
		sta1.close();
		
	}

}
~~~

















