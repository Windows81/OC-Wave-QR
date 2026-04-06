package androidx.navigation;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDeepLink$fragRegex$2 extends Lambda implements Function0<String> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f22301z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDeepLink$fragRegex$2(NavDeepLink navDeepLink) {
        super(0);
        this.f22301z = navDeepLink;
    }

    public final String invoke() {
        Pair a2 = this.f22301z.l();
        if (a2 != null) {
            return (String) a2.f();
        }
        return null;
    }
}
