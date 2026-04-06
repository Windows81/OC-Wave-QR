package androidx.compose.material;

import androidx.compose.runtime.RecomposeScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
final class FadeInFadeOutState<T> {

    /* renamed from: a  reason: collision with root package name */
    public Object f7859a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public List f7860b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public RecomposeScope f7861c;

    public final Object a() {
        return this.f7859a;
    }

    public final List b() {
        return this.f7860b;
    }

    public final RecomposeScope c() {
        return this.f7861c;
    }

    public final void d(Object obj) {
        this.f7859a = obj;
    }

    public final void e(RecomposeScope recomposeScope) {
        this.f7861c = recomposeScope;
    }
}
