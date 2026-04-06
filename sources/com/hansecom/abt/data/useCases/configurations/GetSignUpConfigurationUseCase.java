package com.hansecom.abt.data.useCases.configurations;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import com.hansecom.abt.data.config.RemoteConfig;
import com.hansecom.abt.data.config.signUp.SignUpConfiguration;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import timber.log.Timber;
import u.f;

@Metadata
public final class GetSignUpConfigurationUseCase {

    /* renamed from: a  reason: collision with root package name */
    public final Json f33887a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f33888b = LazyKt.b(new f(this));

    public GetSignUpConfigurationUseCase(Json json) {
        Intrinsics.i(json, "json");
        this.f33887a = json;
    }

    public static final SignUpConfiguration b(GetSignUpConfigurationUseCase getSignUpConfigurationUseCase) {
        try {
            FirebaseRemoteConfigValue r2 = RemoteConfigKt.a(Firebase.f30878a).r(RemoteConfig.SIGN_UP.j());
            Intrinsics.h(r2, "getValue(...)");
            Json json = getSignUpConfigurationUseCase.f33887a;
            String d2 = r2.d();
            Intrinsics.h(d2, "asString(...)");
            json.a();
            return (SignUpConfiguration) json.b(SignUpConfiguration.Companion.serializer(), d2);
        } catch (Throwable th) {
            Timber.f44337a.c(th);
            return new SignUpConfiguration(true, true, false, true, false, true, 2, true, true);
        }
    }

    public final SignUpConfiguration c() {
        return (SignUpConfiguration) this.f33888b.getValue();
    }

    public final Object d(Continuation continuation) {
        return c();
    }
}
