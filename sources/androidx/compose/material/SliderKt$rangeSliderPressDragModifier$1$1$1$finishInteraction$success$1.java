package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1 extends Lambda implements Function1<PointerInputChange, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f8410A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8411B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f8412z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1(State state, Ref.BooleanRef booleanRef, boolean z2) {
        super(1);
        this.f8412z = state;
        this.f8410A = booleanRef;
        this.f8411B = z2;
    }

    public final void b(PointerInputChange pointerInputChange) {
        float m2 = Offset.m(PointerEventKt.g(pointerInputChange));
        Function2 function2 = (Function2) this.f8412z.getValue();
        Boolean valueOf = Boolean.valueOf(this.f8410A.f40901z);
        if (this.f8411B) {
            m2 = -m2;
        }
        function2.m(valueOf, Float.valueOf(m2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((PointerInputChange) obj);
        return Unit.f40552a;
    }
}
