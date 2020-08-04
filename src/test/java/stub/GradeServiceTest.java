package stub;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    MockGradeSystem mockGradeSystem;
    GradeService gradeService;

    @BeforeEach
    void setup(){
        mockGradeSystem = new MockGradeSystem();
        gradeService = new GradeService(mockGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        assertEquals(96, gradeService.calculateAverageGrades(1));
    }
}
