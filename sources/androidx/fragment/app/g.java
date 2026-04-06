package androidx.fragment.app;

import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.util.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FragmentManager f21797z;

    public /* synthetic */ g(FragmentManager fragmentManager) {
        this.f21797z = fragmentManager;
    }

    public final void accept(Object obj) {
        this.f21797z.X0((MultiWindowModeChangedInfo) obj);
    }
}
