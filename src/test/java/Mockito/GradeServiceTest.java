package Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockitoSession;

class GradeServiceTest {


    GradeSystem GradeSystem;
    GradeService gradeService;

    @BeforeEach
    void setup(){
        GradeSystem = mock(GradeSystem.class);
        gradeService = new GradeService(GradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        Mockito.when(GradeSystem.gradesFor(1)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        assertEquals(90, gradeService.calculateAverageGrades(1));
    }

}