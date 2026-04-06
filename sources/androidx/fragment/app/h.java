package androidx.fragment.app;

import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.util.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FragmentManager f21798z;

    public /* synthetic */ h(FragmentManager fragmentManager) {
        this.f21798z = fragmentManager;
    }

    public final void accept(Object obj) {
        this.f21798z.Y0((PictureInPictureModeChangedInfo) obj);
    }
}
