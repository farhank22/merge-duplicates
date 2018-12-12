package merge;

import org.springframework.web.bind.annotation.*;

@RestController
public class MergeController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "welcome to merge duplicates";
    }

    @PostMapping("/merge")
    public MergeRequest newEmployee(@RequestBody MergeRequest mergeRequest) {
        return mergeRequest;
    }
}

