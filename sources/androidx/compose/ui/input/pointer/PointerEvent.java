package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class PointerEvent {

    /* renamed from: a  reason: collision with root package name */
    public final List f16844a;

    /* renamed from: b  reason: collision with root package name */
    public final InternalPointerEvent f16845b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16846c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16847d;

    /* renamed from: e  reason: collision with root package name */
    public int f16848e;

    public PointerEvent(List list, InternalPointerEvent internalPointerEvent) {
        this.f16844a = list;
        this.f16845b = internalPointerEvent;
        MotionEvent g2 = g();
        int i2 = 0;
        this.f16846c = PointerButtons.a(g2 != null ? g2.getButtonState() : 0);
        MotionEvent g3 = g();
        this.f16847d = PointerKeyboardModifiers.b(g3 != null ? g3.getMetaState() : i2);
        this.f16848e = a();
    }

    public final int a() {
        MotionEvent g2 = g();
        if (g2 != null) {
            int actionMasked = g2.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return PointerEventType.f16852b.f();
                            case 9:
                                return PointerEventType.f16852b.a();
                            case 10:
                                return PointerEventType.f16852b.b();
                            default:
                                return PointerEventType.f16852b.g();
                        }
                    }
                    return PointerEventType.f16852b.c();
                }
                return PointerEventType.f16852b.e();
            }
            return PointerEventType.f16852b.d();
        }
        List list = this.f16844a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
            if (PointerEventKt.d(pointerInputChange)) {
                return PointerEventType.f16852b.e();
            }
            if (PointerEventKt.b(pointerInputChange)) {
                return PointerEventType.f16852b.d();
            }
        }
        return PointerEventType.f16852b.c();
    }

    public final int b() {
        return this.f16846c;
    }

    public final List c() {
        return this.f16844a;
    }

    public final int d() {
        MotionEvent g2;
        if (Build.VERSION.SDK_INT < 29 || (g2 = g()) == null) {
            return 0;
        }
        return g2.getClassification();
    }

    public final InternalPointerEvent e() {
        return this.f16845b;
    }

    public final int f() {
        return this.f16847d;
    }

    public final MotionEvent g() {
        InternalPointerEvent internalPointerEvent = this.f16845b;
        if (internalPointerEvent != null) {
            return internalPointerEvent.c();
        }
        return null;
    }

    public final int h() {
        return this.f16848e;
    }

    public final void i(int i2) {
        this.f16848e = i2;
    }

    public PointerEvent(List list) {
        this(list, (InternalPointerEvent) null);
    }
}
