package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator[] f17571a;

    /* renamed from: b  reason: collision with root package name */
    public static final Function2 f17572b = AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.f17576z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17579a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f17579a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.WhenMappings.<clinit>():void");
        }
    }

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i2 = 0;
        while (i2 < 2) {
            comparatorArr[i2] = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$2(new AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1(i2 == 0 ? RtlBoundsComparator.f17871z : LtrBoundsComparator.f17818z, LayoutNode.r0.b()));
            i2++;
        }
        f17571a = comparatorArr;
    }

    public static final List A(boolean z2, ArrayList arrayList, Resources resources, MutableIntObjectMap mutableIntObjectMap) {
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int o2 = CollectionsKt.o(arrayList);
        int i2 = 0;
        if (o2 >= 0) {
            int i3 = 0;
            while (true) {
                SemanticsNode semanticsNode = (SemanticsNode) arrayList.get(i3);
                if (i3 == 0 || !x(arrayList2, semanticsNode)) {
                    arrayList2.add(new Pair(semanticsNode.j(), CollectionsKt.s(semanticsNode)));
                }
                if (i3 == o2) {
                    break;
                }
                i3++;
            }
        }
        CollectionsKt.A(arrayList2, TopBottomBoundsComparator.f17885z);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f17571a[!z2];
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            Pair pair = (Pair) arrayList2.get(i4);
            CollectionsKt.A((List) pair.f(), comparator);
            arrayList3.addAll((Collection) pair.f());
        }
        CollectionsKt.A(arrayList3, new C0344j(f17572b));
        while (i2 <= CollectionsKt.o(arrayList3)) {
            List list = (List) mutableIntObjectMap.b(((SemanticsNode) arrayList3.get(i2)).o());
            if (list != null) {
                if (!w((SemanticsNode) arrayList3.get(i2), resources)) {
                    arrayList3.remove(i2);
                } else {
                    i2++;
                }
                arrayList3.addAll(i2, list);
                i2 += list.size();
            } else {
                i2++;
            }
        }
        return arrayList3;
    }

    public static final int B(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.m(obj, obj2)).intValue();
    }

    public static final List C(boolean z2, List list, IntObjectMap intObjectMap, Resources resources) {
        MutableIntObjectMap c2 = IntObjectMapKt.c();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            r((SemanticsNode) list.get(i2), arrayList, c2, intObjectMap, resources);
        }
        return A(z2, arrayList, resources, c2);
    }

    public static final boolean m(AccessibilityAction accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!Intrinsics.d(accessibilityAction.b(), accessibilityAction2.b())) {
            return false;
        }
        if (accessibilityAction.a() != null || accessibilityAction2.a() == null) {
            return accessibilityAction.a() == null || accessibilityAction2.a() != null;
        }
        return false;
    }

    public static final String n(SemanticsNode semanticsNode, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        SemanticsConfiguration n2 = semanticsNode.a().n();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        Collection collection2 = (Collection) SemanticsConfigurationKt.a(n2, semanticsProperties.d());
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) SemanticsConfigurationKt.a(n2, semanticsProperties.H())) == null || collection.isEmpty()) && ((charSequence = (CharSequence) SemanticsConfigurationKt.a(n2, semanticsProperties.g())) == null || charSequence.length() == 0))) {
            return resources.getString(R.string.f15538n);
        }
        return null;
    }

    public static final boolean o(SemanticsNode semanticsNode) {
        return !semanticsNode.n().h(SemanticsProperties.f18102a.f());
    }

    public static final boolean p(SemanticsNode semanticsNode) {
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        if (w2.h(semanticsProperties.g()) && !Intrinsics.d(SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.i()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode q2 = q(semanticsNode.q(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.f17580z);
        if (q2 != null) {
            SemanticsConfiguration a0 = q2.a0();
            if (!(a0 != null ? Intrinsics.d(SemanticsConfigurationKt.a(a0, semanticsProperties.i()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    public static final LayoutNode q(LayoutNode layoutNode, Function1 function1) {
        for (LayoutNode C0 = layoutNode.C0(); C0 != null; C0 = C0.C0()) {
            if (((Boolean) function1.invoke(C0)).booleanValue()) {
                return C0;
            }
        }
        return null;
    }

    public static final void r(SemanticsNode semanticsNode, ArrayList arrayList, MutableIntObjectMap mutableIntObjectMap, IntObjectMap intObjectMap, Resources resources) {
        boolean v2 = v(semanticsNode);
        boolean booleanValue = ((Boolean) semanticsNode.w().o(SemanticsProperties.f18102a.v(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1.f17581z)).booleanValue();
        if ((booleanValue || w(semanticsNode, resources)) && intObjectMap.a(semanticsNode.o())) {
            arrayList.add(semanticsNode);
        }
        if (booleanValue) {
            mutableIntObjectMap.r(semanticsNode.o(), C(v2, semanticsNode.k(), intObjectMap, resources));
            return;
        }
        List k2 = semanticsNode.k();
        int size = k2.size();
        for (int i2 = 0; i2 < size; i2++) {
            r((SemanticsNode) k2.get(i2), arrayList, mutableIntObjectMap, intObjectMap, resources);
        }
    }

    public static final boolean s(SemanticsNode semanticsNode) {
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(w2, semanticsProperties.K());
        Role role = (Role) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.C());
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.E())) == null) {
            return z4;
        }
        int h2 = Role.f18040b.h();
        if (role != null) {
            z3 = Role.m(role.p(), h2);
        }
        if (z3) {
            z2 = z4;
        }
        return z2;
    }

    public static final String t(SemanticsNode semanticsNode, Resources resources) {
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        Object a2 = SemanticsConfigurationKt.a(w2, semanticsProperties.F());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.K());
        Role role = (Role) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.C());
        int i2 = 0;
        if (toggleableState != null) {
            int i3 = WhenMappings.f17579a[toggleableState.ordinal()];
            if (i3 == 1) {
                if ((role == null ? false : Role.m(role.p(), Role.f18040b.g())) && a2 == null) {
                    a2 = resources.getString(R.string.f15540p);
                }
            } else if (i3 == 2) {
                if ((role == null ? false : Role.m(role.p(), Role.f18040b.g())) && a2 == null) {
                    a2 = resources.getString(R.string.f15539o);
                }
            } else if (i3 == 3 && a2 == null) {
                a2 = resources.getString(R.string.f15532h);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.E());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(role == null ? false : Role.m(role.p(), Role.f18040b.h())) && a2 == null) {
                a2 = booleanValue ? resources.getString(R.string.f15537m) : resources.getString(R.string.f15534j);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.B());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.f18035d.a()) {
                if (a2 == null) {
                    ClosedFloatingPointRange c2 = progressBarRangeInfo.c();
                    float b2 = ((((Number) c2.m()).floatValue() - ((Number) c2.e()).floatValue()) > 0.0f ? 1 : ((((Number) c2.m()).floatValue() - ((Number) c2.e()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.b() - ((Number) c2.e()).floatValue()) / (((Number) c2.m()).floatValue() - ((Number) c2.e()).floatValue());
                    if (b2 < 0.0f) {
                        b2 = 0.0f;
                    }
                    if (b2 > 1.0f) {
                        b2 = 1.0f;
                    }
                    if (!(b2 == 0.0f)) {
                        if (b2 == 1.0f) {
                            i2 = 1;
                        }
                        i2 = i2 != 0 ? 100 : RangesKt.o(Math.round(b2 * ((float) 100)), 1, 99);
                    }
                    a2 = resources.getString(R.string.f15543s, new Object[]{Integer.valueOf(i2)});
                }
            } else if (a2 == null) {
                a2 = resources.getString(R.string.f15531g);
            }
        }
        if (semanticsNode.w().h(semanticsProperties.g())) {
            a2 = n(semanticsNode, resources);
        }
        return (String) a2;
    }

    public static final AnnotatedString u(SemanticsNode semanticsNode) {
        SemanticsConfiguration w2 = semanticsNode.w();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.a(w2, semanticsProperties.g());
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.w(), semanticsProperties.H());
        return annotatedString == null ? list != null ? (AnnotatedString) CollectionsKt.g0(list) : null : annotatedString;
    }

    public static final boolean v(SemanticsNode semanticsNode) {
        return semanticsNode.p().getLayoutDirection() == LayoutDirection.Rtl;
    }

    public static final boolean w(SemanticsNode semanticsNode, Resources resources) {
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.w(), SemanticsProperties.f18102a.d());
        boolean z2 = ((list != null ? (String) CollectionsKt.g0(list) : null) == null && u(semanticsNode) == null && t(semanticsNode, resources) == null && !s(semanticsNode)) ? false : true;
        if (!SemanticsUtils_androidKt.f(semanticsNode)) {
            if (semanticsNode.w().u()) {
                return true;
            }
            if (semanticsNode.A() && z2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean x(ArrayList arrayList, SemanticsNode semanticsNode) {
        float r2 = semanticsNode.j().r();
        float i2 = semanticsNode.j().i();
        boolean z2 = r2 >= i2;
        int o2 = CollectionsKt.o(arrayList);
        if (o2 >= 0) {
            int i3 = 0;
            while (true) {
                Rect rect = (Rect) ((Pair) arrayList.get(i3)).e();
                boolean z3 = rect.r() >= rect.i();
                if (z2 || z3 || Math.max(r2, rect.r()) >= Math.min(i2, rect.i())) {
                    if (i3 == o2) {
                        break;
                    }
                    i3++;
                } else {
                    arrayList.set(i3, new Pair(rect.w(0.0f, r2, Float.POSITIVE_INFINITY, i2), ((Pair) arrayList.get(i3)).f()));
                    ((List) ((Pair) arrayList.get(i3)).f()).add(semanticsNode);
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean y(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.n().h((SemanticsPropertyKey) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final void z(IntObjectMap intObjectMap, MutableIntIntMap mutableIntIntMap, MutableIntIntMap mutableIntIntMap2, Resources resources) {
        mutableIntIntMap.i();
        mutableIntIntMap2.i();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) intObjectMap.b(-1);
        SemanticsNode b2 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.b() : null;
        Intrinsics.f(b2);
        List C = C(v(b2), CollectionsKt.e(b2), intObjectMap, resources);
        int o2 = CollectionsKt.o(C);
        int i2 = 1;
        if (1 <= o2) {
            while (true) {
                int o3 = ((SemanticsNode) C.get(i2 - 1)).o();
                int o4 = ((SemanticsNode) C.get(i2)).o();
                mutableIntIntMap.q(o3, o4);
                mutableIntIntMap2.q(o4, o3);
                if (i2 != o2) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
