package com.google.firebase.perf;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import o.a;
import o.b;

public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebasePerfEarly lambda$getComponents$0(Qualified qualified, ComponentContainer componentContainer) {
        return new FirebasePerfEarly((FirebaseApp) componentContainer.a(FirebaseApp.class), (StartupTime) componentContainer.c(StartupTime.class).get(), (Executor) componentContainer.f(qualified));
    }

    /* access modifiers changed from: private */
    public static FirebasePerformance providesFirebasePerformance(ComponentContainer componentContainer) {
        componentContainer.a(FirebasePerfEarly.class);
        return DaggerFirebasePerformanceComponent.b().b(new FirebasePerformanceModule((FirebaseApp) componentContainer.a(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class), componentContainer.c(RemoteConfigComponent.class), componentContainer.c(TransportFactory.class))).a().a();
    }

    public List<Component<?>> getComponents() {
        Qualified a2 = Qualified.a(UiThread.class, Executor.class);
        Class<FirebaseApp> cls = FirebaseApp.class;
        Class<FirebasePerfEarly> cls2 = FirebasePerfEarly.class;
        return Arrays.asList(new Component[]{Component.e(FirebasePerformance.class).g(LIBRARY_NAME).b(Dependency.j(cls)).b(Dependency.l(RemoteConfigComponent.class)).b(Dependency.j(FirebaseInstallationsApi.class)).b(Dependency.l(TransportFactory.class)).b(Dependency.j(cls2)).e(new a()).c(), Component.e(cls2).g(EARLY_LIBRARY_NAME).b(Dependency.j(cls)).b(Dependency.h(StartupTime.class)).b(Dependency.i(a2)).d().e(new b(a2)).c(), LibraryVersionComponent.b(LIBRARY_NAME, "21.0.1")});
    }
}
