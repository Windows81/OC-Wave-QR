package androidx.navigation.serialization;

import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RouteSerializerKt$generateRoutePattern$2 extends Lambda implements Function3<Integer, String, NavType<Object>, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RouteBuilder f22628z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteSerializerKt$generateRoutePattern$2(RouteBuilder routeBuilder) {
        super(3);
        this.f22628z = routeBuilder;
    }

    public final void b(int i2, String str, NavType navType) {
        Intrinsics.i(str, "argName");
        Intrinsics.i(navType, "navType");
        this.f22628z.d(i2, str, navType);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b(((Number) obj).intValue(), (String) obj2, (NavType) obj3);
        return Unit.f40552a;
    }
}
