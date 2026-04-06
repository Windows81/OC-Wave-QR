package io.realm.mongodb.sync;

public enum SubscriptionSet$State {
    UNCOMMITTED((byte) 0),
    PENDING((byte) 1),
    BOOTSTRAPPING((byte) 2),
    COMPLETE((byte) 3),
    ERROR((byte) 4),
    SUPERSEDED((byte) 5),
    AWAITING_MARK((byte) 6);
    

    /* renamed from: z  reason: collision with root package name */
    public final byte f40377z;

    /* access modifiers changed from: public */
    SubscriptionSet$State(byte b2) {
        this.f40377z = b2;
    }
}
