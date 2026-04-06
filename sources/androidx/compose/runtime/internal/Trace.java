package androidx.compose.runtime.internal;

import kotlin.Metadata;

@Metadata
public final class Trace {

    /* renamed from: a  reason: collision with root package name */
    public static final Trace f15156a = new Trace();

    public final Object a(String str) {
        android.os.Trace.beginSection(str);
        return null;
    }

    public final void b(Object obj) {
        android.os.Trace.endSection();
    }
}
