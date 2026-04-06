package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PointerInteropFilter implements PointerInputModifier {

    /* renamed from: A  reason: collision with root package name */
    public RequestDisallowInterceptTouchEvent f16913A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f16914B;
    public final PointerInputFilter C = new PointerInteropFilter$pointerInputFilter$1(this);

    /* renamed from: z  reason: collision with root package name */
    public Function1 f16915z;

    @Metadata
    public enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching;

        static {
            DispatchToViewState[] d2;
            D = EnumEntriesKt.a(d2);
        }
    }

    public final boolean a() {
        return this.f16914B;
    }

    public final Function1 b() {
        Function1 function1 = this.f16915z;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.y("onTouchEvent");
        return null;
    }

    public final void c(boolean z2) {
        this.f16914B = z2;
    }

    public final void d(Function1 function1) {
        this.f16915z = function1;
    }

    public final void e(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = this.f16913A;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.c((PointerInteropFilter) null);
        }
        this.f16913A = requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent != null) {
            requestDisallowInterceptTouchEvent.c(this);
        }
    }

    public PointerInputFilter i1() {
        return this.C;
    }
}
