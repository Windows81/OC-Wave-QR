package androidx.fragment.app;

import android.content.Intent;
import androidx.core.util.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f21793z;

    public /* synthetic */ c(FragmentActivity fragmentActivity) {
        this.f21793z = fragmentActivity;
    }

    public final void accept(Object obj) {
        this.f21793z.j0((Intent) obj);
    }
}
