package androidx.navigation.serialization;

import androidx.navigation.NavType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RouteSerializerKt$generateRouteWithArgs$1 extends Lambda implements Function3<Integer, String, NavType<Object>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RouteBuilder f22629A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Map f22630z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteSerializerKt$generateRouteWithArgs$1(Map map, RouteBuilder routeBuilder) {
        super(3);
        this.f22630z = map;
        this.f22629A = routeBuilder;
    }

    public final void b(int i2, String str, NavType navType) {
        Intrinsics.i(str, "argName");
        Intrinsics.i(navType, "navType");
        Object obj = this.f22630z.get(str);
        Intrinsics.f(obj);
        this.f22629A.c(i2, str, navType, (List) obj);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b(((Number) obj).intValue(), (String) obj2, (NavType) obj3);
        return Unit.f40552a;
    }
}
