package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.core.viewtree.ViewTree;
import androidx.lifecycle.runtime.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner a(View view) {
        Intrinsics.i(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.f22054a);
            LifecycleOwner lifecycleOwner = tag instanceof LifecycleOwner ? (LifecycleOwner) tag : null;
            if (lifecycleOwner != null) {
                return lifecycleOwner;
            }
            ViewParent a2 = ViewTree.a(view);
            view = a2 instanceof View ? (View) a2 : null;
        }
        return null;
    }

    public static final void b(View view, LifecycleOwner lifecycleOwner) {
        Intrinsics.i(view, "<this>");
        view.setTag(R.id.f22054a, lifecycleOwner);
    }
}
