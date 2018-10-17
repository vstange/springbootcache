package de;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple Controller to load a seed string.
 *
 * @author Vincent Stange
 */
@RestController
@Slf4j
public class SeedFileController {

    private final SeedFileService seedFileService;

    @Autowired
    public SeedFileController(SeedFileService seedFileService) {
        this.seedFileService = seedFileService;
    }

    @GetMapping("seed/{id}")
    public String getSeed(@PathVariable("id") String id) {
        log.info("getSeed called for id {}", id);
        String seed = seedFileService.getSeed(id);
        log.info("getSeed called for id {}, size {}", id, seed.getBytes().length);
        return String.valueOf(seed.getBytes().length);
    }
}
