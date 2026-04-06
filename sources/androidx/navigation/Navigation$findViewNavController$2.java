package androidx.navigation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
final class Navigation$findViewNavController$2 extends Lambda implements Function1<View, NavController> {

    /* renamed from: z  reason: collision with root package name */
    public static final Navigation$findViewNavController$2 f22425z = new Navigation$findViewNavController$2();

    public Navigation$findViewNavController$2() {
        super(1);
    }

    /* renamed from: b */
    public final NavController invoke(View view) {
        Intrinsics.i(view, "it");
        return Navigation.f22423a.b(view);
    }
}
