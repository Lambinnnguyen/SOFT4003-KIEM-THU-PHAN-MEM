import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_AllValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.5, 10.0)));
    }

    @Test
    public void testCalculateValidAverage_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()));
    }

    @Test
    public void testCalculateValidAverage_AllValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(9.17, analyzer.calculateValidAverage(Arrays.asList(8.5, 9.0, 10.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_OnlyInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-2.0, 11.0, null)));
    }

    // BVA: Boundary Value Analysis
    @Test
    public void testCountExcellentStudents_BoundaryEight() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(8.0, 7.9)));
    }

    @Test
    public void testCountExcellentStudents_BoundaryJustBelowEight() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(7.9)));
    }

    @Test
    public void testCountExcellentStudents_BoundaryJustAboveEight() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(8.1)));
    }

    @Test
    public void testCalculateValidAverage_BoundaryZero() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(0.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_BoundaryTen() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(10.0, analyzer.calculateValidAverage(Arrays.asList(10.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_BoundaryJustBelowZero() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(-0.1, 5.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_BoundaryJustAboveTen() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(10.1, 5.0)), 0.01);
    }

    // DT: Decision Table Testing
    @Test
    public void testCountExcellentStudents_DT_NullScore() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(null, 9.0)));
    }

    @Test
    public void testCountExcellentStudents_DT_NegativeScore() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(-1.0, 9.0)));
    }

    @Test
    public void testCountExcellentStudents_DT_OverTenScore() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(11.0, 9.0)));
    }

    @Test
    public void testCountExcellentStudents_DT_ValidNotExcellent() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(7.0, 5.0)));
    }

    @Test
    public void testCountExcellentStudents_DT_ValidExcellent() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(9.0)));
    }

    @Test
    public void testCalculateValidAverage_DT_NullScore() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(9.0, analyzer.calculateValidAverage(Arrays.asList(null, 9.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_DT_NegativeScore() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(9.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 9.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_DT_OverTenScore() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(9.0, analyzer.calculateValidAverage(Arrays.asList(11.0, 9.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_DT_ValidScore() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(7.0, analyzer.calculateValidAverage(Arrays.asList(7.0)), 0.01);
    }
}
