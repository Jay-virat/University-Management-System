package university.management.system;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {

    private List<Faculty> facultyList = new ArrayList<>();

    @GetMapping
    public List<Faculty> getAllFaculty() {
        return facultyList;
    }

    @PostMapping
    public String addFaculty(@RequestBody Faculty faculty) {
        facultyList.add(faculty);
        return "Faculty added!";
    }
}
