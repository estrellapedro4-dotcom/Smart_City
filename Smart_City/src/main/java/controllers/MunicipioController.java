Claro. Aqui está o MunicipioController.java completo para colar integralmente:
        javapackage com.example.Smart_City.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/municipio")
public class MunicipioController {

    // GET /municipio/login → mostra LoginMunicipio.jsp
    @GetMapping("/login")
    public String loginForm() {
        return "Municipio/LoginMunicipio";
    }

    // POST /municipio/login → processa login
    @PostMapping("/login")
    public String processarLogin(@RequestParam String codigo,
                                 @RequestParam String email,
                                 @RequestParam String password,
                                 Model model) {
        // Validação real vem depois com MunicipioRepository
        return "redirect:/municipio/home";
    }

    // GET /municipio/home → HomeMunicipio.jsp
    @GetMapping("/home")
    public String home() {
        return "Municipio/HomeMunicipio";
    }

    // GET /municipio/dashboard → DashboardMunicipio.jsp
    @GetMapping("/dashboard")
    public String dashboard() {
        return "Municipio/DashboardMunicipio";
    }

    // GET /municipio/taxa → RedefinirTaxa.jsp (próximo JSP)
    @GetMapping("/taxa")
    public String taxaForm() {
        return "Municipio/RedefinirTaxa";
    }

    // POST /municipio/taxa → processa nova taxa
    @PostMapping("/taxa")
    public String processarTaxa(@RequestParam String valor,
                                Model model) {
        // Lógica de actualização via TaxaRepository vem depois
        model.addAttribute("sucesso", true);
        return "Municipio/RedefinirTaxa";
    }

    // GET /municipio/relatorios → RelatoriosMunicipio.jsp
    @GetMapping("/relatorios")
    public String relatorios() {
        return "Municipio/RelatoriosMunicipio";
    }
}