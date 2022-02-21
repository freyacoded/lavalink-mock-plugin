package org.example.plugin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MockPlugin {

    private static final Logger log = LoggerFactory.getLogger(MockPlugin.class);

    public SampleEventHandler() {
        log.info("Hello, world!");
    }

}
