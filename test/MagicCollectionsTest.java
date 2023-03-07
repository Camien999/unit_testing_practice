import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MagicCollectionsTest {

    MagicCollections magicCollections = new MagicCollections();

    @Test
    void getFirstElement_ofNullList() {
        assertThrows(NullPointerException.class, () -> magicCollections.getFirstElement(null));
    }

    @Test
    void getFirstElementTest() {
        List<Integer> list = new ArrayList<>(4);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer actual = magicCollections.getFirstElement(list);
        Integer expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void getEvenNumbers_hasSameSize() {
        List<Integer> actual = magicCollections.getEvenNumbers(List.of(1, 2, 3, 4, 5));
        List<Integer> expected = List.of(2, 4);
        assertEquals(expected.size(), actual.size());
    }

    @Test
    void getEvenNumbers_hasSameElements() {
        List<Integer> actual = magicCollections.getEvenNumbers(List.of(1, 2, 3, 4, 5));
        List<Integer> expected = List.of(2, 4);
        assertEquals(expected, actual);
    }

    @Test
    void getEvenNumbers_hasSameElements_withDuplicates() {
        List<Integer> actual = magicCollections.getEvenNumbers(List.of(1, 2, 3, 4, 5, 2));
        List<Integer> expected = List.of(2, 4, 2);
        assertEquals(expected.size(), actual.size());
    }

    @Test
    void getAllStartingWith_SingleCharacter() {
        List<String> actual = magicCollections.getAllStartingWith(List.of("abcd", "acdc", "adcc", "abba"), "ab");
        List<String> expected = List.of("abcd", "abba");
        assertEquals(expected, actual);
    }

    @Test
    void concatTwoListWithDifferentSizes() {
        List<Integer> actual = magicCollections.concat(List.of(1, 2, 3, 4, 5), List.of(6, 7, 8, 9, 10));
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(expected, actual);
    }

    @Test
    void numberOfDuplicatesTest() {
        Integer actual = magicCollections.numberOfDuplicates(List.of(1, 2, 2, 3, 3, 4, 5));
        Integer expected = (2);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountOccurences() {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "banana", "apple", "apple");
        Map<String, Long> expectedMap = new HashMap<>();
        expectedMap.put("apple", 3L);
        expectedMap.put("banana", 2L);
        expectedMap.put("cherry", 1L);
        Map<String, Long> outputMap = magicCollections.countOccurences(list);
        assertEquals(expectedMap, outputMap);
    }
}