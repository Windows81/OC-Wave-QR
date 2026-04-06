package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class RequestDisallowInterceptTouchEvent implements Function1<Boolean, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public PointerInteropFilter f16941z;

    public void b(boolean z2) {
        PointerInteropFilter pointerInteropFilter = this.f16941z;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.c(z2);
        }
    }

    public final void c(PointerInteropFilter pointerInteropFilter) {
        this.f16941z = pointerInteropFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Boolean) obj).booleanValue());
        return Unit.f40552a;
    }
}
