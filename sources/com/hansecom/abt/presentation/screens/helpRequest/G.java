package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class G implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34817A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusManager f34818B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.State f34819z;

    public /* synthetic */ G(HelpRequest.State state, Function1 function1, FocusManager focusManager, int i2) {
        this.f34819z = state;
        this.f34817A = function1;
        this.f34818B = focusManager;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return HelpRequestScreenKt.j0(this.f34819z, this.f34817A, this.f34818B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
