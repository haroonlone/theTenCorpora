/* Copyright (C) Kais Dukes, 2009.
 * 
 * This file is part of JQuranTree.
 * 
 * JQuranTree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * JQuranTree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with JQuranTree. If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * This file is being updated by Haroon Lone, 2023
 * 
 * The update with enable this API word with Tanzil Project XML file Version 1.1.
 * This will also enable the characters required for the Ten Qira`at Corpus Development
 */

package org.jqurantree.arabic;

/**
 * The <code>CharacterType</code> enumeration specifies which letter or symbol
 * an {@link org.jqurantree.arabic.ArabicCharacter} has, such as <i>Alif</i> or
 * <i>Ba</i>.
 * 
 * @author Kais Dukes
 */
public enum CharacterType {

	/**
	 * Arabic letter <i>Alif</i>.
	 */
	Alif,

	/**
	 * Arabic letter <i>Ba</i>.
	 */
	Ba,

	/**
	 * Arabic letter <i>Ta</i>.
	 */
	Ta,

	/**
	 * Arabic letter <i>Tha</i>.
	 */
	Tha,

	/**
	 * Arabic letter <i>Jeem</i>.
	 */
	Jeem,

	/**
	 * Arabic letter <i>HHa</i>.
	 */
	HHa,

	/**
	 * Arabic letter <i>Kha</i>.
	 */
	Kha,

	/**
	 * Arabic letter <i>Dal</i>.
	 */
	Dal,

	/**
	 * Arabic letter <i>Thal</i>.
	 */
	Thal,

	/**
	 * Arabic letter <i>Ra</i>.
	 */
	Ra,

	/**
	 * Arabic letter <i>Zain</i>.
	 */
	Zain,

	/**
	 * Arabic letter <i>Seen</i>.
	 */
	Seen,

	/**
	 * Arabic letter <i>Sheen</i>.
	 */
	Sheen,

	/**
	 * Arabic letter <i>Sad</i>.
	 */
	Sad,

	/**
	 * Arabic letter <i>DDad</i>.
	 */
	DDad,

	/**
	 * Arabic letter <i>TTa</i>.
	 */
	TTa,

	/**
	 * Arabic letter <i>DTha</i>.
	 */
	DTha,

	/**
	 * Arabic letter <i>Ain</i>.
	 */
	Ain,

	/**
	 * Arabic letter <i>Ghain</i>.
	 */
	Ghain,

	/**
	 * Arabic letter <i>Fa</i>.
	 */
	Fa,

	/**
	 * Arabic letter <i>Qaf</i>.
	 */
	Qaf,

	/**
	 * Arabic letter <i>Kaf</i>.
	 */
	Kaf,

	/**
	 * Arabic letter <i>Lam</i>.
	 */
	Lam,

	/**
	 * Arabic letter <i>Meem</i>.
	 */
	Meem,

	/**
	 * Arabic letter <i>Noon</i>.
	 */
	Noon,

	/**
	 * Arabic letter <i>Ha</i>.
	 */
	Ha,

	/**
	 * Arabic letter <i>Waw</i>.
	 */
	Waw,

	/**
	 * Arabic letter <i>Ya</i>.
	 */
	Ya,

	/**
	 * Arabic letter <i>Hamza</i>.
	 */
	Hamza,

	/**
	 * Arabic letter <i>Alif Maksura</i>.
	 */
	AlifMaksura,

	/**
	 * Arabic letter <i>Ta Marbuta</i>.
	 */
	TaMarbuta,

	/**
	 * Orthographic symbol used to lengthen the previous letter. In Tanzil XML,
	 * a diacritic hamza may sit on a tatweel.
	 */
	Tatweel,

	/**
	 * Quranic symbol small high <i>Seen</i>.
	 */
	SmallHighSeen,

	/**
	 * Quranic symbol high rounded zero.
	 */
	SmallHighRoundedZero,

	/**
	 * Quranic symbol high upright rectangular zero.
	 */
	SmallHighUprightRectangularZero,

	/**
	 * Quranic symbol <i>Meem</i> isloated form.
	 */
	SmallHighMeemIsolatedForm,

	/**
	 * Quranic symbol small low <i>Seen</i>.
	 */
	SmallLowSeen,

	/**
	 * Quranic symbol small <i>Waw</i>.
	 */
	SmallWaw,

	/**
	 * Quranic symbol small <i>Ya</i>.
	 */
	SmallYa,
	
	/** [Haroon Lone]
	 * Quranic symbol small high<i>HighYa</i>.
	 */
	SmallHighYa,

	/**
	 * Quranic symbol small high <i>Noon</i>.
	 */
	SmallHighNoon,

	/** [Haroon Lone]
	 * Quranic symbol sajda<i>Sajda</i>.
	 */
	Sajda,

	/**
	 * Quranic symbol empty centre low stop.
	 */
	EmptyCentreLowStop,

	/**
	 * Quranic symbol empty centre high stop.
	 */
	EmptyCentreHighStop,

	/**
	 * Quranic symbol rounded high stop with filled centre.
	 */
	RoundedHighStopWithFilledCentre,

	/**
	 * Quranic symbol small low <i>Meem</i>.
	 */
	SmallLowMeem,
	
	//[Haroon Lone]
	/**
	 * character U+06D6.
	 */
	PausePermissibleContinue,
	/**
	 * character U+06D7.
	 */
	PausePermissiblePreferred,
	/**
	 * character U+06D8.
	 */
	PauseCompulsory,
	/**
	 * character U+06D9.
	 */
	PauseImpermissible,
	/**
	 * character U+06DA.
	 */
	PausePermissible,
	/**
	 * character U+06DB.
	 */
	PauseInterchangeable,
	/**
	 * character U+06DD.
	 */
	VerseEnd,
	/**
	 * character U+06DE.
	 */
	HizbRub,
	
	//[Haroon Lone] Appending the new ones with DiacriticType
	/**
	 * Unicode character U+0656.
	 */
	AlifBelow,
	/**
	 * Unicode character U+065C.
	 */
	DotBelow,
	/**
	 * Unicode character U+06E1.
	 */
	SukunKha,
	/**
	 * Unicode character U+06E4.
	 */
	MaddahHigh,
	
	/**
	 * Unicode character U+0694.
	 */
	RaDot,
	/**
	 * Unicode character U+06D5.
	 */
	HaEnd,
	/**
	 * Unicode character U+0325. --> For Taqlil
	 */
	RingBelow
	
	;

	/**
	 * Gets a character type given its ordinal value.
	 * 
	 * @param ordinal
	 *            the ordinal value of the character
	 * 
	 * @return the character type with the specified ordinal value
	 */
	public static CharacterType valueOf(int ordinal) {
		return values[ordinal];
	}

	/**
	 * An ordered array of character types.
	 */
	//[Haroon Lone] Including SmallHighYa and other characters
	public static final CharacterType[] values = { Alif, Ba, Ta, Tha, Jeem,
			HHa, Kha, Dal, Thal, Ra, Zain, Seen, Sheen, Sad, DDad, TTa, DTha,
			Ain, Ghain, Fa, Qaf, Kaf, Lam, Meem, Noon, Ha, Waw, Ya, Hamza,
			AlifMaksura, TaMarbuta, Tatweel, SmallHighSeen,
			SmallHighRoundedZero, SmallHighUprightRectangularZero,
			SmallHighMeemIsolatedForm, SmallLowSeen, SmallWaw, SmallYa,SmallHighYa,
			SmallHighNoon, Sajda, EmptyCentreLowStop, EmptyCentreHighStop,
			RoundedHighStopWithFilledCentre, SmallLowMeem,PausePermissibleContinue,
			PausePermissiblePreferred,PauseCompulsory,PauseImpermissible,PausePermissible,
			PauseInterchangeable,VerseEnd,HizbRub,AlifBelow,DotBelow,SukunKha,MaddahHigh,RaDot,HaEnd,RingBelow };
}
