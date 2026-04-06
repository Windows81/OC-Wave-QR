package androidx.compose.material3;

import androidx.compose.runtime.RecomposeScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
final class FadeInFadeOutState<T> {

    /* renamed from: a  reason: collision with root package name */
    public Object f10010a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public List f10011b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public RecomposeScope f10012c;

    public final Object a() {
        return this.f10010a;
    }

    public final List b() {
        return this.f10011b;
    }

    public final RecomposeScope c() {
        return this.f10012c;
    }

    public final void d(Object obj) {
        this.f10010a = obj;
    }

    public final void e(RecomposeScope recomposeScope) {
        this.f10012c = recomposeScope;
    }
}
