package androidx.navigation;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
final class Navigation$findViewNavController$1 extends Lambda implements Function1<View, View> {

    /* renamed from: z  reason: collision with root package name */
    public static final Navigation$findViewNavController$1 f22424z = new Navigation$findViewNavController$1();

    public Navigation$findViewNavController$1() {
        super(1);
    }

    /* renamed from: b */
    public final View invoke(View view) {
        Intrinsics.i(view, "it");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
