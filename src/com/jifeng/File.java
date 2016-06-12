package com.jifeng;

import java.io.*;

public class File {
	String file;
	
	public File (String file) {
		this.file = file;
	}
	
	public void read() {
		String file = this.file;
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		int num = 0;
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			String line;
		    while ((line = br.readLine()) != null){
		    	System.out.println("line " + (++num) + ":" + line);
		    }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		
		
	}
}
