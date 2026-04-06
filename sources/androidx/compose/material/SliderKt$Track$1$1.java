package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SliderKt$Track$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f8400A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f8401B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ State E;
    public final /* synthetic */ List F;
    public final /* synthetic */ State G;
    public final /* synthetic */ State H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8402z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$1$1(float f2, State state, float f3, float f4, float f5, State state2, List list, State state3, State state4) {
        super(1);
        this.f8402z = f2;
        this.f8400A = state;
        this.f8401B = f3;
        this.C = f4;
        this.D = f5;
        this.E = state2;
        this.F = list;
        this.G = state3;
        this.H = state4;
    }

    public final void b(DrawScope drawScope) {
        boolean z2 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long a2 = OffsetKt.a(this.f8402z, Offset.n(drawScope.T1()));
        long a3 = OffsetKt.a(Size.i(drawScope.c()) - this.f8402z, Offset.n(drawScope.T1()));
        long j2 = z2 ? a3 : a2;
        if (!z2) {
            a2 = a3;
        }
        long v2 = ((Color) this.f8400A.getValue()).v();
        float f2 = this.f8401B;
        StrokeCap.Companion companion = StrokeCap.f16130b;
        long j3 = j2;
        DrawScope.j2(drawScope, v2, j2, a2, f2, companion.b(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        DrawScope.j2(drawScope, ((Color) this.E.getValue()).v(), OffsetKt.a(Offset.m(j3) + ((Offset.m(a2) - Offset.m(j3)) * this.D), Offset.n(drawScope.T1())), OffsetKt.a(Offset.m(j3) + ((Offset.m(a2) - Offset.m(j3)) * this.C), Offset.n(drawScope.T1())), this.f8401B, companion.b(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        float f3 = this.C;
        float f4 = this.D;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : this.F) {
            float floatValue = ((Number) next).floatValue();
            Boolean valueOf = Boolean.valueOf(floatValue > f3 || floatValue < f4);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next);
        }
        State state = this.G;
        State state2 = this.H;
        float f5 = this.f8401B;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(Offset.d(OffsetKt.a(Offset.m(OffsetKt.b(j3, a2, ((Number) list.get(i2)).floatValue())), Offset.n(drawScope.T1()))));
            }
            DrawScope.m1(drawScope, arrayList, PointMode.f16097b.b(), ((Color) (booleanValue ? state : state2).getValue()).v(), f5, StrokeCap.f16130b.b(), (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
