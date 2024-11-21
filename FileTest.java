package part3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File myFile = new File("C:\\upload\\a.txt"); //검증없이 생성
		if(myFile.exists()==false) { //검증
			System.out.println("a.txt 존재하지않음");
			myFile.createNewFile(); //파일만 생성, 사용할일 없음
			
			
		}else {
			System.out.println("파일이 존재함");
			//FileInputStream fis = new FileInputStream(myFile);
			//...읽기 작업
		}
		File reDir = new File("C:\\java\\yourJava");
		if(reDir.isDirectory()==false) {
			System.out.println("C:\\java\\yourJava 폴더 생성");
			reDir.mkdirs(); //상위폴더까지 생성
			//reDir.mkdir(); //최하위 폴더만 생성
		}
		//파일 이동
		File reFile = new File(reDir, "b.txt");
		//C:\\upload\\a.txt --> C:\\java\\yourJava\\b.txt
		
		myFile.renameTo(reFile);
	
		System.out.println("이동완료");
		
	}
}
