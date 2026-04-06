package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AndroidUiDispatcher$Companion$currentThread$1 extends ThreadLocal<CoroutineContext> {
    /* renamed from: a */
    public CoroutineContext initialValue() {
        Choreographer instance = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(instance, HandlerCompat.a(myLooper), (DefaultConstructorMarker) null);
            return androidUiDispatcher.y(androidUiDispatcher.w1());
        }
        throw new IllegalStateException("no Looper on this thread");
    }
}
