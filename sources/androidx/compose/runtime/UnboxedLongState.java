package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class UnboxedLongState implements LongState {

    /* renamed from: z  reason: collision with root package name */
    public final State f14924z;

    public long a() {
        return ((Number) this.f14924z.getValue()).longValue();
    }

    public String toString() {
        return "UnboxedLongState(baseState=" + this.f14924z + ")@" + hashCode();
    }

    public Long getValue() {
        return (Long) this.f14924z.getValue();
    }
}
