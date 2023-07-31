package org.theTenCorpora;

import org.jqurantree.analysis.AnalysisTable;
import org.jqurantree.arabic.ArabicText;
import org.jqurantree.arabic.encoding.EncodingType;
import org.jqurantree.orthography.Document;
import org.jqurantree.orthography.Token;
import org.jqurantree.search.SearchOptions;
import org.jqurantree.search.TokenSearch;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Qaloon {
	
	/*
	 * The `main` method is used for testing purposes and contains several test cases for the methods defined in the class.
	 * */
	public static void main(String[] args) {

		//String ex ="يُّوحَىٰٓ";
		//System.out.println(toBuckwalter(ex)+"\n");
		//System.out.println(toSimpleEncoding(ex)+"\n");
		//System.out.println(Document.getTokenCount()+"\n");
		
		//ex = "ٱلنَّبِيِّۦنَ";
		//System.out.println(toBuckwalter(ex)+"---\n");
		//System.out.println(toSimpleEncoding(ex)+"\n");
		//System.out.println(fromBuckwalter("{ln~abiy~i.na")+"\n");
		       //ex = "ٱلنَّبِيِّـۧنَ";
				//System.out.println(toBuckwalter(ex)+"\n");
				
				// Search #2: The Moon.
				//searchToken(toBuckwalter(ex));
				
		//createTokenCSV();
				
				// Convert Arabic to SimpleEncoding.
				//ex = "ٱلنَّبِيِّۦنَ";
				//System.out.println(toSimpleEncoding(ex)+"\n");
				//ex = "ٱلنَّبِيِّـۧنَ";
				//System.out.println(toSimpleEncoding(ex)+"\n");
		
		String inFilePath = "/Users/haroonlone/Documents/IOU/PhD/Semester 5/Buckwalter Files/5.2 - Ḥafṣ";
		String outFilePath = "/Users/haroonlone/Documents/IOU/PhD/Semester 5/Buckwalter Files/5.2 - Ḥafṣ - Buckwalter";

		//fileToBulkwalter(inFilePath,outFilePath);		
		fileFromBulkwalter(inFilePath,outFilePath);
		
		//createTokenRemoveDiacriticsCSV();
				
	}

	/*
	 * Function to Convert Arabic to Buckwalter: 
	 * The `toBuckwalter` method inputs an Arabic text string and returns its Buckwalter transliteration.
	 */
	public static String toBuckwalter(String ex)
	{			
		ArabicText ara= new ArabicText(ex); 
		return ara.toBuckwalter();
	}
	
	/*
	 * Function to Convert Buckwalter to Arabic: 
	 * The `fromBuckwalter` method takes a Buckwalter transliteration string as input 
	 * and returns the corresponding Arabic text as an `ArabicText` object.
	 */
	public static ArabicText fromBuckwalter(String ex)
	{					
		return ArabicText.fromBuckwalter(ex);
	}
	
	/*
	 * Function to Convert Arabic to SimpleEncoding: 
	 * The `toSimpleEncoding` method converts Arabic text to a simplified encoding format.
	 */
	public static String toSimpleEncoding(String ex)
	{			
		ArabicText ara= new ArabicText(ex); 
		return ara.toSimpleEncoding();
	}
	
		
	/*
	 *  Fuction to Create Tokens CSV File: 
	 *  The `createTokenCSV` method creates an `AnalysisTable` and populates it with token information 
	 *  (chapter number, verse number, token number, token text, and Buckwalter transliteration obtained 
	 *  from the `Document` class. The resulting table is then exported to a CSV file.
	 */
	private static void createTokenCSV() {
		// Step 1. Create a new analysis table and display all tokens in Arabic.
        AnalysisTable table = new AnalysisTable(
            "ChapterNumber", "VerseNumber", "TokenNo","Token","BuckWalter");
        // Step 2. Tabulate the number of tokens in each verse.
        
        for (Token token : Document.getTokens()) {

			// Encode token.
			String diacriticText = token.toString();
			table.add(token.getChapterNumber(), token.getVerseNumber(),token.getTokenNumber(), diacriticText, token.toBuckwalter());
			
		}
        System.out.println(table.toString(7));
        // Export results to a CSV file.
        table.writeFile("tokens_tanzil_1.1 Oct-2021.csv", '\t');
	}
	
	/*
	 * Function to Create Tokens with Diacritics: 
	 * The`createTokenRemoveDiacriticsCSV` method creates an `AnalysisTable` similar to `createTokenCSV,` 
	 * but it removes diacritics from the tokens before adding them to the table.
	 */
	private static void createTokenRemoveDiacriticsCSV() {
		// Step 1. Create a new analysis table and display all tokens in Arabic.
        AnalysisTable table = new AnalysisTable(
            "ChapterNumber", "VerseNumber", "TokenNo","Token","BuckWalter");
        // Step 2. Tabulate the number of tokens in each verse.
        
        for (Token token : Document.getTokens()) {

			// Encode token.
			String diacriticText = token.removeDiacritics().toString(); //Removing diacritics
			table.add(token.getChapterNumber(), token.getVerseNumber(),token.getTokenNumber(), diacriticText, token.toBuckwalter());
			
		}
        System.out.println(table.toString(7));
        // Export results to a CSV file.
        table.writeFile("tokens_remove_diacritics.csv", '\t');
	}
	
	/*
	 * Function to Convert an Arabic Text File to Buckwalter Transliteration: 
	 * A function that will take an Arabic Text File as an input text file 
	 * and convert each line to Buckwalter Transliteration using the `toBuckwalter` method. 
	 * The resulting Buckwalter Transliteration is then written to another file specified by `outFilePath`.	
	 */
	private static void fileFromBulkwalter(String inFilePath, String outFilePath)
	{
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(inFilePath));
			String line = reader.readLine();
			
			File file =new File(outFilePath);
	    	file.createNewFile();
	    	  
	    	FileWriter fw = new FileWriter(file);
	      	BufferedWriter bw = new BufferedWriter(fw);
	      	PrintWriter pw = new PrintWriter(bw);
	    	String output = "";	
	    	 
			while (line != null) {
				output = toBuckwalter(line).toString();
				System.out.println(output);
				pw.println(output);
				// read next line
				line = reader.readLine();
			}
			reader.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Function to Convert a Buckwalter Transliteration File to Arabic Text: 
	 * A function that will take a Buckwalter Transliteration File as an input text file 
	 * and convert each line to Arabic Text using the `fromBuckwalter` method. 
	 * The resulting Arabic text is then written to another file specified by `outFilePath`.
	 */
	private static void fileToBulkwalter(String inFilePath, String outFilePath)
	{
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(inFilePath));
			String line = reader.readLine();
			
			File file =new File(outFilePath);
	    	file.createNewFile();
	    	  
	    	FileWriter fw = new FileWriter(file);
	      	BufferedWriter bw = new BufferedWriter(fw);
	      	PrintWriter pw = new PrintWriter(bw);
	    	String output = "";	
	    	 
			while (line != null) {
				output = fromBuckwalter(line).toString();
				System.out.println(output);
				pw.println(output);
				// read next line
				line = reader.readLine();
			}
			reader.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	/*
	 * The `searchToken` method performs a token search based on a provided Buckwalter string and displays the results using an `AnalysisTable`.
	 */
	private static void searchToken(String buck) {
		System.out.println("The search is "+buck+".");
		// Search for substring "qamar" or exact token "lo>ahil~api"
		TokenSearch search = new TokenSearch(EncodingType.Buckwalter);
		search.findSubstring(buck);
		//search.findToken("{lo>ahil~api");

		// Display the results.
		AnalysisTable table = search.getResults();
		System.out.println(table);
		System.out.println("Matches: " + table.getRowCount() + "\r\n");
	}
}
