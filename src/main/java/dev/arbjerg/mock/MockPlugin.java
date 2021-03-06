package dev.arbjerg.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MockPlugin {

    private static final Logger log = LoggerFactory.getLogger(MockPlugin.class);

    public MockPlugin() {
        log.info("Hello, world!");
    }

}
