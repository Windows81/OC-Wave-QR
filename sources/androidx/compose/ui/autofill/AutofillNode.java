package androidx.compose.ui.autofill;

import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Deprecated
public final class AutofillNode {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f15580d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f15581e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final Object f15582f;

    /* renamed from: a  reason: collision with root package name */
    public final List f15583a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f15584b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f15585c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion((DefaultConstructorMarker) null);
        f15580d = companion;
        f15582f = companion;
    }

    public final List a() {
        return this.f15583a;
    }

    public final Rect b() {
        return this.f15584b;
    }

    public final Function1 c() {
        return this.f15585c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        return Intrinsics.d(this.f15583a, autofillNode.f15583a) && Intrinsics.d(this.f15584b, autofillNode.f15584b) && this.f15585c == autofillNode.f15585c;
    }

    public int hashCode() {
        int hashCode = this.f15583a.hashCode() * 31;
        Rect rect = this.f15584b;
        int i2 = 0;
        int hashCode2 = (hashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        Function1 function1 = this.f15585c;
        if (function1 != null) {
            i2 = function1.hashCode();
        }
        return hashCode2 + i2;
    }
}
