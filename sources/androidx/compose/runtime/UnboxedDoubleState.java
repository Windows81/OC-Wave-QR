package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class UnboxedDoubleState implements DoubleState {

    /* renamed from: z  reason: collision with root package name */
    public final State f14921z;

    public double b() {
        return ((Number) this.f14921z.getValue()).doubleValue();
    }

    public String toString() {
        return "UnboxedDoubleState(baseState=" + this.f14921z + ")@" + hashCode();
    }

    public Double getValue() {
        return (Double) this.f14921z.getValue();
    }
}
