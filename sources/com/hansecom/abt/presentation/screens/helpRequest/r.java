package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class r implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34938A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusManager f34939B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.State f34940z;

    public /* synthetic */ r(HelpRequest.State state, Function1 function1, FocusManager focusManager, int i2) {
        this.f34940z = state;
        this.f34938A = function1;
        this.f34939B = focusManager;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return HelpRequestScreenKt.U(this.f34940z, this.f34938A, this.f34939B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
