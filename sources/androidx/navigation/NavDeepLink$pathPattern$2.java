package androidx.navigation;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDeepLink$pathPattern$2 extends Lambda implements Function0<Pattern> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f22305z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDeepLink$pathPattern$2(NavDeepLink navDeepLink) {
        super(0);
        this.f22305z = navDeepLink;
    }

    /* renamed from: b */
    public final Pattern invoke() {
        String d2 = this.f22305z.f22278e;
        if (d2 != null) {
            return Pattern.compile(d2, 2);
        }
        return null;
    }
}
