package androidx.fragment.app;

import android.content.res.Configuration;
import androidx.core.util.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f21792z;

    public /* synthetic */ b(FragmentActivity fragmentActivity) {
        this.f21792z = fragmentActivity;
    }

    public final void accept(Object obj) {
        this.f21792z.i0((Configuration) obj);
    }
}
