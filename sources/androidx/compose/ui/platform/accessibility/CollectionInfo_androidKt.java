package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class CollectionInfo_androidKt {
    public static final boolean a(List list) {
        List list2;
        long j2;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = CollectionsKt.m();
        } else {
            ArrayList arrayList = new ArrayList();
            Object obj = list.get(0);
            int o2 = CollectionsKt.o(list);
            int i2 = 0;
            while (i2 < o2) {
                i2++;
                Object obj2 = list.get(i2);
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                arrayList.add(Offset.d(Offset.e((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode2.i().m() >> 32)) - Float.intBitsToFloat((int) (semanticsNode.i().m() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode2.i().m() & 4294967295L)) - Float.intBitsToFloat((int) (semanticsNode.i().m() & 4294967295L))))) & 4294967295L))));
                obj = obj2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            j2 = ((Offset) CollectionsKt.e0(list2)).t();
        } else {
            if (list2.isEmpty()) {
                ListUtilsKt.g("Empty collection can't be reduced.");
            }
            Object e0 = CollectionsKt.e0(list2);
            int o3 = CollectionsKt.o(list2);
            if (1 <= o3) {
                int i3 = 1;
                while (true) {
                    e0 = Offset.d(Offset.q(((Offset) e0).t(), ((Offset) list2.get(i3)).t()));
                    if (i3 == o3) {
                        break;
                    }
                    i3++;
                }
            }
            j2 = ((Offset) e0).t();
        }
        return Float.intBitsToFloat((int) (4294967295L & j2)) < Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final boolean b(SemanticsNode semanticsNode) {
        SemanticsConfiguration n2 = semanticsNode.n();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        return (SemanticsConfigurationKt.a(n2, semanticsProperties.a()) == null && SemanticsConfigurationKt.a(semanticsNode.n(), semanticsProperties.D()) == null) ? false : true;
    }

    public static final boolean c(CollectionInfo collectionInfo) {
        return collectionInfo.b() < 0 || collectionInfo.a() < 0;
    }

    public static final void d(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration n2 = semanticsNode.n();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.a(n2, semanticsProperties.a());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.k0(f(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.a(semanticsNode.n(), semanticsProperties.D()) != null) {
            List t2 = semanticsNode.t();
            int size = t2.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) t2.get(i2);
                if (semanticsNode2.n().h(SemanticsProperties.f18102a.E())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean a2 = a(arrayList);
            int i3 = 1;
            int size2 = a2 ? 1 : arrayList.size();
            if (a2) {
                i3 = arrayList.size();
            }
            accessibilityNodeInfoCompat.k0(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(size2, i3, false, 0));
        }
    }

    public static final void e(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration n2 = semanticsNode.n();
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.a(n2, semanticsProperties.b());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.l0(g(collectionItemInfo, semanticsNode));
        }
        SemanticsNode r2 = semanticsNode.r();
        if (r2 != null && SemanticsConfigurationKt.a(r2.n(), semanticsProperties.D()) != null) {
            CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.a(r2.n(), semanticsProperties.a());
            if ((collectionInfo == null || !c(collectionInfo)) && semanticsNode.n().h(semanticsProperties.E())) {
                ArrayList arrayList = new ArrayList();
                List t2 = r2.t();
                int size = t2.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    SemanticsNode semanticsNode2 = (SemanticsNode) t2.get(i3);
                    if (semanticsNode2.n().h(SemanticsProperties.f18102a.E())) {
                        arrayList.add(semanticsNode2);
                        if (semanticsNode2.q().D0() < semanticsNode.q().D0()) {
                            i2++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean a2 = a(arrayList);
                    AccessibilityNodeInfoCompat.CollectionItemInfoCompat a3 = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(a2 ? 0 : i2, 1, a2 ? i2 : 0, 1, false, ((Boolean) semanticsNode.n().o(SemanticsProperties.f18102a.E(), CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.f17956z)).booleanValue());
                    if (a3 != null) {
                        accessibilityNodeInfoCompat.l0(a3);
                    }
                }
            }
        }
    }

    public static final AccessibilityNodeInfoCompat.CollectionInfoCompat f(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.a(collectionInfo.b(), collectionInfo.a(), false, 0);
    }

    public static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat g(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(collectionItemInfo.c(), collectionItemInfo.d(), collectionItemInfo.a(), collectionItemInfo.b(), false, ((Boolean) semanticsNode.n().o(SemanticsProperties.f18102a.E(), CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1.f17957z)).booleanValue());
    }
}
