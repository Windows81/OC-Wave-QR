package com.hansecom.abt.presentation.screens.home.trip;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.config.links.LinksConfigItem;
import com.hansecom.abt.data.useCases.configurations.GetLinksConfigurationUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.trip.TripPlanner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TripPlannerViewModel extends MviViewModel<TripPlanner.Action, TripPlanner.State, TripPlanner.Effect> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TripPlannerViewModel(SavedStateHandle savedStateHandle, GetLinksConfigurationUseCase getLinksConfigurationUseCase) {
        super(savedStateHandle, new TripPlanner.State((String) null, (String) null, 3, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(getLinksConfigurationUseCase, "getLinksConfigurationUseCase");
        r(new e(getLinksConfigurationUseCase.d("tripplanner")));
    }

    public static final TripPlanner.State w(LinksConfigItem linksConfigItem, TripPlanner.State state) {
        Intrinsics.i(state, "$this$update");
        String str = null;
        String d2 = linksConfigItem != null ? linksConfigItem.d() : null;
        if (d2 == null) {
            d2 = "";
        }
        if (linksConfigItem != null) {
            str = linksConfigItem.a();
        }
        return state.a(d2, str);
    }

    /* renamed from: v */
    public Object o(TripPlanner.Action action, Continuation continuation) {
        return Unit.f40552a;
    }
}
