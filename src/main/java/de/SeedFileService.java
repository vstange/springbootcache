package de;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Simple service to load a seed string. Main method is wrapped by
 * a cache. Log message should only be displayed when item is not
 * oin cache.
 *
 * @author Vincent Stange
 */
@Service
@Slf4j
public class SeedFileService {

    @Cacheable(cacheNames = "seed.files")
    public String getSeed(String id) {
        log.info("getSeed internal called for id {}", id);
        return String.valueOf(id.hashCode());
    }

}
