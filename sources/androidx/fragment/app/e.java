package androidx.fragment.app;

import android.content.res.Configuration;
import androidx.core.util.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FragmentManager f21795z;

    public /* synthetic */ e(FragmentManager fragmentManager) {
        this.f21795z = fragmentManager;
    }

    public final void accept(Object obj) {
        this.f21795z.V0((Configuration) obj);
    }
}
