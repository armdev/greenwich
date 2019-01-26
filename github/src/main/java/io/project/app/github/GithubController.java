package io.project.app.github;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/api/v2/github")
@Slf4j
public class GithubController {

    @GetMapping("/repos")
    @CrossOrigin
    public Flux<String> get() {
        return Flux.just("Flux ", " Mono ", " WebFlux ");
    }

    @GetMapping("/repos/second")
    @CrossOrigin
    public Mono<ResponseEntity<?>> load() {
        log.info("Loading Response Entity");
        return Mono.just(ResponseEntity.ok().body("Second user location here"));
    }

    @GetMapping("/repos/find/more")
    @CrossOrigin
    public ResponseEntity<Mono<?>> find() {
        log.info("2. This is a GET request from you");
        return new ResponseEntity<>(Mono.just("One User here"), HttpStatus.I_AM_A_TEAPOT);
    }

}
