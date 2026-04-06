package androidx.navigation;

import androidx.navigation.NavArgument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@NavDestinationDsl
public final class NavArgumentBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final NavArgument.Builder f22192a = new NavArgument.Builder();

    /* renamed from: b  reason: collision with root package name */
    public NavType f22193b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22194c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22195d;

    public final NavArgument a() {
        return this.f22192a.a();
    }

    public final void b(boolean z2) {
        this.f22194c = z2;
        this.f22192a.b(z2);
    }

    public final void c(NavType navType) {
        Intrinsics.i(navType, "value");
        this.f22193b = navType;
        this.f22192a.c(navType);
    }

    public final void d(boolean z2) {
        this.f22195d = z2;
        this.f22192a.d(z2);
    }
}
