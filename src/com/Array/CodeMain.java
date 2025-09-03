package com.Array;

public class CodeMain {
	    public static void main(String[] args) {
	        String str = "Hi , Good @fternoon! How are YoU?";
	        char[] ch = str.toCharArray();
	        int charCount = 0;
	        int digitCount = 0;
	        int specialChar = 0;
	        int whiteSpace=0;
	        int specialIndex = 0;

	        for (int i = 0; i < ch.length; i++) {
	            if (Character.isLetter(ch[i])) {
	                charCount++;
	            } else if (Character.isDigit(ch[i])) {
	                digitCount++;
	            }
	            else if(Character.isWhitespace(ch[i])) {
	            	whiteSpace++;
	            }
	            
	            else {
	                specialChar++;
	                System.out.println("index of a specialChar" + specialIndex + " " + i);
	                specialIndex++;
	            }
	        }

	        // Final counts
	        System.out.println(charCount);     // Letters count
	        System.out.println(digitCount);    // Digits count
	        System.out.println(specialChar);   // Special characters count
	        System.out.println(whiteSpace);
	    }
	}

