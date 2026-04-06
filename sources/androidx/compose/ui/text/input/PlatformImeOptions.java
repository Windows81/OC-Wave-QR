package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PlatformImeOptions {

    /* renamed from: a  reason: collision with root package name */
    public final String f18877a;

    public final String a() {
        return this.f18877a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlatformImeOptions) && Intrinsics.d(this.f18877a, ((PlatformImeOptions) obj).f18877a);
    }

    public int hashCode() {
        String str = this.f18877a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PlatformImeOptions(privateImeOptions=" + this.f18877a + ')';
    }
}
