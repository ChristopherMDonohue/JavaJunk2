package a2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class A2Test {

    @Test
    void testIsMidSame() {
        assertEquals(true, A2.isMidSame(""));
        assertEquals(true, A2.isMidSame("$"));
        assertEquals(false, A2.isMidSame("23"));
        assertEquals(true, A2.isMidSame("44"));
        assertEquals(false, A2.isMidSame("22AB"));
        assertEquals(true, A2.isMidSame("2AAB"));
        assertEquals(true, A2.isMidSame("A22"));
        assertEquals(true, A2.isMidSame("AAA"));
        assertEquals(false, A2.isMidSame("AABC"));
        assertEquals(true, A2.isMidSame("abcdefaabcdefg"));
        assertEquals(false, A2.isMidSame("abcdef$abcdefg"));
        assertEquals(true, A2.isMidSame("aaaaaaaaaaaaaaaa"));
        assertEquals(false, A2.isMidSame("aaaaaaa$aaaaaaaa"));
        assertEquals(true, A2.isMidSame("abcdefgAAAabcdefg"));

    }

    @Test
    void testProtectLittles() {
        assertEquals("", A2.protectLittles(""));
        assertEquals("BbB", A2.protectLittles("b"));
        assertEquals("B", A2.protectLittles("B"));
        assertEquals("å", A2.protectLittles("å"));
        assertEquals("$", A2.protectLittles("$"));
        assertEquals("1AaABCDEFXxX", A2.protectLittles("1aBCDEFx"));
        assertEquals("1Z$BBbBYyY", A2.protectLittles("1Z$Bby"));
        assertEquals("QqQRrRSsSTtTUuUVvVWwWXxXYyYZzZ",
            A2.protectLittles("qrstuvwxyz"));
    }

    @Test
    void putLittlesFirst() {
        assertEquals("", A2.putLittlesFirst(""));
        assertEquals("%", A2.putLittlesFirst("%"));
        assertEquals("z", A2.putLittlesFirst("z"));
        assertEquals("A", A2.putLittlesFirst("A"));
        assertEquals("å", A2.putLittlesFirst("å"));
        assertEquals("aç", A2.putLittlesFirst("ça"));
        assertEquals("bvg", A2.putLittlesFirst("bvg"));
        assertEquals("abcdxyzABCDX$Z", A2.putLittlesFirst("aAbBcCdDxXy$zZ"));
        assertEquals("za1$àēĤƀ",
            A2.putLittlesFirst("1z$aàēĤƀ"));

    }

    @Test
    void testMoreThan1() {
        assertEquals(false, A2.moreThan1("", ""));
        assertEquals(true, A2.moreThan1("a", ""));
        assertEquals(false, A2.moreThan1("", "a"));
        assertEquals(false, A2.moreThan1("abcb", "c"));
        assertEquals(true, A2.moreThan1("acbcb", "c"));
        assertEquals(false, A2.moreThan1("abbb", "c"));
        assertEquals(false, A2.moreThan1("abbc", "ab"));
        assertEquals(true, A2.moreThan1("aaa", "a"));
        assertEquals(true, A2.moreThan1("abbbabc", "ab"));
        assertEquals(true, A2.moreThan1("what if what if what", "what"));
        assertEquals(true, A2.moreThan1("what if what if what", "what if"));
        assertEquals(true, A2.moreThan1("what if what if what", "what if what"));
        assertEquals(false, A2.moreThan1("what if what if what", "what if what if"));
    }

    @Test
    void testAreAnagrams() {
        assertEquals(true, A2.areAnagrams("", ""));
        assertEquals(true, A2.areAnagrams("noon", "noon"));
        assertEquals(true, A2.areAnagrams("mary", "army"));
        assertEquals(true, A2.areAnagrams("tom marvolo riddle", "i am lordvoldemort"));
        assertEquals(false, A2.areAnagrams("tommarvoloriddle", "i am lordvoldemort"));
        assertEquals(false, A2.areAnagrams("world", "hello"));
        assertEquals(false, A2.areAnagrams("a", "A"));
    }

    @Test
    void testIsCat() {
        // TODO Put code her to test function isCat.
    	assertEquals(true,A2.isCat("", "")); 
		assertEquals(false,A2.isCat("xxx", "")); 
		assertEquals(true,A2.isCat("x", "x"));
		assertEquals(true,A2.isCat("", "x"));
		assertEquals(true,A2.isCat("xx", "x"));
		assertEquals(false,A2.isCat("ccbbbb", "bb")); 
		assertEquals(false,A2.isCat("bbbbcc", "bb"));
		assertEquals(true,A2.isCat("bbbbbb", "bb"));
		assertEquals(true,A2.isCat("bbbbbb", "bbb")); 
		assertEquals(false,A2.isCat("bbbbbb", "bbbb"));
		assertEquals(false,A2.isCat("bbbbbb", "bbbbb"));
		assertEquals(true,A2.isCat("bbbbbb", "bbbbbb"));
		assertEquals(true,A2.isCat("bbbbbb", "bbbbbbb"));
		assertEquals(true,A2.isCat("xyzxyz", "xyz"));
		assertEquals(true,A2.isCat("xyzxyz", "xyzxyz")); 
		String s="Christopher M. Donohue";
		assertEquals(true,A2.isCat(s, s));
    }

    @Test
    void testFindShortest() {
        assertEquals("", A2.findShortest(""));
        // TODO Put code her to test function findShortest.
		assertEquals("", A2.findShortest(""));
		assertEquals(A2.findShortest("xxxxxxxxx"),"x");
		assertEquals(A2.findShortest("xyxyxyxy"),"xy");
		assertEquals(A2.findShortest("012012012012"),"012");
		assertEquals(A2.findShortest("hellohellohello"),"hello");
		assertEquals(A2.findShortest("hellohelloworld"),"hellohelloworld");
		assertEquals(A2.findShortest("hellohell"),"hellohell");


    }

}
