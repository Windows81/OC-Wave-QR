package androidx.navigation.serialization;

import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata
public final class RouteEncoder<T> extends AbstractEncoder {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f22618a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f22619b;

    /* renamed from: c  reason: collision with root package name */
    public final SerializersModule f22620c = SerializersModuleBuildersKt.a();

    /* renamed from: d  reason: collision with root package name */
    public final Map f22621d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public int f22622e = -1;

    public RouteEncoder(KSerializer kSerializer, Map map) {
        Intrinsics.i(kSerializer, "serializer");
        Intrinsics.i(map, "typeMap");
        this.f22618a = kSerializer;
        this.f22619b = map;
    }

    public boolean H(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        this.f22622e = i2;
        return true;
    }

    public void J(Object obj) {
        Intrinsics.i(obj, "value");
        L(obj);
    }

    public final Map K(Object obj) {
        Intrinsics.i(obj, "value");
        super.e(this.f22618a, obj);
        return MapsKt.s(this.f22621d);
    }

    public final void L(Object obj) {
        String g2 = this.f22618a.a().g(this.f22622e);
        NavType navType = (NavType) this.f22619b.get(g2);
        if (navType != null) {
            this.f22621d.put(g2, navType instanceof CollectionNavType ? ((CollectionNavType) navType).l(obj) : CollectionsKt.e(navType.i(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + g2 + ". Please provide NavType through typeMap.").toString());
    }

    public SerializersModule a() {
        return this.f22620c;
    }

    public void e(SerializationStrategy serializationStrategy, Object obj) {
        Intrinsics.i(serializationStrategy, "serializer");
        L(obj);
    }

    public void f() {
        L((Object) null);
    }

    public Encoder z(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        if (RouteSerializerKt.l(serialDescriptor)) {
            this.f22622e = 0;
        }
        return super.z(serialDescriptor);
    }
}
