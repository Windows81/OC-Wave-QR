package androidx.navigation;

import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@NavDestinationDsl
public class NavDestinationBuilder<D extends NavDestination> {

    /* renamed from: a  reason: collision with root package name */
    public final Navigator f22334a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22335b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22336c;

    /* renamed from: d  reason: collision with root package name */
    public Map f22337d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f22338e;

    /* renamed from: f  reason: collision with root package name */
    public Map f22339f;

    /* renamed from: g  reason: collision with root package name */
    public List f22340g;

    /* renamed from: h  reason: collision with root package name */
    public Map f22341h;

    public NavDestinationBuilder(Navigator navigator, int i2, String str) {
        Intrinsics.i(navigator, "navigator");
        this.f22334a = navigator;
        this.f22335b = i2;
        this.f22336c = str;
        this.f22339f = new LinkedHashMap();
        this.f22340g = new ArrayList();
        this.f22341h = new LinkedHashMap();
    }

    public NavDestination a() {
        NavDestination d2 = d();
        d2.F(this.f22338e);
        for (Map.Entry entry : this.f22339f.entrySet()) {
            d2.g((String) entry.getKey(), (NavArgument) entry.getValue());
        }
        for (NavDeepLink h2 : this.f22340g) {
            d2.h(h2);
        }
        for (Map.Entry entry2 : this.f22341h.entrySet()) {
            d2.D(((Number) entry2.getKey()).intValue(), (NavAction) entry2.getValue());
        }
        String str = this.f22336c;
        if (str != null) {
            d2.K(str);
        }
        int i2 = this.f22335b;
        if (i2 != -1) {
            d2.E(i2);
        }
        return d2;
    }

    public final void b(NavDeepLink navDeepLink) {
        Intrinsics.i(navDeepLink, "navDeepLink");
        this.f22340g.add(navDeepLink);
    }

    public final String c() {
        return this.f22336c;
    }

    public NavDestination d() {
        return this.f22334a.a();
    }

    public final void e(CharSequence charSequence) {
        this.f22338e = charSequence;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator navigator, String str) {
        this(navigator, -1, str);
        Intrinsics.i(navigator, "navigator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = kotlinx.serialization.SerializersKt.b(r6);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavDestinationBuilder(androidx.navigation.Navigator r5, kotlin.reflect.KClass r6, java.util.Map r7) {
        /*
            r4 = this;
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            java.lang.String r0 = "typeMap"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            if (r6 == 0) goto L_0x0017
            kotlinx.serialization.KSerializer r0 = kotlinx.serialization.SerializersKt.b(r6)
            if (r0 == 0) goto L_0x0017
            int r0 = androidx.navigation.serialization.RouteSerializerKt.g(r0)
            goto L_0x0018
        L_0x0017:
            r0 = -1
        L_0x0018:
            r1 = 0
            if (r6 == 0) goto L_0x0026
            kotlinx.serialization.KSerializer r2 = kotlinx.serialization.SerializersKt.b(r6)
            if (r2 == 0) goto L_0x0026
            r3 = 2
            java.lang.String r1 = androidx.navigation.serialization.RouteSerializerKt.j(r2, r7, r1, r3, r1)
        L_0x0026:
            r4.<init>((androidx.navigation.Navigator) r5, (int) r0, (java.lang.String) r1)
            if (r6 == 0) goto L_0x0053
            kotlinx.serialization.KSerializer r5 = kotlinx.serialization.SerializersKt.b(r6)
            java.util.List r5 = androidx.navigation.serialization.RouteSerializerKt.h(r5, r7)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0039:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0053
            java.lang.Object r6 = r5.next()
            androidx.navigation.NamedNavArgument r6 = (androidx.navigation.NamedNavArgument) r6
            java.util.Map r0 = r4.f22339f
            java.lang.String r1 = r6.b()
            androidx.navigation.NavArgument r6 = r6.a()
            r0.put(r1, r6)
            goto L_0x0039
        L_0x0053:
            r4.f22337d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestinationBuilder.<init>(androidx.navigation.Navigator, kotlin.reflect.KClass, java.util.Map):void");
    }
}
