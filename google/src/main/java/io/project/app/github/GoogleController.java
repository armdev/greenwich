package io.project.app.github;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/api/v2/google")
@Slf4j
public class GoogleController {

    @GetMapping("/search")
    @CrossOrigin
    public ResponseEntity<?> load() {
        log.info("Loading Response Entity");
        return ResponseEntity.ok().body("Hello From Servlet application");
    }

 

}
