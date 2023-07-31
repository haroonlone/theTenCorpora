package org.theTenCorpora;
import java.awt.EventQueue;
import java.awt.Font;
//import java.awt.Graphics2D;
//import java.awt.Image;
//import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
//import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.ComponentOrientation;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class theTenApp {

	private JFrame frmTheTenQiraat;
	public String txtBuckWalter;
	public String txtArabic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					theTenApp window = new theTenApp();
					window.frmTheTenQiraat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public theTenApp() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheTenQiraat = new JFrame();
		frmTheTenQiraat.setResizable(false);
		frmTheTenQiraat.setTitle("The Ten Qira'at");
		frmTheTenQiraat.setBounds(100, 100, 1122, 668);
		frmTheTenQiraat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTheTenQiraat.getContentPane().setLayout(null);
		//Image image = new ImageIcon(this.getClass().getResource("/theTenLayoutV2.png")).getImage();
		
		txtBuckWalter = "";
		txtArabic = "";
		
		JPanel Verse = new JPanel();
		Verse.setForeground(Color.LIGHT_GRAY);
		Verse.setBounds(413, 87, 337, 157);
		frmTheTenQiraat.getContentPane().add(Verse);
		Verse.setLayout(null);
		
		Font fontA = new Font("Arial", Font.PLAIN, 20);
		Font fontB = new Font("Arial", Font.PLAIN, 14);
		
		final JTextArea verseTextArea = new JTextArea();
		verseTextArea.setBounds(16, 16, 216, 124);
		verseTextArea.setWrapStyleWord(true);
		verseTextArea.setLineWrap(true);
		verseTextArea.setForeground(Color.blue);
		verseTextArea.setFont(new Font("Majidi5", Font.PLAIN, 20));
		verseTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Verse.add(verseTextArea);
		
		
		
		JButton btnConvertToBuckWalter = new JButton("Convert");
		
		btnConvertToBuckWalter.setBounds(238, 64, 93, 29);
		Verse.add(btnConvertToBuckWalter);
		
		JScrollPane VerseScrollPane = new JScrollPane(verseTextArea);
		VerseScrollPane.setBounds(16, 16, 216, 124);
		Verse.add(VerseScrollPane);
		
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setSize(new Dimension(600, 500));
		lblNewLabel.setBounds(6, 6, 1109, 633);
		//ImageIcon imageIcon = new ImageIcon(fitimage(image, lblNewLabel.getWidth(), lblNewLabel.getHeight()));
		
		JPanel BuckWalter = new JPanel();
		BuckWalter.setBounds(413, 252, 337, 147);
		frmTheTenQiraat.getContentPane().add(BuckWalter);
		BuckWalter.setLayout(null);
		
		
		final JTextArea buckTextArea = new JTextArea();
		buckTextArea.setBounds(17, 16, 218, 114);
		buckTextArea.setWrapStyleWord(true);
		buckTextArea.setLineWrap(true);
		buckTextArea.setForeground(Color.blue);
		buckTextArea.setFont(fontB);
		BuckWalter.add(buckTextArea);
		
		JButton btnConvertToArabic = new JButton("Convert");
		
		btnConvertToArabic.setBounds(238, 59, 93, 29);
		BuckWalter.add(btnConvertToArabic);
		
		JScrollPane BuckScrollPane = new JScrollPane(buckTextArea);
		BuckScrollPane.setBounds(17, 16, 218, 114);
		BuckWalter.add(BuckScrollPane);
		
		JPanel BuckWalter_1 = new JPanel();
		BuckWalter_1.setLayout(null);
		BuckWalter_1.setBounds(413, 411, 337, 147);
		frmTheTenQiraat.getContentPane().add(BuckWalter_1);
		
		final JTextArea progressTextArea = new JTextArea();
		progressTextArea.setWrapStyleWord(true);
		progressTextArea.setLineWrap(true);
		progressTextArea.setBounds(17, 16, 301, 114);
		progressTextArea.setForeground(Color.blue);
		BuckWalter_1.add(progressTextArea);
		

		lblNewLabel.setIcon(new ImageIcon("/Users/haroonlone/eclipse-workspace/theTenCorpora/img/theTenLayoutV3.png"));
		frmTheTenQiraat.getContentPane().add(lblNewLabel);
		
		//To BuckWalter Conversion
		btnConvertToBuckWalter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String ex = verseTextArea.getText();
				buckTextArea.setText(Qaloon.toBuckwalter(ex));
				progressTextArea.setText("Converted Arabic to BuckWalter and copied the results...");
				StringSelection stringSelection = new StringSelection (buckTextArea.getText());
				Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
				clpbrd.setContents (stringSelection, null);
				ex=null;
			}
		});
		
		//To Arabic Conversion
		btnConvertToArabic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String ex = buckTextArea.getText();
				verseTextArea.setText(Qaloon.fromBuckwalter(ex).toString());
				progressTextArea.setText("Converted BuckWalter to Arabic and copied the results...");
				StringSelection stringSelection = new StringSelection (verseTextArea.getText());
				Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
				clpbrd.setContents (stringSelection, null);
				ex=null;
			}
		});
	}
}
