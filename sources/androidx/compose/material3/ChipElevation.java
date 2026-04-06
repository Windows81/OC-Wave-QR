package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class ChipElevation {

    /* renamed from: a  reason: collision with root package name */
    public final float f9403a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9404b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9405c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9406d;

    /* renamed from: e  reason: collision with root package name */
    public final float f9407e;

    public static final Interaction c(MutableState mutableState) {
        return (Interaction) mutableState.getValue();
    }

    public static final void d(MutableState mutableState, Interaction interaction) {
        mutableState.setValue(interaction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipElevation)) {
            return false;
        }
        ChipElevation chipElevation = (ChipElevation) obj;
        return Dp.o(this.f9403a, chipElevation.f9403a) && Dp.o(this.f9404b, chipElevation.f9404b) && Dp.o(this.f9405c, chipElevation.f9405c) && Dp.o(this.f9406d, chipElevation.f9406d) && Dp.o(this.f9407e, chipElevation.f9407e);
    }

    public int hashCode() {
        return (((((((Dp.p(this.f9403a) * 31) + Dp.p(this.f9404b)) * 31) + Dp.p(this.f9405c)) * 31) + Dp.p(this.f9406d)) * 31) + Dp.p(this.f9407e);
    }
}
