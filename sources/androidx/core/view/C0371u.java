package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* renamed from: androidx.core.view.u  reason: case insensitive filesystem */
public final /* synthetic */ class C0371u implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f20431a;

    public /* synthetic */ C0371u(ViewConfiguration viewConfiguration) {
        this.f20431a = viewConfiguration;
    }

    public final Object get() {
        return Integer.valueOf(this.f20431a.getScaledMaximumFlingVelocity());
    }
}
