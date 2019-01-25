package io.project.app.github;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/api/v2/github")
public class GithubController {
    
    @GetMapping("/repos")
    public Flux<String> get(){
        return Flux.just("Flux ", " Mono ", " WebFlux ");
    }
    
}
