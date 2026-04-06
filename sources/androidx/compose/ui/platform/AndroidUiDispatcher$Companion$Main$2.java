package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata
public final class AndroidUiDispatcher$Companion$Main$2 extends Lambda implements Function0<CoroutineContext> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidUiDispatcher$Companion$Main$2 f17640z = new AndroidUiDispatcher$Companion$Main$2();

    public AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    /* renamed from: b */
    public final CoroutineContext invoke() {
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(AndroidUiDispatcher_androidKt.b() ? Choreographer.getInstance() : (Choreographer) BuildersKt.e(Dispatchers.c(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1((Continuation) null)), HandlerCompat.a(Looper.getMainLooper()), (DefaultConstructorMarker) null);
        return androidUiDispatcher.y(androidUiDispatcher.w1());
    }
}
