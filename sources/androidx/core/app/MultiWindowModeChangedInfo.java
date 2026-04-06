package androidx.core.app;

import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MultiWindowModeChangedInfo {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19512a;

    /* renamed from: b  reason: collision with root package name */
    public Configuration f19513b;

    public MultiWindowModeChangedInfo(boolean z2) {
        this.f19512a = z2;
    }

    public final boolean a() {
        return this.f19512a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiWindowModeChangedInfo(boolean z2, Configuration configuration) {
        this(z2);
        Intrinsics.i(configuration, "newConfig");
        this.f19513b = configuration;
    }
}
