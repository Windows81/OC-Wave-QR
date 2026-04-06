package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDestination$hasRequiredArguments$missingRequiredArguments$1 extends Lambda implements Function1<String, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Bundle f22331z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDestination$hasRequiredArguments$missingRequiredArguments$1(Bundle bundle) {
        super(1);
        this.f22331z = bundle;
    }

    /* renamed from: b */
    public final Boolean invoke(String str) {
        Intrinsics.i(str, "key");
        return Boolean.valueOf(!this.f22331z.containsKey(str));
    }
}
