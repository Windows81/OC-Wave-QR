package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SetUserVisibleHintViolation extends Violation {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f21812A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(Fragment fragment, boolean z2) {
        super(fragment, "Attempting to set user visible hint to " + z2 + " for fragment " + fragment);
        Intrinsics.i(fragment, "fragment");
        this.f21812A = z2;
    }
}
