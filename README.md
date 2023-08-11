# theTenCorpora
An application for converting the Ten Qira`at Arabic Text to Buckwalter Transliteration.

**JQuran Java API Limitations**

The JQuran API uses the Qur`ānic text from Tanzil Project in the XML file format. The version of the XML file version used in it is 1.0.1, that got released on February 4, 2008. However, the version released on February 12, 2021, is 1.1, with several corrections and enhancements. Consequently, the available JQuran API could not handle the Arabic Text conversion to Buckwalter transliteration for the below scenarios. 

•	Pause marks (ۖ ۗ ۘ ۙ ۚ ۛ)

•	Sajdah signs (۩)

•	Rub’ al-Ḥizb  signs (۞) and verse end signs (۝)

•	Taṭwīl below superscript alif (like in الرَّحْمَـٰن)

•	Small high ya (ۧ) as superscript (like in إِبْرَٰهِـۧمَ) (Tanzil, 2021)

Additionally, there was a requirement to allocate special symbols related to the Ten Qira`at Corpus development with scenarios like words having Taqlīl and Tashīl. 

So, there was a need to update the API to handle these enhancements and enrich it for the special symbols that would be used in the Qira`āt difference presentation. To achieve this, there was a need to introduce new characters in the existing list of Buckwalter Transliteration. Thus, we listed all symbols, small and capital letters, and their status of being used or free in the Buckwalter Transliteration. Then, all Arabic Unicode letters were listed, and the relevant ones were chosen for consideration. Finally, specific Buckwalter ASCII characters were assigned for the new Unicode handling, and JQuran Java API was updated accordingly. The newly included symbols are listed in the Table below. 

**Table Buckwalter Enhancements Characters**

<img width="389" alt="image" src="https://github.com/haroonlone/theTenCorpora/assets/47498442/7c7d7b22-6545-4a30-bc33-2128fda359b7">

**JQuran Java API Enhancements**

The JQuran API consisted of 13 packages, and the below three packages were updated for the enhancement.

**Package org.jqurantree.arabic:** This package includes seven classes, and we would append the characters and diacritics in relevant classes for this enhancement. 

  Class 1 (CharacterType): The updated Java code of the class is updated @ main/java/org/jqurantree/arabic/CharacterType.java 

  Class 2 (DiacriticType): The updated Java code of the class is updated @ main/java/org/jqurantree/arabic/ DiacriticType.java  

**Package org.jqurantree.arabic.encoding.Buckwalter:** This package includes three classes, and we would require updating one of them only related to the assigned characters for the transliteration.

  Class 3 (BuckwalterTable): The updated Java code of the class is updated @ main/java/org/jqurantree/arabic/encoding/buckwalter/BuckwalterTable.java

**Package org.jqurantree.arabic.encoding.unicode:** This package includes four classes, and we would update two related to the Unicode characters table and their type.

  Class 4 (UnicodeTable): The updated Java code of the class is updated @ main/java/org/jqurantree/arabic/encoding/unicode/UnicodeTable.java

  Class 5 (UnicodeType): The updated Java code of the class is updated @ main/java/org/jqurantree/arabic/encoding/unicode/ UnicodeType.java

**The Ten Corpora Application**

After developing the enhanced version of JQuran Java API, extensive conversions to Buckwalter Transliteration and vice versa were required. To ease up the work, an application was essential to be developed. Thus, an application was designed and developed for this work and has the following main features to ease up the process of the Corpus Development for a particular Riwāyah.  

•	Qur`ānic Arabic text converted to Buckwalter Transliteration.

•	Buckwalter Transliteration converted to the Qur`ānic Arabic text.

•	After the relevant conversion, the system automatically copies the result to the Clipboard, which can be pasted wherever required. 

<img width="452" alt="image" src="https://github.com/haroonlone/theTenCorpora/assets/47498442/5e0a46e4-c747-486e-9fde-6858fef46046">


