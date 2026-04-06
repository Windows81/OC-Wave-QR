package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusManager;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.helpRequest.z  reason: case insensitive filesystem */
public final /* synthetic */ class C0448z implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34958A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusManager f34959B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HelpRequest.State f34960z;

    public /* synthetic */ C0448z(HelpRequest.State state, Function1 function1, FocusManager focusManager, int i2) {
        this.f34960z = state;
        this.f34958A = function1;
        this.f34959B = focusManager;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return HelpRequestScreenKt.M(this.f34960z, this.f34958A, this.f34959B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
