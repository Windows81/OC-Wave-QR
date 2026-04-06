package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {

    /* renamed from: z  reason: collision with root package name */
    public final GeneratedAdapter f21984z;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        Intrinsics.i(generatedAdapter, "generatedAdapter");
        this.f21984z = generatedAdapter;
    }

    public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "source");
        Intrinsics.i(event, "event");
        this.f21984z.a(lifecycleOwner, event, false, (MethodCallsLogger) null);
        this.f21984z.a(lifecycleOwner, event, true, (MethodCallsLogger) null);
    }
}
