package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class NodeCoordinatorKt {
    public static final boolean c(MutableObjectIntMap mutableObjectIntMap, Map map) {
        if (mutableObjectIntMap == null || mutableObjectIntMap.f() != map.size()) {
            return false;
        }
        Object[] objArr = mutableObjectIntMap.f1932b;
        int[] iArr = mutableObjectIntMap.f1933c;
        long[] jArr = mutableObjectIntMap.f1931a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        loop0:
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        int i6 = iArr[i5];
                        Integer num = (Integer) map.get((AlignmentLine) obj);
                        if (num != null && num.intValue() == i6) {
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i2 == length) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public static final Modifier.Node d(DelegatableNode delegatableNode, int i2, int i3) {
        Modifier.Node w2 = delegatableNode.M().w2();
        if (w2 == null || (w2.v2() & i2) == 0) {
            return null;
        }
        while (w2 != null) {
            int A2 = w2.A2();
            if ((A2 & i3) != 0) {
                return null;
            }
            if ((A2 & i2) != 0) {
                return w2;
            }
            w2 = w2.w2();
        }
        return null;
    }
}
