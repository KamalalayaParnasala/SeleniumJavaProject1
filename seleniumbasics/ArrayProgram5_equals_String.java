package seleniumbasics;

import java.util.Arrays;

public class ArrayProgram5_equals_String {

	public static void main(String[] args) {
		String name []=new String[3];
		name[0]= "Kamala";
		name[1]= "Laya";
		name[2]= "Vaishu";
		
		
		String name_name []=new String[3];
		name_name[0]= "Kamala";
		name_name[1]= "Laya";
		name_name[2]= "Vaishu";
		
		
		boolean namematching = Arrays.equals(name, name_name);
		System.out.println(namematching);
		
			String name2 []=new String[3];
			name2[0]= "Kamala";
			name2[1]= "Laya";
			name2[2]= "Krishna";
			
			String name_name2 []=new String[3];
			name_name2[0]= "Kamala";
			name_name2[1]= "Laya";
			name_name2[2]= "Vaishu";
			
			boolean namematching2 = Arrays.equals(name2, name_name2);
			System.out.println(namematching2);
	}

}
