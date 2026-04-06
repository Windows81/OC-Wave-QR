package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.Metadata;

@Metadata
final class BundleApi21ImplKt {

    /* renamed from: a  reason: collision with root package name */
    public static final BundleApi21ImplKt f19949a = new BundleApi21ImplKt();

    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
