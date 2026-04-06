package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NamedNavArgument {

    /* renamed from: a  reason: collision with root package name */
    public final String f22172a;

    /* renamed from: b  reason: collision with root package name */
    public final NavArgument f22173b;

    public NamedNavArgument(String str, NavArgument navArgument) {
        Intrinsics.i(str, "name");
        Intrinsics.i(navArgument, "argument");
        this.f22172a = str;
        this.f22173b = navArgument;
    }

    public final NavArgument a() {
        return this.f22173b;
    }

    public final String b() {
        return this.f22172a;
    }
}
