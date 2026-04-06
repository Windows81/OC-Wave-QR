package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DpRect {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f19151e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final float f19152a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19153b;

    /* renamed from: c  reason: collision with root package name */
    public final float f19154c;

    /* renamed from: d  reason: collision with root package name */
    public final float f19155d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) obj;
        return Dp.o(this.f19152a, dpRect.f19152a) && Dp.o(this.f19153b, dpRect.f19153b) && Dp.o(this.f19154c, dpRect.f19154c) && Dp.o(this.f19155d, dpRect.f19155d);
    }

    public int hashCode() {
        return (((((Dp.p(this.f19152a) * 31) + Dp.p(this.f19153b)) * 31) + Dp.p(this.f19154c)) * 31) + Dp.p(this.f19155d);
    }

    public String toString() {
        return "DpRect(left=" + Dp.r(this.f19152a) + ", top=" + Dp.r(this.f19153b) + ", right=" + Dp.r(this.f19154c) + ", bottom=" + Dp.r(this.f19155d) + ')';
    }
}
