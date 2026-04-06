package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import androidx.lifecycle.SavedStateHandle;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import com.hansecom.abt.data.config.RemoteConfig;
import com.hansecom.abt.data.config.guidedTour.GuidedTourPage;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTour;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import timber.log.Timber;

@Metadata
public final class GuidedTourViewModel extends MviViewModel<GuidedTour.Action, GuidedTour.State, GuidedTour.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final Json f37451i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GuidedTourViewModel(SavedStateHandle savedStateHandle, Json json) {
        super(savedStateHandle, new GuidedTour.State((PersistentList) null, 1, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(json, "json");
        this.f37451i = json;
        r(new i(w()));
    }

    public static final GuidedTour.State v(List list, GuidedTour.State state) {
        Intrinsics.i(state, "$this$update");
        return state.a(ExtensionsKt.e(list));
    }

    public final List w() {
        try {
            FirebaseRemoteConfigValue r2 = RemoteConfigKt.a(Firebase.f30878a).r(RemoteConfig.GUIDED_TOUR.j());
            Intrinsics.h(r2, "getValue(...)");
            Json json = this.f37451i;
            String d2 = r2.d();
            Intrinsics.h(d2, "asString(...)");
            json.a();
            return (List) json.b(new ArrayListSerializer(GuidedTourPage.Companion.serializer()), d2);
        } catch (Exception e2) {
            Timber.f44337a.c(e2);
            return CollectionsKt.m();
        }
    }

    /* renamed from: x */
    public Object o(GuidedTour.Action action, Continuation continuation) {
        return Unit.f40552a;
    }
}
