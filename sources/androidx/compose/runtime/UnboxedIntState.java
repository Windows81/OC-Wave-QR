package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class UnboxedIntState implements IntState {

    /* renamed from: z  reason: collision with root package name */
    public final State f14923z;

    public int e() {
        return ((Number) this.f14923z.getValue()).intValue();
    }

    public String toString() {
        return "UnboxedIntState(baseState=" + this.f14923z + ")@" + hashCode();
    }

    public Integer getValue() {
        return (Integer) this.f14923z.getValue();
    }
}
