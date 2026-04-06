package com.hansecom.abt.presentation.screens.auth.welcome;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.auth.welcome.Welcome;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WelcomeViewModel extends MviViewModel<Welcome.Action, Welcome.State, Welcome.Effect> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomeViewModel(SavedStateHandle savedStateHandle, AppFeatures appFeatures) {
        super(savedStateHandle, new Welcome.State(appFeatures.f(), appFeatures.l()));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(appFeatures, "appFeatures");
    }

    /* renamed from: u */
    public Object o(Welcome.Action action, Continuation continuation) {
        return Unit.f40552a;
    }
}
