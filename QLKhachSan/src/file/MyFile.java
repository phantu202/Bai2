package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Room;



public class MyFile {
	public static void main(String[]args){
		output();
		input();
		}
	public void output(Object a, String nameFile) {
		try {
			FileOutputStream fos = new FileOutputStream(nameFile);
			ObjectOutputStream abc = new ObjectOutputStream(fos);
			abc.writeObject(a);
			abc.close();
		} catch (Exception e) {
			System.out.println("Lỗi ghi ra file");
		}
	}
	public Object docFile(String nameFile) {
		try {
			FileInputStream fis = new FileInputStream(nameFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object oject = ois.readObject();
			ois.close();
			return oject;
		} catch (Exception e) {
			System.out.println("Lỗi file");
			return null;
		}
	}

	public static void output() {
		try {
			FileOutputStream fos = new FileOutputStream("room.txt");
			ObjectOutputStream abc = new ObjectOutputStream(fos);
			Room room = new  Room(1, "Đôi", 1);
			abc.writeObject(room);
			abc.close();
		} catch (Exception e) {
		}
	}
	public static void input() {
		try {
			FileInputStream fis = new FileInputStream("room.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Room room = (Room) ois.readObject();
			ois.close();
			System.out.println(room.toString());
		} catch (Exception e) {
		}
	}
	
	
}
