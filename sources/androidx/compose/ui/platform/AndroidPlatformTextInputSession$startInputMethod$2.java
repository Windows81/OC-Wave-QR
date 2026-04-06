package androidx.compose.ui.platform;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class AndroidPlatformTextInputSession$startInputMethod$2 extends Lambda implements Function1<CoroutineScope, InputMethodSession> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AndroidPlatformTextInputSession f17629A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PlatformTextInputMethodRequest f17630z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$2(PlatformTextInputMethodRequest platformTextInputMethodRequest, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        super(1);
        this.f17630z = platformTextInputMethodRequest;
        this.f17629A = androidPlatformTextInputSession;
    }

    /* renamed from: b */
    public final InputMethodSession invoke(CoroutineScope coroutineScope) {
        PlatformTextInputMethodRequest platformTextInputMethodRequest = this.f17630z;
        final AndroidPlatformTextInputSession androidPlatformTextInputSession = this.f17629A;
        return new InputMethodSession(platformTextInputMethodRequest, new Function0<Unit>() {
            public final void invoke() {
                CoroutineScopeKt.e(androidPlatformTextInputSession.f17627B, (CancellationException) null, 1, (Object) null);
            }
        });
    }
}
