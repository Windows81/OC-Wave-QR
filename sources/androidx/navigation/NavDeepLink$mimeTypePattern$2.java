package androidx.navigation;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDeepLink$mimeTypePattern$2 extends Lambda implements Function0<Pattern> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f22304z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDeepLink$mimeTypePattern$2(NavDeepLink navDeepLink) {
        super(0);
        this.f22304z = navDeepLink;
    }

    /* renamed from: b */
    public final Pattern invoke() {
        String c2 = this.f22304z.f22287n;
        if (c2 != null) {
            return Pattern.compile(c2);
        }
        return null;
    }
}
