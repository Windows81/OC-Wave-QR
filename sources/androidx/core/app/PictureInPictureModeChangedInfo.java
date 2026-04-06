package androidx.core.app;

import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PictureInPictureModeChangedInfo {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19667a;

    /* renamed from: b  reason: collision with root package name */
    public Configuration f19668b;

    public PictureInPictureModeChangedInfo(boolean z2) {
        this.f19667a = z2;
    }

    public final boolean a() {
        return this.f19667a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PictureInPictureModeChangedInfo(boolean z2, Configuration configuration) {
        this(z2);
        Intrinsics.i(configuration, "newConfig");
        this.f19668b = configuration;
    }
}
