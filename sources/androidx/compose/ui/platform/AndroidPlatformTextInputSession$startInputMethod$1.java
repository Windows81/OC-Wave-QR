package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {71}, m = "startInputMethod")
public final class AndroidPlatformTextInputSession$startInputMethod$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ AndroidPlatformTextInputSession D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$1(AndroidPlatformTextInputSession androidPlatformTextInputSession, Continuation continuation) {
        super(continuation);
        this.D = androidPlatformTextInputSession;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.s((PlatformTextInputMethodRequest) null, this);
    }
}
