package androidx.navigation;

import androidx.navigation.NavDeepLink;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDestination$route$3 extends Lambda implements Function0<NavDeepLink> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f22332z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDestination$route$3(String str) {
        super(0);
        this.f22332z = str;
    }

    /* renamed from: b */
    public final NavDeepLink invoke() {
        return new NavDeepLink.Builder().b(this.f22332z).a();
    }
}
