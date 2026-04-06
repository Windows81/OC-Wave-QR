package androidx.compose.material;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Map f7936a;

    public MapDraggableAnchors(Map map) {
        this.f7936a = map;
    }

    public Object a(float f2, boolean z2) {
        Object obj;
        Iterator it = this.f7936a.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) obj).getValue()).floatValue();
                float f3 = z2 ? floatValue - f2 : f2 - floatValue;
                if (f3 < 0.0f) {
                    f3 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    float f4 = z2 ? floatValue2 - f2 : f2 - floatValue2;
                    if (f4 < 0.0f) {
                        f4 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f3, f4) > 0) {
                        obj = next;
                        f3 = f4;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public Object b(float f2) {
        Object obj;
        Iterator it = this.f7936a.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f2 - ((Number) ((Map.Entry) obj).getValue()).floatValue());
                do {
                    Object next = it.next();
                    float abs2 = Math.abs(f2 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        obj = next;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public float c(Object obj) {
        Float f2 = (Float) this.f7936a.get(obj);
        if (f2 != null) {
            return f2.floatValue();
        }
        return Float.NaN;
    }

    public float d() {
        Float u0 = CollectionsKt.u0(this.f7936a.values());
        if (u0 != null) {
            return u0.floatValue();
        }
        return Float.NaN;
    }

    public int e() {
        return this.f7936a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapDraggableAnchors)) {
            return false;
        }
        return Intrinsics.d(this.f7936a, ((MapDraggableAnchors) obj).f7936a);
    }

    public boolean f(Object obj) {
        return this.f7936a.containsKey(obj);
    }

    public float g() {
        Float s0 = CollectionsKt.s0(this.f7936a.values());
        if (s0 != null) {
            return s0.floatValue();
        }
        return Float.NaN;
    }

    public int hashCode() {
        return this.f7936a.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.f7936a + ')';
    }
}
