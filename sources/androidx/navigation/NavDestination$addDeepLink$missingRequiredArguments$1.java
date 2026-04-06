package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDestination$addDeepLink$missingRequiredArguments$1 extends Lambda implements Function1<String, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f22330z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDestination$addDeepLink$missingRequiredArguments$1(NavDeepLink navDeepLink) {
        super(1);
        this.f22330z = navDeepLink;
    }

    /* renamed from: b */
    public final Boolean invoke(String str) {
        Intrinsics.i(str, "key");
        return Boolean.valueOf(!this.f22330z.j().contains(str));
    }
}
