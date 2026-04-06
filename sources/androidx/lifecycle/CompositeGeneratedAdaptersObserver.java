package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    /* renamed from: z  reason: collision with root package name */
    public final GeneratedAdapter[] f21873z;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        Intrinsics.i(generatedAdapterArr, "generatedAdapters");
        this.f21873z = generatedAdapterArr;
    }

    public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "source");
        Intrinsics.i(event, "event");
        MethodCallsLogger methodCallsLogger = new MethodCallsLogger();
        for (GeneratedAdapter a2 : this.f21873z) {
            a2.a(lifecycleOwner, event, false, methodCallsLogger);
        }
        for (GeneratedAdapter a3 : this.f21873z) {
            a3.a(lifecycleOwner, event, true, methodCallsLogger);
        }
    }
}
