package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {136}, m = "establishTextInputSession")
public final class PlatformTextInputModifierNodeKt$establishTextInputSession$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public int D;

    public PlatformTextInputModifierNodeKt$establishTextInputSession$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.D |= Integer.MIN_VALUE;
        return PlatformTextInputModifierNodeKt.c((PlatformTextInputModifierNode) null, (Function2) null, this);
    }
}
