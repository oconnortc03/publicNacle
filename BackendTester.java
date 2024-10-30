import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BackendTester{

    @Test
    public void test1() {
        System.out.println("Testing validWordCheck with valid input");
        WordChecker testChecker = new WordChecker();
        boolean expected = true;
        assertEquals(expected, testChecker.validWordCheck("acumen"));
    }

    @Test
    public void test2() {
        System.out.println("Testing validWordCheck with invalid input, not enough letters");
        WordChecker testChecker = new WordChecker();
        boolean expected = false;
        assertEquals(expected, testChecker.validWordCheck("aabab"));
    }

    @Test
    public void test3() {
        System.out.println("Testing validWordCheck with invalid input, word DNE");
        WordChecker testChecker = new WordChecker();
        boolean expected = false;
        assertEquals(expected, testChecker.validWordCheck("aabbab"));
    }

    @Test
    public void test4() {
        System.out.println("Testing validWordCheck with capital letter input");
        WordChecker testChecker = new WordChecker();
        boolean expected = true;
        assertEquals(expected, testChecker.validWordCheck("aCUmEn"));
    }

    @Test
    public void test5() {
        System.out.println("Testing colorCode with fully correct word");
        String expected = "222222";
        assertEquals(expected, WordChecker.colorCode("reflog", "reflog"));
    }

    @Test
    public void test6() {
        System.out.println("Testing colorCode with completely incorrect word");
        String expected = "000000";
        assertEquals(expected, WordChecker.colorCode("abamps", "reflog"));
    }

    @Test
    public void test7() {
        System.out.println("Testing colorCode with out of order word");
        String expected = "111111";
        assertEquals(expected, WordChecker.colorCode("golfer", "reflog"));
    }

    @Test
    public void test8() {
        System.out.println("Testing colorCode with two of the same letter");
        String expected = "200010";
        assertEquals(expected, WordChecker.colorCode("abased", "auntie"));
    }

    @Test
    public void test9() {
        System.out.println("Testing colorCode with the two of same letter first apperance out of order, second apperance in order");
        String expected = "012022";
        assertEquals(expected, WordChecker.colorCode("abased", "beaked"));
    }

    @Test
    public void test10() {
        System.out.println("Testing colorCode with more than two instances of the same letter");
        String expected = "200110";
        assertEquals(expected, WordChecker.colorCode("abased", "assess"));
    }

    @Test
    public void test11() {
        System.out.println("Testing colorCode with more than two instances of the same letter and capital letters");
        String expected = "200110";
        assertEquals(expected, WordChecker.colorCode("abased", "assess"));
    }

    @Test
    public void test12() {
        System.out.println("Testing choseAWord");
        WordChecker testChecker = new WordChecker();
        String in = testChecker.choseAWord();
        boolean expected = true;
        assertEquals(expected, testChecker.validWordCheck(in));
    }
}