package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", f = "LazyLayoutScrollScope.kt", l = {177, 264}, m = "animateScrollToItem")
public final class LazyLayoutScrollScopeKt$animateScrollToItem$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public float L;
    public float M;
    public /* synthetic */ Object N;
    public int O;

    public LazyLayoutScrollScopeKt$animateScrollToItem$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.N = obj;
        this.O |= Integer.MIN_VALUE;
        return LazyLayoutScrollScopeKt.b((LazyLayoutScrollScope) null, 0, 0, 0, (Density) null, this);
    }
}
