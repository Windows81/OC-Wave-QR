package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.component.AbtComponent;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* access modifiers changed from: private */
    public static /* synthetic */ RemoteConfigComponent lambda$getComponents$0(Qualified qualified, ComponentContainer componentContainer) {
        return new RemoteConfigComponent((Context) componentContainer.a(Context.class), (ScheduledExecutorService) componentContainer.f(qualified), (FirebaseApp) componentContainer.a(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class), ((AbtComponent) componentContainer.a(AbtComponent.class)).b("frc"), componentContainer.c(AnalyticsConnector.class));
    }

    public List<Component<?>> getComponents() {
        Qualified a2 = Qualified.a(Blocking.class, ScheduledExecutorService.class);
        return Arrays.asList(new Component[]{Component.f(RemoteConfigComponent.class, FirebaseRemoteConfigInterop.class).g(LIBRARY_NAME).b(Dependency.j(Context.class)).b(Dependency.i(a2)).b(Dependency.j(FirebaseApp.class)).b(Dependency.j(FirebaseInstallationsApi.class)).b(Dependency.j(AbtComponent.class)).b(Dependency.h(AnalyticsConnector.class)).e(new m(a2)).d().c(), LibraryVersionComponent.b(LIBRARY_NAME, "22.0.0")});
    }
}
