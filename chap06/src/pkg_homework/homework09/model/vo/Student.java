package pkg_homework.homework09.model.vo;

public class Student {
	
	private static int id;
	private String name;
	private String className;
	
	public Student() {
		id++;
	}
	
	public int getId() {
		System.out.print(id + " ");
		return id;
	}
	
	public String getName() {
		System.out.print(name + " ");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		System.out.print(className + " ");
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	

}
