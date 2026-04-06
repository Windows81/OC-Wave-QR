package androidx.compose.ui.platform;

import android.graphics.Region;
import android.view.View;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SemanticsUtils_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f17879a = new Rect(0.0f, 0.0f, 10.0f, 10.0f);

    public static final ScrollObservationScope a(List list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((ScrollObservationScope) list.get(i3)).d() == i2) {
                return (ScrollObservationScope) list.get(i3);
            }
        }
        return null;
    }

    public static final IntObjectMap b(SemanticsOwner semanticsOwner) {
        SemanticsNode d2 = semanticsOwner.d();
        if (!d2.q().u() || !d2.q().b()) {
            return IntObjectMapKt.a();
        }
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(48);
        Rect i2 = d2.i();
        c(new Region(Math.round(i2.o()), Math.round(i2.r()), Math.round(i2.p()), Math.round(i2.i())), d2, mutableIntObjectMap, d2, new Region());
        return mutableIntObjectMap;
    }

    public static final void c(Region region, SemanticsNode semanticsNode, MutableIntObjectMap mutableIntObjectMap, SemanticsNode semanticsNode2, Region region2) {
        LayoutInfo p2;
        boolean z2 = !semanticsNode2.q().u() || !semanticsNode2.q().b();
        if (region.isEmpty() && semanticsNode2.o() != semanticsNode.o()) {
            return;
        }
        if (!z2 || semanticsNode2.x()) {
            Rect v2 = semanticsNode2.v();
            int round = Math.round(v2.o());
            int round2 = Math.round(v2.r());
            int round3 = Math.round(v2.p());
            int round4 = Math.round(v2.i());
            region2.set(round, round2, round3, round4);
            int o2 = semanticsNode2.o() == semanticsNode.o() ? -1 : semanticsNode2.o();
            if (region2.op(region, Region.Op.INTERSECT)) {
                mutableIntObjectMap.r(o2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                List t2 = semanticsNode2.t();
                for (int size = t2.size() - 1; -1 < size; size--) {
                    if (!((SemanticsNode) t2.get(size)).n().h(SemanticsProperties.f18102a.w())) {
                        c(region, semanticsNode, mutableIntObjectMap, (SemanticsNode) t2.get(size), region2);
                    }
                }
                if (g(semanticsNode2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            } else if (semanticsNode2.x()) {
                SemanticsNode r2 = semanticsNode2.r();
                Rect i2 = (r2 == null || (p2 = r2.p()) == null || !p2.u()) ? f17879a : r2.i();
                mutableIntObjectMap.r(o2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(Math.round(i2.o()), Math.round(i2.r()), Math.round(i2.p()), Math.round(i2.i()))));
            } else if (o2 == -1) {
                mutableIntObjectMap.r(o2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
            }
        }
    }

    public static final Float d(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsActions.f18056a.h());
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.a()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final TextLayoutResult e(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsActions.f18056a.i());
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.a()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final boolean f(SemanticsNode semanticsNode) {
        if (!semanticsNode.z()) {
            SemanticsConfiguration w2 = semanticsNode.w();
            SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
            return w2.h(semanticsProperties.k()) || semanticsNode.w().h(semanticsProperties.p());
        }
    }

    public static final boolean g(SemanticsNode semanticsNode) {
        return !f(semanticsNode) && (semanticsNode.w().u() || semanticsNode.w().i());
    }

    public static final View h(AndroidViewsHandler androidViewsHandler, int i2) {
        Object obj;
        Iterator it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LayoutNode) ((Map.Entry) obj).getKey()).v() == i2) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String i(int i2) {
        Role.Companion companion = Role.f18040b;
        if (Role.m(i2, companion.a())) {
            return "android.widget.Button";
        }
        if (Role.m(i2, companion.c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m(i2, companion.f())) {
            return "android.widget.RadioButton";
        }
        if (Role.m(i2, companion.e())) {
            return "android.widget.ImageView";
        }
        if (Role.m(i2, companion.d())) {
            return "android.widget.Spinner";
        }
        if (Role.m(i2, companion.i())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
