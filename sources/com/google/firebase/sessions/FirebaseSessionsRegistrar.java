package com.google.firebase.sessions;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final Qualified<CoroutineDispatcher> backgroundDispatcher;
    private static final Qualified<CoroutineDispatcher> blockingDispatcher;
    private static final Qualified<FirebaseApp> firebaseApp;
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi;
    private static final Qualified<SessionLifecycleServiceBinder> sessionLifecycleServiceBinder;
    private static final Qualified<SessionsSettings> sessionsSettings;
    private static final Qualified<TransportFactory> transportFactory;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        Qualified<FirebaseApp> b2 = Qualified.b(FirebaseApp.class);
        Intrinsics.h(b2, "unqualified(FirebaseApp::class.java)");
        firebaseApp = b2;
        Qualified<FirebaseInstallationsApi> b3 = Qualified.b(FirebaseInstallationsApi.class);
        Intrinsics.h(b3, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = b3;
        Class<CoroutineDispatcher> cls = CoroutineDispatcher.class;
        Qualified<CoroutineDispatcher> a2 = Qualified.a(Background.class, cls);
        Intrinsics.h(a2, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = a2;
        Qualified<CoroutineDispatcher> a3 = Qualified.a(Blocking.class, cls);
        Intrinsics.h(a3, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = a3;
        Qualified<TransportFactory> b4 = Qualified.b(TransportFactory.class);
        Intrinsics.h(b4, "unqualified(TransportFactory::class.java)");
        transportFactory = b4;
        Qualified<SessionsSettings> b5 = Qualified.b(SessionsSettings.class);
        Intrinsics.h(b5, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = b5;
        Qualified<SessionLifecycleServiceBinder> b6 = Qualified.b(SessionLifecycleServiceBinder.class);
        Intrinsics.h(b6, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = b6;
    }

    /* access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda$0(ComponentContainer componentContainer) {
        Object f2 = componentContainer.f(firebaseApp);
        Intrinsics.h(f2, "container[firebaseApp]");
        Object f3 = componentContainer.f(sessionsSettings);
        Intrinsics.h(f3, "container[sessionsSettings]");
        Object f4 = componentContainer.f(backgroundDispatcher);
        Intrinsics.h(f4, "container[backgroundDispatcher]");
        Object f5 = componentContainer.f(sessionLifecycleServiceBinder);
        Intrinsics.h(f5, "container[sessionLifecycleServiceBinder]");
        return new FirebaseSessions((FirebaseApp) f2, (SessionsSettings) f3, (CoroutineContext) f4, (SessionLifecycleServiceBinder) f5);
    }

    /* access modifiers changed from: private */
    public static final SessionGenerator getComponents$lambda$1(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.f31576a, (Function0) null, 2, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final SessionFirelogPublisher getComponents$lambda$2(ComponentContainer componentContainer) {
        Object f2 = componentContainer.f(firebaseApp);
        Intrinsics.h(f2, "container[firebaseApp]");
        Object f3 = componentContainer.f(firebaseInstallationsApi);
        Intrinsics.h(f3, "container[firebaseInstallationsApi]");
        Object f4 = componentContainer.f(sessionsSettings);
        Intrinsics.h(f4, "container[sessionsSettings]");
        Provider b2 = componentContainer.b(transportFactory);
        Intrinsics.h(b2, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger(b2);
        Object f5 = componentContainer.f(backgroundDispatcher);
        Intrinsics.h(f5, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl((FirebaseApp) f2, (FirebaseInstallationsApi) f3, (SessionsSettings) f4, eventGDTLogger, (CoroutineContext) f5);
    }

    /* access modifiers changed from: private */
    public static final SessionsSettings getComponents$lambda$3(ComponentContainer componentContainer) {
        Object f2 = componentContainer.f(firebaseApp);
        Intrinsics.h(f2, "container[firebaseApp]");
        Object f3 = componentContainer.f(blockingDispatcher);
        Intrinsics.h(f3, "container[blockingDispatcher]");
        Object f4 = componentContainer.f(backgroundDispatcher);
        Intrinsics.h(f4, "container[backgroundDispatcher]");
        Object f5 = componentContainer.f(firebaseInstallationsApi);
        Intrinsics.h(f5, "container[firebaseInstallationsApi]");
        return new SessionsSettings((FirebaseApp) f2, (CoroutineContext) f3, (CoroutineContext) f4, (FirebaseInstallationsApi) f5);
    }

    /* access modifiers changed from: private */
    public static final SessionDatastore getComponents$lambda$4(ComponentContainer componentContainer) {
        Context k2 = ((FirebaseApp) componentContainer.f(firebaseApp)).k();
        Intrinsics.h(k2, "container[firebaseApp].applicationContext");
        Object f2 = componentContainer.f(backgroundDispatcher);
        Intrinsics.h(f2, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(k2, (CoroutineContext) f2);
    }

    /* access modifiers changed from: private */
    public static final SessionLifecycleServiceBinder getComponents$lambda$5(ComponentContainer componentContainer) {
        Object f2 = componentContainer.f(firebaseApp);
        Intrinsics.h(f2, "container[firebaseApp]");
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) f2);
    }

    public List<Component<? extends Object>> getComponents() {
        Component.Builder g2 = Component.e(FirebaseSessions.class).g(LIBRARY_NAME);
        Qualified<FirebaseApp> qualified = firebaseApp;
        Component.Builder b2 = g2.b(Dependency.i(qualified));
        Qualified<SessionsSettings> qualified2 = sessionsSettings;
        Component.Builder b3 = b2.b(Dependency.i(qualified2));
        Qualified<CoroutineDispatcher> qualified3 = backgroundDispatcher;
        Component c2 = b3.b(Dependency.i(qualified3)).b(Dependency.i(sessionLifecycleServiceBinder)).e(new c()).d().c();
        Component c3 = Component.e(SessionGenerator.class).g("session-generator").e(new d()).c();
        Component.Builder b4 = Component.e(SessionFirelogPublisher.class).g("session-publisher").b(Dependency.i(qualified));
        Qualified<FirebaseInstallationsApi> qualified4 = firebaseInstallationsApi;
        return CollectionsKt.p(c2, c3, b4.b(Dependency.i(qualified4)).b(Dependency.i(qualified2)).b(Dependency.k(transportFactory)).b(Dependency.i(qualified3)).e(new e()).c(), Component.e(SessionsSettings.class).g("sessions-settings").b(Dependency.i(qualified)).b(Dependency.i(blockingDispatcher)).b(Dependency.i(qualified3)).b(Dependency.i(qualified4)).e(new f()).c(), Component.e(SessionDatastore.class).g("sessions-datastore").b(Dependency.i(qualified)).b(Dependency.i(qualified3)).e(new g()).c(), Component.e(SessionLifecycleServiceBinder.class).g("sessions-service-binder").b(Dependency.i(qualified)).e(new h()).c(), LibraryVersionComponent.b(LIBRARY_NAME, "2.0.3"));
    }
}
