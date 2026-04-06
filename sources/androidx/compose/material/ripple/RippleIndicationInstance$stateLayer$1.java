package androidx.compose.material.ripple;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RippleIndicationInstance$stateLayer$1 extends Lambda implements Function0<RippleAlpha> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f9085z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleIndicationInstance$stateLayer$1(State state) {
        super(0);
        this.f9085z = state;
    }

    /* renamed from: b */
    public final RippleAlpha invoke() {
        return (RippleAlpha) this.f9085z.getValue();
    }
}
