package androidx.activity.contextaware;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ContextAwareHelper {

    /* renamed from: a  reason: collision with root package name */
    public final Set f193a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public volatile Context f194b;

    public final void a(OnContextAvailableListener onContextAvailableListener) {
        Intrinsics.i(onContextAvailableListener, "listener");
        Context context = this.f194b;
        if (context != null) {
            onContextAvailableListener.a(context);
        }
        this.f193a.add(onContextAvailableListener);
    }

    public final void b() {
        this.f194b = null;
    }

    public final void c(Context context) {
        Intrinsics.i(context, "context");
        this.f194b = context;
        for (OnContextAvailableListener a2 : this.f193a) {
            a2.a(context);
        }
    }

    public final void d(OnContextAvailableListener onContextAvailableListener) {
        Intrinsics.i(onContextAvailableListener, "listener");
        this.f193a.remove(onContextAvailableListener);
    }
}
