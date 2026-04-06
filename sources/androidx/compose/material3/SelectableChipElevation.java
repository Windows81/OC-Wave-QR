package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class SelectableChipElevation {

    /* renamed from: a  reason: collision with root package name */
    public final float f10956a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10957b;

    /* renamed from: c  reason: collision with root package name */
    public final float f10958c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10959d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10960e;

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
        if (obj == null || !(obj instanceof SelectableChipElevation)) {
            return false;
        }
        SelectableChipElevation selectableChipElevation = (SelectableChipElevation) obj;
        return Dp.o(this.f10956a, selectableChipElevation.f10956a) && Dp.o(this.f10957b, selectableChipElevation.f10957b) && Dp.o(this.f10958c, selectableChipElevation.f10958c) && Dp.o(this.f10959d, selectableChipElevation.f10959d) && Dp.o(this.f10960e, selectableChipElevation.f10960e);
    }

    public int hashCode() {
        return (((((((Dp.p(this.f10956a) * 31) + Dp.p(this.f10957b)) * 31) + Dp.p(this.f10958c)) * 31) + Dp.p(this.f10959d)) * 31) + Dp.p(this.f10960e);
    }
}
