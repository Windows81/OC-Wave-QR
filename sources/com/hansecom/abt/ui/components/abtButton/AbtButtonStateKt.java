package com.hansecom.abt.ui.components.abtButton;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtButtonStateKt {
    public static final AbtButtonState a(Boolean bool, Boolean bool2) {
        Boolean bool3 = Boolean.TRUE;
        return Intrinsics.d(bool, bool3) ? AbtButtonState.Disabled : Intrinsics.d(bool2, bool3) ? AbtButtonState.Loading : AbtButtonState.Enabled;
    }

    public static /* synthetic */ AbtButtonState b(Boolean bool, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        return a(bool, bool2);
    }
}
