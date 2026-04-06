package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FragmentReuseViolation extends Violation {

    /* renamed from: A  reason: collision with root package name */
    public final String f21800A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        Intrinsics.i(fragment, "fragment");
        Intrinsics.i(str, "previousFragmentId");
        this.f21800A = str;
    }
}
