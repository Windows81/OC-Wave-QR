package androidx.compose.ui.semantics;

import androidx.collection.MutableObjectList;
import kotlin.Metadata;

@Metadata
public final class SemanticsInfoKt {
    public static final SemanticsConfiguration a(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration a0 = semanticsInfo.a0();
        if (a0 != null && a0.u() && !a0.s()) {
            a0 = a0.m();
            MutableObjectList mutableObjectList = new MutableObjectList(semanticsInfo.c0().size());
            mutableObjectList.r(semanticsInfo.c0());
            while (mutableObjectList.h()) {
                SemanticsInfo semanticsInfo2 = (SemanticsInfo) mutableObjectList.A(mutableObjectList.f1938b - 1);
                SemanticsConfiguration a02 = semanticsInfo2.a0();
                if (a02 != null && !a02.u()) {
                    a0.v(a02);
                    if (!a02.s()) {
                        mutableObjectList.r(semanticsInfo2.c0());
                    }
                }
            }
        }
        return a0;
    }
}
