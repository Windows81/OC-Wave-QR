package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        FirebaseSessionsDependencies.a(SessionSubscriber.Name.CRASHLYTICS);
    }

    public final FirebaseCrashlytics b(ComponentContainer componentContainer) {
        return FirebaseCrashlytics.b((FirebaseApp) componentContainer.a(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class), componentContainer.i(CrashlyticsNativeComponent.class), componentContainer.i(AnalyticsConnector.class), componentContainer.i(FirebaseRemoteConfigInterop.class));
    }

    public List getComponents() {
        return Arrays.asList(new Component[]{Component.e(FirebaseCrashlytics.class).g("fire-cls").b(Dependency.j(FirebaseApp.class)).b(Dependency.j(FirebaseInstallationsApi.class)).b(Dependency.a(CrashlyticsNativeComponent.class)).b(Dependency.a(AnalyticsConnector.class)).b(Dependency.a(FirebaseRemoteConfigInterop.class)).e(new d(this)).d().c(), LibraryVersionComponent.b("fire-cls", "19.0.3")});
    }
}
