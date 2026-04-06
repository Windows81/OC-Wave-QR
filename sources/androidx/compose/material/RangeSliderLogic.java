package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class RangeSliderLogic {

    /* renamed from: a  reason: collision with root package name */
    public final MutableInteractionSource f8231a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableInteractionSource f8232b;

    /* renamed from: c  reason: collision with root package name */
    public final State f8233c;

    /* renamed from: d  reason: collision with root package name */
    public final State f8234d;

    /* renamed from: e  reason: collision with root package name */
    public final State f8235e;

    public RangeSliderLogic(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, State state3) {
        this.f8231a = mutableInteractionSource;
        this.f8232b = mutableInteractionSource2;
        this.f8233c = state;
        this.f8234d = state2;
        this.f8235e = state3;
    }

    public final MutableInteractionSource a(boolean z2) {
        return z2 ? this.f8231a : this.f8232b;
    }

    public final void b(boolean z2, float f2, Interaction interaction, CoroutineScope coroutineScope) {
        ((Function2) this.f8235e.getValue()).m(Boolean.valueOf(z2), Float.valueOf(f2 - ((Number) (z2 ? this.f8233c : this.f8234d).getValue()).floatValue()));
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new RangeSliderLogic$captureThumb$1(this, z2, interaction, (Continuation) null), 3, (Object) null);
    }

    public final int c(float f2) {
        return Float.compare(Math.abs(((Number) this.f8233c.getValue()).floatValue() - f2), Math.abs(((Number) this.f8234d.getValue()).floatValue() - f2));
    }
}
