package io.realm;

public class DefaultCompactOnLaunchCallback implements CompactOnLaunchCallback {
    public boolean shouldCompact(long j2, long j3) {
        return j2 > 52428800 && ((double) j3) / ((double) j2) < 0.5d;
    }
}
