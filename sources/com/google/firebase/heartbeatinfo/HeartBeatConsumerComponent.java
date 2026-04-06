package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

public class HeartBeatConsumerComponent {
    public static Component a() {
        return Component.l(new HeartBeatConsumer() {
        }, HeartBeatConsumer.class);
    }
}
