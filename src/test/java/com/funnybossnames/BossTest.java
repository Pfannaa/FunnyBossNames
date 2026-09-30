package com.funnybossnames;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BossTest
{
	@Test
	public void matchesExactNameIgnoringCase()
	{
		assertEquals(Boss.GENERAL_GRAARDOR, Boss.fromNpcName("General Graardor"));
		assertEquals(Boss.GENERAL_GRAARDOR, Boss.fromNpcName("general graardor"));
		assertEquals(Boss.TZKAL_ZUK, Boss.fromNpcName("TzKal-Zuk"));
	}

	@Test
	public void ignoresTextThatOnlyContainsABossName()
	{
		assertNull(Boss.fromNpcName("The Final Dawn"));
		assertNull(Boss.fromNpcName("Nexling"));
		assertNull(Boss.fromNpcName(null));
	}

	@Test
	public void similarNamesResolveToTheirOwnEntry()
	{
		assertEquals(Boss.WHISPERER, Boss.fromNpcName("Whisperer"));
		assertEquals(Boss.THE_WHISPERER, Boss.fromNpcName("The Whisperer"));
	}

	@Test
	public void ignoresPets()
	{
		assertNull(Boss.fromNpcName("General Graardor Jr."));
	}
}
