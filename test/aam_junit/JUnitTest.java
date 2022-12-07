package aam_junit;

import org.junit.Test;
import static org.junit.Assert.*;

import static javafxapplication.FXMLDocumentController.solution;

public class JUnitTest {
        
    @Test
    public void test1FXML() throws Exception {
        assertTrue(solution(0, 0, 7) == 3.00);
        assertTrue(solution(0, 0, 6) == 24.00);
    }
    
    @Test
    public void test2FXML() throws Exception {
        assertTrue("Проверка деления ", solution(2, 5, 10) == 2.95);
    }

}
