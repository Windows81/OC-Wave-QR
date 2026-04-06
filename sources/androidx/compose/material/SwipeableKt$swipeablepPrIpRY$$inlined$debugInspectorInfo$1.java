package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Map f8561A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Orientation f8562B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ MutableInteractionSource E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ ResistanceConfig G;
    public final /* synthetic */ float H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SwipeableState f8563z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1(SwipeableState swipeableState, Map map, Orientation orientation, boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource, Function2 function2, ResistanceConfig resistanceConfig, float f2) {
        super(1);
        this.f8563z = swipeableState;
        this.f8561A = map;
        this.f8562B = orientation;
        this.C = z2;
        this.D = z3;
        this.E = mutableInteractionSource;
        this.F = function2;
        this.G = resistanceConfig;
        this.H = f2;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("swipeable");
        inspectorInfo.a().b("state", this.f8563z);
        inspectorInfo.a().b("anchors", this.f8561A);
        inspectorInfo.a().b("orientation", this.f8562B);
        inspectorInfo.a().b("enabled", Boolean.valueOf(this.C));
        inspectorInfo.a().b("reverseDirection", Boolean.valueOf(this.D));
        inspectorInfo.a().b("interactionSource", this.E);
        inspectorInfo.a().b("thresholds", this.F);
        inspectorInfo.a().b("resistance", this.G);
        inspectorInfo.a().b("velocityThreshold", Dp.j(this.H));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
