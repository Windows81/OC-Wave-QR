package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {

    /* renamed from: a  reason: collision with root package name */
    public final UserMetadata f29910a;

    public CrashlyticsRemoteConfigListener(UserMetadata userMetadata) {
        Intrinsics.i(userMetadata, "userMetadata");
        this.f29910a = userMetadata;
    }

    public void a(RolloutsState rolloutsState) {
        Intrinsics.i(rolloutsState, "rolloutsState");
        UserMetadata userMetadata = this.f29910a;
        Set b2 = rolloutsState.b();
        Intrinsics.h(b2, "rolloutsState.rolloutAssignments");
        Iterable<RolloutAssignment> iterable = b2;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
        for (RolloutAssignment rolloutAssignment : iterable) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.b(rolloutAssignment.d(), rolloutAssignment.b(), rolloutAssignment.c(), rolloutAssignment.f(), rolloutAssignment.e()));
        }
        userMetadata.n(arrayList);
        Logger.f().b("Updated Crashlytics Rollout State");
    }
}
