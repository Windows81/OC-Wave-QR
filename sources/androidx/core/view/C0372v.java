package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* renamed from: androidx.core.view.v  reason: case insensitive filesystem */
public final /* synthetic */ class C0372v implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f20432a;

    public /* synthetic */ C0372v(ViewConfiguration viewConfiguration) {
        this.f20432a = viewConfiguration;
    }

    public final Object get() {
        return Integer.valueOf(this.f20432a.getScaledMinimumFlingVelocity());
    }
}
