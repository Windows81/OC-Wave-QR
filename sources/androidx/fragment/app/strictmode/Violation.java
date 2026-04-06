package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class Violation extends RuntimeException {

    /* renamed from: z  reason: collision with root package name */
    public final Fragment f21813z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        Intrinsics.i(fragment, "fragment");
        this.f21813z = fragment;
    }

    public final Fragment a() {
        return this.f21813z;
    }
}
