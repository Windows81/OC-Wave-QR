package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {739}, m = "textInputSession")
public final class AndroidComposeView$textInputSession$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ AndroidComposeView D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$1(AndroidComposeView androidComposeView, Continuation continuation) {
        super(continuation);
        this.D = androidComposeView;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.P((Function2) null, this);
    }
}
