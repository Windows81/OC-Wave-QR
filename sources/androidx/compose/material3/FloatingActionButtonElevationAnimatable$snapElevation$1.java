package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {739}, m = "snapElevation")
public final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ FloatingActionButtonElevationAnimatable D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$snapElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Continuation continuation) {
        super(continuation);
        this.D = floatingActionButtonElevationAnimatable;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.d(this);
    }
}
