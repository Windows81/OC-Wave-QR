package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class NavGraphNavigator$navigate$missingRequiredArgs$1 extends Lambda implements Function1<String, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f22357z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphNavigator$navigate$missingRequiredArgs$1(Ref.ObjectRef objectRef) {
        super(1);
        this.f22357z = objectRef;
    }

    /* renamed from: b */
    public final Boolean invoke(String str) {
        Intrinsics.i(str, "key");
        Object obj = this.f22357z.f40908z;
        boolean z2 = true;
        if (obj != null && ((Bundle) obj).containsKey(str)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
