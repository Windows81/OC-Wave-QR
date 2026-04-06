package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", l = {3464, 3480}, m = "settleAppBar")
public final class AppBarKt$settleAppBar$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public int G;

    public AppBarKt$settleAppBar$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return AppBarKt.P((TopAppBarState) null, 0.0f, (DecayAnimationSpec) null, (AnimationSpec) null, this);
    }
}
