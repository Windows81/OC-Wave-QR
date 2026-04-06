package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class SessionDatastoreImpl implements SessionDatastore {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f31511f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final ReadOnlyProperty f31512g = PreferenceDataStoreDelegateKt.b(SessionDataStoreConfigs.f31505a.a(), new ReplaceFileCorruptionHandler(SessionDatastoreImpl$Companion$dataStore$2.f31523z), (Function1) null, (CoroutineScope) null, 12, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final Context f31513b;

    /* renamed from: c  reason: collision with root package name */
    public final CoroutineContext f31514c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f31515d = new AtomicReference();

    /* renamed from: e  reason: collision with root package name */
    public final Flow f31516e;

    @Metadata
    @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public final /* synthetic */ SessionDatastoreImpl E;

        {
            this.E = r1;
        }

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.E, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Flow g2 = this.E.f31516e;
                final SessionDatastoreImpl sessionDatastoreImpl = this.E;
                AnonymousClass1 r1 = new FlowCollector() {
                    /* renamed from: a */
                    public final Object c(FirebaseSessionsData firebaseSessionsData, Continuation continuation) {
                        sessionDatastoreImpl.f31515d.set(firebaseSessionsData);
                        return Unit.f40552a;
                    }
                };
                this.D = 1;
                if (g2.a(r1, this) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f31522a = {Reflection.j(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DataStore b(Context context) {
            return (DataStore) SessionDatastoreImpl.f31512g.a(context, f31522a[0]);
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class FirebaseSessionDataKeys {

        /* renamed from: a  reason: collision with root package name */
        public static final FirebaseSessionDataKeys f31524a = new FirebaseSessionDataKeys();

        /* renamed from: b  reason: collision with root package name */
        public static final Preferences.Key f31525b = PreferencesKeys.g("session_id");

        public final Preferences.Key a() {
            return f31525b;
        }
    }

    public SessionDatastoreImpl(Context context, CoroutineContext coroutineContext) {
        Intrinsics.i(context, "context");
        Intrinsics.i(coroutineContext, "backgroundDispatcher");
        this.f31513b = context;
        this.f31514c = coroutineContext;
        this.f31516e = new SessionDatastoreImpl$special$$inlined$map$1(FlowKt.h(f31511f.b(context).getData(), new SessionDatastoreImpl$firebaseSessionDataFlow$1((Continuation) null)), this);
        Job unused = BuildersKt__Builders_commonKt.d(CoroutineScopeKt.a(coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, (Continuation) null), 3, (Object) null);
    }

    public String a() {
        FirebaseSessionsData firebaseSessionsData = (FirebaseSessionsData) this.f31515d.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.a();
        }
        return null;
    }

    public void b(String str) {
        Intrinsics.i(str, "sessionId");
        Job unused = BuildersKt__Builders_commonKt.d(CoroutineScopeKt.a(this.f31514c), (CoroutineContext) null, (CoroutineStart) null, new SessionDatastoreImpl$updateSessionId$1(this, str, (Continuation) null), 3, (Object) null);
    }

    public final FirebaseSessionsData i(Preferences preferences) {
        return new FirebaseSessionsData((String) preferences.b(FirebaseSessionDataKeys.f31524a.a()));
    }
}
