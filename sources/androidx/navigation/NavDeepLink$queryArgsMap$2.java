package androidx.navigation;

import androidx.navigation.NavDeepLink;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDeepLink$queryArgsMap$2 extends Lambda implements Function0<Map<String, NavDeepLink.ParamQuery>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f22306z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDeepLink$queryArgsMap$2(NavDeepLink navDeepLink) {
        super(0);
        this.f22306z = navDeepLink;
    }

    /* renamed from: b */
    public final Map invoke() {
        return this.f22306z.L();
    }
}
