package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WrongFragmentContainerViolation extends Violation {

    /* renamed from: A  reason: collision with root package name */
    public final ViewGroup f21814A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        Intrinsics.i(fragment, "fragment");
        Intrinsics.i(viewGroup, "container");
        this.f21814A = viewGroup;
    }
}
