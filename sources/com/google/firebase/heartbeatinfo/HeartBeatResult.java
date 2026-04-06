package com.google.firebase.heartbeatinfo;

import java.util.List;

public abstract class HeartBeatResult {
    public static HeartBeatResult a(String str, List list) {
        return new AutoValue_HeartBeatResult(str, list);
    }

    public abstract List b();

    public abstract String c();
}
