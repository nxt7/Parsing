package am.pdfreader;

import java.io.*;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.text.PDFTextStripper;


public class PdfReaderDemo {

	public static void main(String[] args)  {
		try {
			File pdfFile = new File("C:/Users/Admin/Downloads/h12.pdf");
			
			PDDocument pdDocument =Loader.loadPDF(pdfFile);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			String text = pdfStripper.getText(pdDocument);
			System.out.println(text);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}