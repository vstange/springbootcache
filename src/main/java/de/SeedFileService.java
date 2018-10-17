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

    @Cacheable(cacheNames = "seed_files")
    public String getSeed(String id) {
        int size = 50 * 1024 * 1024 + Integer.valueOf(id);
        log.info("getSeed internal called for id {}, size {}", id, size);
        return createDataSize(size);
    }

    private static String createDataSize(int msgSize) {
        StringBuilder sb = new StringBuilder(msgSize);
        for (int i = 0; i < msgSize; i++) {
            sb.append('a');
        }
        return sb.toString();
    }

}
