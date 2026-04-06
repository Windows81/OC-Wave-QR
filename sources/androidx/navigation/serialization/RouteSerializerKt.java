package androidx.navigation.serialization;

import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata
public final class RouteSerializerKt {
    public static final void c(KSerializer kSerializer, Function0 function0) {
        if (kSerializer instanceof PolymorphicSerializer) {
            function0.invoke();
        }
    }

    public static final NavType d(SerialDescriptor serialDescriptor, Map map) {
        Object obj;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (NavTypeConverterKt.c(serialDescriptor, (KType) obj)) {
                break;
            }
        }
        KType kType = (KType) obj;
        NavType navType = kType != null ? (NavType) map.get(kType) : null;
        if (navType == null) {
            navType = null;
        }
        if (navType == null) {
            navType = NavTypeConverterKt.b(serialDescriptor);
        }
        if (Intrinsics.d(navType, UNKNOWN.f22633t)) {
            return null;
        }
        Intrinsics.g(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return navType;
    }

    public static final void e(KSerializer kSerializer, Map map, Function3 function3) {
        int f2 = kSerializer.a().f();
        int i2 = 0;
        while (i2 < f2) {
            String g2 = kSerializer.a().g(i2);
            NavType d2 = d(kSerializer.a().j(i2), map);
            if (d2 != null) {
                function3.d(Integer.valueOf(i2), g2, d2);
                i2++;
            } else {
                throw new IllegalArgumentException(m(g2, kSerializer.a().j(i2).a(), kSerializer.a().a(), map.toString()));
            }
        }
    }

    public static final void f(KSerializer kSerializer, Map map, Function3 function3) {
        int f2 = kSerializer.a().f();
        int i2 = 0;
        while (i2 < f2) {
            String g2 = kSerializer.a().g(i2);
            NavType navType = (NavType) map.get(g2);
            if (navType != null) {
                function3.d(Integer.valueOf(i2), g2, navType);
                i2++;
            } else {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + g2 + ']').toString());
            }
        }
    }

    public static final int g(KSerializer kSerializer) {
        Intrinsics.i(kSerializer, "<this>");
        int hashCode = kSerializer.a().a().hashCode();
        int f2 = kSerializer.a().f();
        for (int i2 = 0; i2 < f2; i2++) {
            hashCode = (hashCode * 31) + kSerializer.a().g(i2).hashCode();
        }
        return hashCode;
    }

    public static final List h(KSerializer kSerializer, Map map) {
        Intrinsics.i(kSerializer, "<this>");
        Intrinsics.i(map, "typeMap");
        c(kSerializer, new RouteSerializerKt$generateNavArguments$1(kSerializer));
        int f2 = kSerializer.a().f();
        ArrayList arrayList = new ArrayList(f2);
        for (int i2 = 0; i2 < f2; i2++) {
            String g2 = kSerializer.a().g(i2);
            arrayList.add(NamedNavArgumentKt.a(g2, new RouteSerializerKt$generateNavArguments$2$1(kSerializer, i2, map, g2)));
        }
        return arrayList;
    }

    public static final String i(KSerializer kSerializer, Map map, String str) {
        Intrinsics.i(kSerializer, "<this>");
        Intrinsics.i(map, "typeMap");
        c(kSerializer, new RouteSerializerKt$generateRoutePattern$1(kSerializer));
        RouteBuilder routeBuilder = str != null ? new RouteBuilder(str, kSerializer) : new RouteBuilder(kSerializer);
        e(kSerializer, map, new RouteSerializerKt$generateRoutePattern$2(routeBuilder));
        return routeBuilder.e();
    }

    public static /* synthetic */ String j(KSerializer kSerializer, Map map, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = MapsKt.h();
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return i(kSerializer, map, str);
    }

    public static final String k(Object obj, Map map) {
        Intrinsics.i(obj, "route");
        Intrinsics.i(map, "typeMap");
        KSerializer b2 = SerializersKt.b(Reflection.b(obj.getClass()));
        Map K = new RouteEncoder(b2, map).K(obj);
        RouteBuilder routeBuilder = new RouteBuilder(b2);
        f(b2, map, new RouteSerializerKt$generateRouteWithArgs$1(K, routeBuilder));
        return routeBuilder.e();
    }

    public static final boolean l(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "<this>");
        return Intrinsics.d(serialDescriptor.e(), StructureKind.CLASS.f42058a) && serialDescriptor.h() && serialDescriptor.f() == 1;
    }

    public static final String m(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }
}
