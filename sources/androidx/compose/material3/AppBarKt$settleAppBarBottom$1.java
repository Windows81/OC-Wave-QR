package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", l = {2424, 2440}, m = "settleAppBarBottom")
public final class AppBarKt$settleAppBarBottom$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public int G;

    public AppBarKt$settleAppBarBottom$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return AppBarKt.S((BottomAppBarState) null, 0.0f, (DecayAnimationSpec) null, (AnimationSpec) null, this);
    }
}
