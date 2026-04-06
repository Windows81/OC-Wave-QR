package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntimeComponent;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import javax.inject.Provider;

final class DaggerTransportRuntimeComponent {

    public static final class Builder implements TransportRuntimeComponent.Builder {

        /* renamed from: a  reason: collision with root package name */
        public Context f24051a;

        public Builder() {
        }

        /* renamed from: b */
        public Builder a(Context context) {
            this.f24051a = (Context) Preconditions.b(context);
            return this;
        }

        public TransportRuntimeComponent d() {
            Preconditions.a(this.f24051a, Context.class);
            return new TransportRuntimeComponentImpl(this.f24051a);
        }
    }

    public static final class TransportRuntimeComponentImpl extends TransportRuntimeComponent {

        /* renamed from: A  reason: collision with root package name */
        public Provider f24052A;

        /* renamed from: B  reason: collision with root package name */
        public Provider f24053B;
        public Provider C;
        public Provider D;
        public Provider E;
        public Provider F;
        public Provider G;
        public Provider H;
        public Provider I;
        public Provider J;
        public Provider K;
        public Provider L;
        public Provider M;

        /* renamed from: z  reason: collision with root package name */
        public final TransportRuntimeComponentImpl f24054z;

        public EventStore a() {
            return (EventStore) this.G.get();
        }

        public TransportRuntime b() {
            return (TransportRuntime) this.M.get();
        }

        public final void c(Context context) {
            this.f24052A = DoubleCheck.a(ExecutionModule_ExecutorFactory.a());
            Factory a2 = InstanceFactory.a(context);
            this.f24053B = a2;
            CreationContextFactory_Factory a3 = CreationContextFactory_Factory.a(a2, TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a());
            this.C = a3;
            this.D = DoubleCheck.a(MetadataBackendRegistry_Factory.a(this.f24053B, a3));
            this.E = SchemaManager_Factory.a(this.f24053B, EventStoreModule_DbNameFactory.a(), EventStoreModule_SchemaVersionFactory.a());
            this.F = DoubleCheck.a(EventStoreModule_PackageNameFactory.a(this.f24053B));
            this.G = DoubleCheck.a(SQLiteEventStore_Factory.a(TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a(), EventStoreModule_StoreConfigFactory.a(), this.E, this.F));
            SchedulingConfigModule_ConfigFactory b2 = SchedulingConfigModule_ConfigFactory.b(TimeModule_EventClockFactory.a());
            this.H = b2;
            SchedulingModule_WorkSchedulerFactory a4 = SchedulingModule_WorkSchedulerFactory.a(this.f24053B, this.G, b2, TimeModule_UptimeClockFactory.a());
            this.I = a4;
            Provider provider = this.f24052A;
            Provider provider2 = this.D;
            Provider provider3 = this.G;
            this.J = DefaultScheduler_Factory.a(provider, provider2, a4, provider3, provider3);
            Provider provider4 = this.f24053B;
            Provider provider5 = this.D;
            Provider provider6 = this.G;
            this.K = Uploader_Factory.a(provider4, provider5, provider6, this.I, this.f24052A, provider6, TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a(), this.G);
            Provider provider7 = this.f24052A;
            Provider provider8 = this.G;
            this.L = WorkInitializer_Factory.a(provider7, provider8, this.I, provider8);
            this.M = DoubleCheck.a(TransportRuntime_Factory.a(TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a(), this.J, this.K, this.L));
        }

        public TransportRuntimeComponentImpl(Context context) {
            this.f24054z = this;
            c(context);
        }
    }

    public static TransportRuntimeComponent.Builder a() {
        return new Builder();
    }
}
