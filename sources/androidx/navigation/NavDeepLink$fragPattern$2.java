package androidx.navigation;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDeepLink$fragPattern$2 extends Lambda implements Function0<Pattern> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f22300z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDeepLink$fragPattern$2(NavDeepLink navDeepLink) {
        super(0);
        this.f22300z = navDeepLink;
    }

    /* renamed from: b */
    public final Pattern invoke() {
        String b2 = this.f22300z.n();
        if (b2 != null) {
            return Pattern.compile(b2, 2);
        }
        return null;
    }
}
