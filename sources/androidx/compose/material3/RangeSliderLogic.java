package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class RangeSliderLogic {

    /* renamed from: a  reason: collision with root package name */
    public final RangeSliderState f10706a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableInteractionSource f10707b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableInteractionSource f10708c;

    public RangeSliderLogic(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2) {
        this.f10706a = rangeSliderState;
        this.f10707b = mutableInteractionSource;
        this.f10708c = mutableInteractionSource2;
    }

    public final MutableInteractionSource a(boolean z2) {
        return z2 ? this.f10707b : this.f10708c;
    }

    public final void b(boolean z2, float f2, Interaction interaction, CoroutineScope coroutineScope) {
        RangeSliderState rangeSliderState = this.f10706a;
        rangeSliderState.u(z2, f2 - (z2 ? rangeSliderState.m() : rangeSliderState.l()));
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new RangeSliderLogic$captureThumb$1(this, z2, interaction, (Continuation) null), 3, (Object) null);
    }

    public final int c(float f2) {
        return Float.compare(Math.abs(this.f10706a.m() - f2), Math.abs(this.f10706a.l() - f2));
    }
}
