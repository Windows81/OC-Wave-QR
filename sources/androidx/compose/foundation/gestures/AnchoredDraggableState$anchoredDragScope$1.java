package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {

    /* renamed from: a  reason: collision with root package name */
    public Object f3384a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3385b;

    /* renamed from: c  reason: collision with root package name */
    public float f3386c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3387d;

    public AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState anchoredDraggableState) {
        this.f3387d = anchoredDraggableState;
    }

    public void a(float f2, float f3) {
        float r2 = this.f3387d.r();
        this.f3387d.G(f2);
        this.f3387d.F(f3);
        if (!Float.isNaN(r2)) {
            d(f2 >= r2);
        }
    }

    public final void c(boolean z2) {
        if (this.f3387d.r() == this.f3387d.l().c(this.f3387d.n())) {
            Object a2 = this.f3387d.l().a(this.f3387d.r() + (z2 ? 1.0f : -1.0f), z2);
            if (a2 == null) {
                a2 = this.f3387d.n();
            }
            if (z2) {
                this.f3384a = this.f3387d.n();
                this.f3385b = a2;
            } else {
                this.f3384a = a2;
                this.f3385b = this.f3387d.n();
            }
        } else {
            Object a3 = this.f3387d.l().a(this.f3387d.r(), false);
            if (a3 == null) {
                a3 = this.f3387d.n();
            }
            Object a4 = this.f3387d.l().a(this.f3387d.r(), true);
            if (a4 == null) {
                a4 = this.f3387d.n();
            }
            this.f3384a = a3;
            this.f3385b = a4;
        }
        DraggableAnchors l2 = this.f3387d.l();
        Object obj = this.f3384a;
        Intrinsics.f(obj);
        float c2 = l2.c(obj);
        DraggableAnchors l3 = this.f3387d.l();
        Object obj2 = this.f3385b;
        Intrinsics.f(obj2);
        this.f3386c = Math.abs(c2 - l3.c(obj2));
    }

    public final void d(boolean z2) {
        c(z2);
        if (Math.abs(this.f3387d.r() - this.f3387d.l().c(this.f3387d.n())) >= this.f3386c / 2.0f) {
            Object obj = z2 ? this.f3385b : this.f3384a;
            if (obj == null) {
                obj = this.f3387d.n();
            }
            if (((Boolean) this.f3387d.m().invoke(obj)).booleanValue()) {
                this.f3387d.C(obj);
            }
        }
    }
}
