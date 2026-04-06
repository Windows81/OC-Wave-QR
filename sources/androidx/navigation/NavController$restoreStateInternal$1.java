package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavController$restoreStateInternal$1 extends Lambda implements Function1<String, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f22262z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$restoreStateInternal$1(String str) {
        super(1);
        this.f22262z = str;
    }

    /* renamed from: b */
    public final Boolean invoke(String str) {
        return Boolean.valueOf(Intrinsics.d(str, this.f22262z));
    }
}
