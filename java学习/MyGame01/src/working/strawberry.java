package working;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

// 文件名过滤器

public class strawberry {

	public static void main(String[] args) {

		File dir = new File("c:\\");

		File[] names = dir.listFiles(new bear());

		for (File str : names) {
			System.out.println(str);
		}

	}

}

class boat implements FilenameFilter {
	String name;

	public boat(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean accept(File dir, String st) {

		return st.endsWith(name);
	}
}

class bear implements FileFilter {

	@Override
	public boolean accept(File book) {
		return book.isDirectory();
	}

}