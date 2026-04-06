package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseInstallationsApi lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseInstallations((FirebaseApp) componentContainer.a(FirebaseApp.class), componentContainer.c(HeartBeatController.class), (ExecutorService) componentContainer.f(Qualified.a(Background.class, ExecutorService.class)), FirebaseExecutors.b((Executor) componentContainer.f(Qualified.a(Blocking.class, Executor.class))));
    }

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.e(FirebaseInstallationsApi.class).g(LIBRARY_NAME).b(Dependency.j(FirebaseApp.class)).b(Dependency.h(HeartBeatController.class)).b(Dependency.i(Qualified.a(Background.class, ExecutorService.class))).b(Dependency.i(Qualified.a(Blocking.class, Executor.class))).e(new e()).c(), HeartBeatConsumerComponent.a(), LibraryVersionComponent.b(LIBRARY_NAME, "18.0.0")});
    }
}
