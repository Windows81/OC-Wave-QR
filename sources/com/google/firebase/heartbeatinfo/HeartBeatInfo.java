package com.google.firebase.heartbeatinfo;

public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: z  reason: collision with root package name */
        public final int f30761z;

        /* access modifiers changed from: public */
        HeartBeat(int i2) {
            this.f30761z = i2;
        }
    }
}
