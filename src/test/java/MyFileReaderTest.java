package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class MyFileReaderTest {
    @Test
    public void testFileContainsString() {
        MyFileReader fileReader = new MyFileReader();
        String filePath = "sample.txt"; // Adjust the path if needed
        String targetString = "abc";
        boolean result = fileReader.doesFileContainString(filePath, targetString);
        assertTrue(result);
    }
    @Test
    @Disabled
    public void sampleFail() {
        fail("sample");
    }
}
