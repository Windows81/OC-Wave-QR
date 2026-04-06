package androidx.navigation;

import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavGraph$setStartDestination$2 extends Lambda implements Function1<NavDestination, String> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f22348z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraph$setStartDestination$2(Object obj) {
        super(1);
        this.f22348z = obj;
    }

    /* renamed from: b */
    public final String invoke(NavDestination navDestination) {
        Intrinsics.i(navDestination, "startDestination");
        Map o2 = navDestination.o();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.e(o2.size()));
        for (Map.Entry entry : o2.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).a());
        }
        return RouteSerializerKt.k(this.f22348z, linkedHashMap);
    }
}
