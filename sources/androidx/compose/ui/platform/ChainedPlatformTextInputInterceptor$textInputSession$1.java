package androidx.compose.ui.platform;

import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {219}, m = "textInputSession")
public final class ChainedPlatformTextInputInterceptor$textInputSession$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ ChainedPlatformTextInputInterceptor D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$1(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, Continuation continuation) {
        super(continuation);
        this.D = chainedPlatformTextInputInterceptor;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.d((Owner) null, (Function2) null, this);
    }
}
