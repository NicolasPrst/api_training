package fr.esiea.ex4A.api;

import fr.esiea.ex4A.api.inscription.InscriptionUserInfo;
import fr.esiea.ex4A.api.matches.MatchesUsers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class ApiController {

    @PostMapping("/api/inscription")
    void inscription(@RequestBody InscriptionUserInfo userInfo) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2l);
        System.out.println(userInfo);
    }

    @GetMapping("/api/matches")
    List<MatchesUsers> matches(){
        return List.of(
            new MatchesUsers("titi", "machin"),
            new MatchesUsers("tutu", "bidule")
        );
    }


}
