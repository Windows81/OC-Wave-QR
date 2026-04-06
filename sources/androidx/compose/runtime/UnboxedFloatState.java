package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class UnboxedFloatState implements FloatState {

    /* renamed from: z  reason: collision with root package name */
    public final State f14922z;

    public float c() {
        return ((Number) this.f14922z.getValue()).floatValue();
    }

    public String toString() {
        return "UnboxedFloatState(baseState=" + this.f14922z + ")@" + hashCode();
    }

    public Float getValue() {
        return (Float) this.f14922z.getValue();
    }
}
