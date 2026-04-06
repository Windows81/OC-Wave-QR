package com.hansecom.abt.util;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.AppInfoKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class DebugMenuModifierKt {
    public static final Modifier c(Modifier modifier, Function0 function0, int i2, Composer composer, int i3, int i4) {
        Intrinsics.i(modifier, "<this>");
        Intrinsics.i(function0, "onOpenRequest");
        composer.X(864080264);
        if ((i4 & 2) != 0) {
            i2 = 5;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(864080264, i3, -1, "com.hansecom.abt.util.debugMenu (DebugMenuModifier.kt:27)");
        }
        if (((AppInfo) composer.C(AppInfoKt.c())).b()) {
            composer.X(-1462441949);
            boolean z2 = false;
            boolean z3 = (((i3 & 896) ^ 384) > 256 && composer.i(i2)) || (i3 & 384) == 256;
            if ((((i3 & 112) ^ 48) > 32 && composer.W(function0)) || (i3 & 48) == 32) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object g2 = composer.g();
            if (z4 || g2 == Composer.f14567a.a()) {
                g2 = new DebugMenuModifierKt$debugMenu$1$1(i2, function0);
                composer.N(g2);
            }
            composer.M();
            modifier = SuspendingPointerInputFilterKt.c(modifier, (Object) null, (PointerInputEventHandler) g2);
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return modifier;
    }

    public static final Object d(PointerInputScope pointerInputScope, Function1 function1, Continuation continuation) {
        Object m2 = TapGestureDetectorKt.m(pointerInputScope, (Function1) null, (Function1) null, (Function3) null, new b(new Ref.IntRef(), new Ref.LongRef(), pointerInputScope, function1), continuation, 7, (Object) null);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }

    public static final Unit e(Ref.IntRef intRef, Ref.LongRef longRef, PointerInputScope pointerInputScope, Function1 function1, Offset offset) {
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = 1;
        if (currentTimeMillis - longRef.f40907z <= pointerInputScope.getViewConfiguration().a()) {
            i2 = 1 + intRef.f40906z;
        }
        intRef.f40906z = i2;
        longRef.f40907z = currentTimeMillis;
        function1.invoke(Integer.valueOf(i2));
        return Unit.f40552a;
    }
}
