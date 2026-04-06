package com.google.common.collect;

@ElementTypesAreNonnullByDefault
public enum BoundType {
    OPEN(false),
    CLOSED(true);
    

    /* renamed from: z  reason: collision with root package name */
    public final boolean f28017z;

    /* access modifiers changed from: public */
    BoundType(boolean z2) {
        this.f28017z = z2;
    }

    public static BoundType f(boolean z2) {
        return z2 ? CLOSED : OPEN;
    }
}
