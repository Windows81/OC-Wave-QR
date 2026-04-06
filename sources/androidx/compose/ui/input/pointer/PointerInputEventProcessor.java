package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

@Metadata
public final class PointerInputEventProcessor {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f16907a;

    /* renamed from: b  reason: collision with root package name */
    public final HitPathTracker f16908b;

    /* renamed from: c  reason: collision with root package name */
    public final PointerInputChangeEventProducer f16909c = new PointerInputChangeEventProducer();

    /* renamed from: d  reason: collision with root package name */
    public final HitTestResult f16910d = new HitTestResult();

    /* renamed from: e  reason: collision with root package name */
    public boolean f16911e;

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.f16907a = layoutNode;
        this.f16908b = new HitPathTracker(layoutNode.w());
    }

    public final void a() {
        this.f16908b.c();
    }

    public final int b(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z2) {
        boolean z3;
        if (this.f16911e) {
            return PointerInputEventProcessorKt.a(false, false);
        }
        boolean z4 = true;
        try {
            this.f16911e = true;
            InternalPointerEvent b2 = this.f16909c.b(pointerInputEvent, positionCalculator);
            int o2 = b2.b().o();
            int i2 = 0;
            while (true) {
                if (i2 >= o2) {
                    z3 = true;
                    break;
                }
                PointerInputChange pointerInputChange = (PointerInputChange) b2.b().p(i2);
                if (pointerInputChange.i()) {
                    break;
                } else if (pointerInputChange.l()) {
                    break;
                } else {
                    i2++;
                }
            }
            z3 = false;
            int o3 = b2.b().o();
            for (int i3 = 0; i3 < o3; i3++) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) b2.b().p(i3);
                if (z3 || PointerEventKt.b(pointerInputChange2)) {
                    LayoutNode.L0(this.f16907a, pointerInputChange2.h(), this.f16910d, pointerInputChange2.n(), false, 8, (Object) null);
                    if (!this.f16910d.isEmpty()) {
                        this.f16908b.b(pointerInputChange2.f(), this.f16910d, PointerEventKt.b(pointerInputChange2));
                        this.f16910d.clear();
                    }
                }
            }
            boolean d2 = this.f16908b.d(b2, z2);
            if (!b2.d()) {
                int o4 = b2.b().o();
                int i4 = 0;
                while (true) {
                    if (i4 >= o4) {
                        break;
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) b2.b().p(i4);
                    if (PointerEventKt.k(pointerInputChange3) && pointerInputChange3.p()) {
                        break;
                    }
                    i4++;
                }
            }
            z4 = false;
            int a2 = PointerInputEventProcessorKt.a(d2, z4);
            this.f16911e = false;
            return a2;
        } catch (Throwable th) {
            this.f16911e = false;
            throw th;
        }
    }

    public final void c() {
        if (!this.f16911e) {
            this.f16909c.a();
            this.f16908b.e();
        }
    }
}
