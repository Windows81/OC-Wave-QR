package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.android.HandlerDispatcherKt;

@Metadata
public final class WindowRecomposerPolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final WindowRecomposerPolicy f17932a = new WindowRecomposerPolicy();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f17933b = new AtomicReference(WindowRecomposerFactory.f17929a.c());

    /* renamed from: c  reason: collision with root package name */
    public static final int f17934c = 8;

    public final Recomposer a(View view) {
        Recomposer a2 = ((WindowRecomposerFactory) f17933b.get()).a(view);
        WindowRecomposer_androidKt.i(view, a2);
        view.addOnAttachStateChangeListener(new WindowRecomposerPolicy$createAndInstallWindowRecomposer$1(BuildersKt__Builders_commonKt.d(GlobalScope.f41412z, HandlerDispatcherKt.d(view.getHandler(), "windowRecomposer cleanup").L0(), (CoroutineStart) null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(a2, view, (Continuation) null), 2, (Object) null)));
        return a2;
    }
}
