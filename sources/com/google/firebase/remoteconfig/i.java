package com.google.firebase.remoteconfig;

import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.Personalization;

public final /* synthetic */ class i implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Personalization f31245a;

    public /* synthetic */ i(Personalization personalization) {
        this.f31245a = personalization;
    }

    public final void a(Object obj, Object obj2) {
        this.f31245a.a((String) obj, (ConfigContainer) obj2);
    }
}
