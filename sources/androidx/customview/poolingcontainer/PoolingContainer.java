package androidx.customview.poolingcontainer;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PoolingContainer {

    /* renamed from: a  reason: collision with root package name */
    public static final int f20484a = R.id.f20488b;

    /* renamed from: b  reason: collision with root package name */
    public static final int f20485b = R.id.f20487a;

    public static final void a(View view, PoolingContainerListener poolingContainerListener) {
        Intrinsics.i(view, "<this>");
        Intrinsics.i(poolingContainerListener, "listener");
        b(view).a(poolingContainerListener);
    }

    public static final PoolingContainerListenerHolder b(View view) {
        int i2 = f20484a;
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(i2);
        if (poolingContainerListenerHolder != null) {
            return poolingContainerListenerHolder;
        }
        PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
        view.setTag(i2, poolingContainerListenerHolder2);
        return poolingContainerListenerHolder2;
    }

    public static final boolean c(View view) {
        Intrinsics.i(view, "<this>");
        Object tag = view.getTag(f20485b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(View view) {
        Intrinsics.i(view, "<this>");
        for (ViewParent viewParent : ViewKt.a(view)) {
            if ((viewParent instanceof View) && c((View) viewParent)) {
                return true;
            }
        }
        return false;
    }

    public static final void e(View view, PoolingContainerListener poolingContainerListener) {
        Intrinsics.i(view, "<this>");
        Intrinsics.i(poolingContainerListener, "listener");
        b(view).b(poolingContainerListener);
    }
}
