package stub;

import java.util.Arrays;
import java.util.List;

public class MockGradeSystem extends GradeSystem{
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(94.0, 94.0, 100.0);
    }
}
