# theTenCorpora
An application for converting the Ten Qira`at Arabic Text to Buckwalter Transliteration.

**JQuran Java API Limitations**
The Qur’anic text used by JQuran from the XML file of the Tanzil Project 1.1 got released on February 12, 2021, with corrections and enhancements. There were orthographic marks that JQuran API did not handle for this latest release. Consequently, the available JQuran API could not handle the Arabic Text conversion to Buckwalter transliteration for the below scenarios.

•	Pause marks (ۖ ۗ ۘ ۙ ۚ ۛ)

•	Sajdah signs (۩)

•	Rub’ al-Ḥizb  signs (۞) and verse end signs (۝)

•	Taṭwīl below superscript alif (like in الرَّحْمَـٰن)

•	Small high ya (ۧ) as superscript (like in إِبْرَٰهِـۧمَ) (Tanzil, 2021)

Additionally, there was a requirement to allocate special symbols related to the Ten Qira`at Corpus development with scenarios like words having Taqlīl and Tashīl. 

So, there was a need to update the API to handle these enhancements and enrich it for the special symbols that would be used in the Qira`āt difference presentation. To achieve this, there was a need to introduce new characters in the existing list of Buckwalter Transliteration. Thus, we listed all symbols, small and capital letters, and their status of being used or free in the Buckwalter Transliteration. Then, all Arabic Unicode letters were listed, and the relevant ones were chosen for consideration. (Unicode, 2021) Finally, specific Buckwalter ASCII characters were assigned for the new Unicode handling, and JQuran Java API will be updated accordingly. The newly included symbols are listed in Table below. 

  **Table Buckwalter Enhancements Characters**

<img width="468" alt="image" src="https://github.com/haroonlone/theTenCorpora/assets/47498442/c428dcf5-1f57-4d29-a826-f8d486f7b2fb">

**JQuran Java API Enhancements**

The JQuran API consisted of 13 packages, and the below three packages were updated for the enhancement.

**Package org.jqurantree.arabic:** This package includes seven classes, and we would append the characters and diacritics in relevant classes for this enhancement. 

  **Class 1 (CharacterType):** The updated Java code of the class is updated @ main/java/org/jqurantree/arabic/CharacterType.java 

  **Class 2 (DiacriticType):** The updated Java code of the class is updated @ main/java/org/jqurantree/arabic/ DiacriticType.java  

**Package org.jqurantree.arabic.encoding.Buckwalter:** This package includes three classes, and we would require updating one of them only related to the assigned characters for the transliteration.

  **Class 3 (BuckwalterTable):** The updated Java code of the class is updated @ main/java/org/jqurantree/arabic/encoding/buckwalter/BuckwalterTable.java

**Package org.jqurantree.arabic.encoding.unicode:** This package includes four classes, and we would update two related to the Unicode characters table and their type.

  **Class 4 (UnicodeTable):** The updated Java code of the class is updated @ main/java/org/jqurantree/arabic/encoding/unicode/UnicodeTable.java

  **Class 5 (UnicodeType):** The updated Java code of the class is updated @ main/java/org/jqurantree/arabic/encoding/unicode/ UnicodeType.java

**The Ten Corpora Application**
After developing the enhanced version of JQuran Java API, extensive conversions to Buckwalter Transliteration and vice versa were required. To ease up the work, an application was essential to be developed. Thus, an application was designed and developed for this working in Java and having the following main features to ease up the process of the Corpus Development for a particular Riwāyah.  

•	Qur`ānic Arabic text could be converted to Buckwalter Transliteration.

•	Buckwalter Transliteration could be converted back to the Qur`ānic Arabic text.

•	After the relevant conversion, the system needs to copy the result to the Clipboard automatically to be pasted where ever required. 
