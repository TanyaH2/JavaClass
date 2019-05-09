package com.class27;

/*
 * Create a class File that will have the following behaviors: open, edit, close. 
 * Edit and close are implemented method while open is an abstract. Create 3 subclasses: 
 * JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour: 
 * Exmaple: to open .java file we need notepad++ or sublime tex, to open .doc file we need Microsoft word to be installed
 */

public abstract class File {

	public abstract void open();
	
	public void edit(){
		System.out.println("Programm can be edited ");
	}
	public void close(){
		System.out.println("Programm can be closed");
	}
	
	public static void main(String[] args) {
		JavaFile obj=new JavaFile();
		obj.open();
		obj.edit();
		obj.close();
		WordFile obj1=new WordFile();
		obj1.open();
		obj1.edit();
		obj1.close();
		PDFFile obj2=new PDFFile();
		obj2.open();
		obj2.edit();
		obj2.close();
	}
}

 class JavaFile extends File{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("to open .java file we need notepad++ or sublime text");
	}
	
	
}
 class WordFile extends File{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("to open .doc file we need Microsoft word to be installed");
	}
	
	
}
 class PDFFile extends File{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("to open .pdf file we need PDF to be installed");
	}
	
	
}