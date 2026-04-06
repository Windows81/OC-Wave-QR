package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineScope f10917a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimationSpec f10918b;

    /* renamed from: c  reason: collision with root package name */
    public Animatable f10919c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f10920d;

    public SegmentedButtonContentMeasurePolicy(CoroutineScope coroutineScope, AnimationSpec animationSpec) {
        this.f10917a = coroutineScope;
        this.f10918b = animationSpec;
    }

    public static final Unit e(List list, MeasureScope measureScope, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i2, List list2, int i3, Placeable.PlacementScope placementScope) {
        MeasureScope measureScope2 = measureScope;
        List list3 = list2;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            Placeable.PlacementScope.j(placementScope, placeable, 0, (i3 - placeable.C0()) / 2, 0.0f, 4, (Object) null);
        }
        int P1 = measureScope.P1(SegmentedButtonDefaults.f10921a.g()) + measureScope.P1(SegmentedButtonKt.f10928a);
        Animatable animatable = segmentedButtonContentMeasurePolicy.f10919c;
        int intValue = P1 + (animatable != null ? ((Number) animatable.m()).intValue() : i2);
        int size2 = list3.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable placeable2 = (Placeable) list3.get(i5);
            Placeable.PlacementScope.j(placementScope, placeable2, intValue, (i3 - placeable2.C0()) / 2, 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        long j3 = j2;
        List list3 = (List) list2.get(0);
        int i2 = 1;
        List list4 = (List) list2.get(1);
        ArrayList arrayList = new ArrayList(list3.size());
        int size = list3.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((Measurable) list3.get(i3)).c0(j3));
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int L0 = ((Placeable) obj).L0();
            int o2 = CollectionsKt.o(arrayList);
            if (1 <= o2) {
                int i4 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i4);
                    int L02 = ((Placeable) obj4).L0();
                    if (L0 < L02) {
                        obj = obj4;
                        L0 = L02;
                    }
                    if (i4 == o2) {
                        break;
                    }
                    i4++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int L03 = placeable != null ? placeable.L0() : 0;
        ArrayList arrayList2 = new ArrayList(list4.size());
        int size2 = list4.size();
        for (int i5 = 0; i5 < size2; i5++) {
            arrayList2.add(((Measurable) list4.get(i5)).c0(j3));
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int L04 = ((Placeable) obj2).L0();
            int o3 = CollectionsKt.o(arrayList2);
            if (1 <= o3) {
                int i6 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i6);
                    int L05 = ((Placeable) obj5).L0();
                    if (L04 < L05) {
                        obj2 = obj5;
                        L04 = L05;
                    }
                    if (i6 == o3) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        Integer valueOf = placeable2 != null ? Integer.valueOf(placeable2.L0()) : null;
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int C0 = ((Placeable) obj3).C0();
            int o4 = CollectionsKt.o(arrayList2);
            if (1 <= o4) {
                while (true) {
                    Object obj6 = arrayList2.get(i2);
                    int C02 = ((Placeable) obj6).C0();
                    if (C0 < C02) {
                        obj3 = obj6;
                        C0 = C02;
                    }
                    if (i2 == o4) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        int C03 = placeable3 != null ? placeable3.C0() : 0;
        SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.f10921a;
        int max = Math.max(measureScope2.P1(segmentedButtonDefaults.g()), L03) + measureScope2.P1(SegmentedButtonKt.f10928a) + (valueOf != null ? valueOf.intValue() : 0);
        int i7 = L03 == 0 ? (-(measureScope2.P1(segmentedButtonDefaults.g()) + measureScope2.P1(SegmentedButtonKt.f10928a))) / 2 : 0;
        if (this.f10920d == null) {
            this.f10920d = Integer.valueOf(i7);
        } else {
            Animatable animatable = this.f10919c;
            if (animatable == null) {
                Integer num = this.f10920d;
                Intrinsics.f(num);
                animatable = new Animatable(num, VectorConvertersKt.j(IntCompanionObject.f40897a), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
                this.f10919c = animatable;
            }
            if (((Number) animatable.k()).intValue() != i7) {
                Job unused = BuildersKt__Builders_commonKt.d(this.f10917a, (CoroutineContext) null, (CoroutineStart) null, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i7, this, (Continuation) null), 3, (Object) null);
            }
        }
        return MeasureScope.R1(measureScope, max, C03, (Map) null, new J5(arrayList, measureScope, this, i7, arrayList2, C03), 4, (Object) null);
    }

    public final AnimationSpec d() {
        return this.f10918b;
    }
}
