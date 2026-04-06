package com.hansecom.abt.presentation.screens.main.debugMenu;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenu;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DebugMenu.State f37643A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37644B;
    public final /* synthetic */ Flow C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f37645z;

    public /* synthetic */ c(Function0 function0, DebugMenu.State state, Function1 function1, Flow flow, Modifier modifier, int i2, int i3) {
        this.f37645z = function0;
        this.f37643A = state;
        this.f37644B = function1;
        this.C = flow;
        this.D = modifier;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return DebugMenuDialogKt.h(this.f37645z, this.f37643A, this.f37644B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
