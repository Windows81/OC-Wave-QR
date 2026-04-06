package androidx.compose.material3;

import androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* renamed from: androidx.compose.material3.t6  reason: case insensitive filesystem */
public final /* synthetic */ class C0250t6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f12717A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f12718z;

    public /* synthetic */ C0250t6(RangeSliderState rangeSliderState, Ref.BooleanRef booleanRef) {
        this.f12718z = rangeSliderState;
        this.f12717A = booleanRef;
    }

    public final Object invoke(Object obj) {
        return SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.AnonymousClass1.B(this.f12718z, this.f12717A, (PointerInputChange) obj);
    }
}
