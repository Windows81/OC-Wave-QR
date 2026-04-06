package androidx.compose.material3.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class DraggableAnchorsConfig<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Map f12217a = new LinkedHashMap();

    public final void a(Object obj, float f2) {
        this.f12217a.put(obj, Float.valueOf(f2));
    }

    public final Map b() {
        return this.f12217a;
    }
}
