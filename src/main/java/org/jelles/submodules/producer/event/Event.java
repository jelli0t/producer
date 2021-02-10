package org.jelles.submodules.producer.event;


import lombok.RequiredArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@RequiredArgsConstructor
public class Event {

    private final UUID uuid;
    private final String name;
    private final Instant createdOn;
}
