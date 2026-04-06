package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDeepLink$getMatchingArguments$missingRequiredArguments$1 extends Lambda implements Function1<String, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Bundle f22302z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDeepLink$getMatchingArguments$missingRequiredArguments$1(Bundle bundle) {
        super(1);
        this.f22302z = bundle;
    }

    /* renamed from: b */
    public final Boolean invoke(String str) {
        Intrinsics.i(str, "argName");
        return Boolean.valueOf(!this.f22302z.containsKey(str));
    }
}
