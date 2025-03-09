package pl.edu.pja.tpo6.s26822tpo6;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class PersonController {

    private final FakeDataService fakeDataService;

    public PersonController(FakeDataService fakeDataService){
        this.fakeDataService= fakeDataService;
    }

    @RequestMapping("/personGenerate")
    public String calculate(@RequestParam(required = false) Integer[] Attribute, @RequestParam(required = false,defaultValue = "en") String Lang,@RequestParam(required = false,defaultValue = "0") String Number, Model model){
        model.addAttribute("data", fakeDataService.createN(Attribute,Lang, Integer.parseInt(Number)));
        return "PersonGenerator";
    }
}