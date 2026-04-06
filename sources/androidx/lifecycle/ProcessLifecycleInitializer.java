package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ProcessLifecycleInitializer implements Initializer<LifecycleOwner> {
    public List a() {
        return CollectionsKt.m();
    }

    /* renamed from: c */
    public LifecycleOwner b(Context context) {
        Intrinsics.i(context, "context");
        AppInitializer e2 = AppInitializer.e(context);
        Intrinsics.h(e2, "getInstance(...)");
        if (e2.g(ProcessLifecycleInitializer.class)) {
            LifecycleDispatcher.a(context);
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.H;
            companion.b(context);
            return companion.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
