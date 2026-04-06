package com.google.firebase.sessions;

import kotlin.Metadata;

@Metadata
public final class WallClock implements TimeProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final WallClock f31576a = new WallClock();

    public long a() {
        return System.currentTimeMillis() * 1000;
    }
}
