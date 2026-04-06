package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ClockDialModifier extends ModifierNodeElement<ClockDialNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f9445A;

    /* renamed from: B  reason: collision with root package name */
    public final int f9446B;
    public final AnimationSpec C;

    /* renamed from: z  reason: collision with root package name */
    public final AnalogTimePickerState f9447z;

    /* renamed from: c */
    public ClockDialNode a() {
        return new ClockDialNode(this.f9447z, this.f9445A, this.f9446B, this.C, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(ClockDialNode clockDialNode) {
        clockDialNode.r3(this.f9447z, this.f9445A, this.f9446B, this.C);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return Intrinsics.d(this.f9447z, clockDialModifier.f9447z) && this.f9445A == clockDialModifier.f9445A && TimePickerSelectionMode.f(this.f9446B, clockDialModifier.f9446B) && Intrinsics.d(this.C, clockDialModifier.C);
    }

    public int hashCode() {
        return (((((this.f9447z.hashCode() * 31) + Boolean.hashCode(this.f9445A)) * 31) + TimePickerSelectionMode.g(this.f9446B)) * 31) + this.C.hashCode();
    }

    public String toString() {
        return "ClockDialModifier(state=" + this.f9447z + ", autoSwitchToMinute=" + this.f9445A + ", selection=" + TimePickerSelectionMode.h(this.f9446B) + ", animationSpec=" + this.C + ')';
    }
}
