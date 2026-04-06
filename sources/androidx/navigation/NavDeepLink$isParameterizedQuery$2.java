package androidx.navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDeepLink$isParameterizedQuery$2 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f22303z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDeepLink$isParameterizedQuery$2(NavDeepLink navDeepLink) {
        super(0);
        this.f22303z = navDeepLink;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf((this.f22303z.y() == null || Uri.parse(this.f22303z.y()).getQuery() == null) ? false : true);
    }
}
