package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import kotlin.Metadata;

@Metadata
public final class PrefetchMetrics {

    /* renamed from: a  reason: collision with root package name */
    public final Averages f4983a = new Averages();

    /* renamed from: b  reason: collision with root package name */
    public final MutableScatterMap f4984b = ScatterMapKt.c();

    /* renamed from: c  reason: collision with root package name */
    public Object f4985c;

    /* renamed from: d  reason: collision with root package name */
    public Averages f4986d;

    public final Averages a(Object obj) {
        Averages averages = this.f4986d;
        if (this.f4985c == obj && averages != null) {
            return averages;
        }
        MutableScatterMap mutableScatterMap = this.f4984b;
        Object e2 = mutableScatterMap.e(obj);
        if (e2 == null) {
            e2 = this.f4983a.b();
            mutableScatterMap.x(obj, e2);
        }
        Averages averages2 = (Averages) e2;
        this.f4985c = obj;
        this.f4986d = averages2;
        return averages2;
    }

    public final long b(Object obj) {
        return a(obj).c();
    }

    public final long c(Object obj) {
        return a(obj).d();
    }

    public final void d(Object obj, long j2) {
        this.f4983a.e(j2);
        a(obj).e(j2);
    }

    public final void e(Object obj, long j2) {
        this.f4983a.f(j2);
        a(obj).f(j2);
    }
}
