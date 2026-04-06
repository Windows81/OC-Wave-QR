package androidx.compose.ui.platform;

import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {184, 186}, m = "interceptedTextInputSession")
public final class PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public int D;

    public PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.D |= Integer.MIN_VALUE;
        return PlatformTextInputModifierNodeKt.d((Owner) null, (ChainedPlatformTextInputInterceptor) null, (Function2) null, this);
    }
}
