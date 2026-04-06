package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8348A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f8349B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ State D;
    public final /* synthetic */ State E;
    public final /* synthetic */ MutableState F;
    public final /* synthetic */ boolean G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DraggableState f8350z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f2, boolean z2, State state, State state2, MutableState mutableState, boolean z3) {
        super(1);
        this.f8350z = draggableState;
        this.f8348A = mutableInteractionSource;
        this.f8349B = f2;
        this.C = z2;
        this.D = state;
        this.E = state2;
        this.F = mutableState;
        this.G = z3;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("sliderTapModifier");
        inspectorInfo.a().b("draggableState", this.f8350z);
        inspectorInfo.a().b("interactionSource", this.f8348A);
        inspectorInfo.a().b("maxPx", Float.valueOf(this.f8349B));
        inspectorInfo.a().b("isRtl", Boolean.valueOf(this.C));
        inspectorInfo.a().b("rawOffset", this.D);
        inspectorInfo.a().b("gestureEndAction", this.E);
        inspectorInfo.a().b("pressOffset", this.F);
        inspectorInfo.a().b("enabled", Boolean.valueOf(this.G));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
