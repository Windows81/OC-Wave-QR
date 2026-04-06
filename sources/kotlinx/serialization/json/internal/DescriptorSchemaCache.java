package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class DescriptorSchemaCache {

    /* renamed from: a  reason: collision with root package name */
    public final Map f42377a = CreateMapForCacheKt.a(16);

    @Metadata
    public static final class Key<T> {
    }

    public final Object a(SerialDescriptor serialDescriptor, Key key) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(key, "key");
        Map map = (Map) this.f42377a.get(serialDescriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(SerialDescriptor serialDescriptor, Key key, Function0 function0) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(key, "key");
        Intrinsics.i(function0, "defaultValue");
        Object a2 = a(serialDescriptor, key);
        if (a2 != null) {
            return a2;
        }
        Object invoke = function0.invoke();
        c(serialDescriptor, key, invoke);
        return invoke;
    }

    public final void c(SerialDescriptor serialDescriptor, Key key, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(key, "key");
        Intrinsics.i(obj, "value");
        Map map = this.f42377a;
        Object obj2 = map.get(serialDescriptor);
        if (obj2 == null) {
            obj2 = CreateMapForCacheKt.a(2);
            map.put(serialDescriptor, obj2);
        }
        ((Map) obj2).put(key, obj);
    }
}
