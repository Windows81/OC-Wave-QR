package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;

public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {

    /* renamed from: a  reason: collision with root package name */
    public static final Configurator f23993a = new AutoProtoEncoderDoNotUseEncoder();

    public static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {

        /* renamed from: a  reason: collision with root package name */
        public static final ClientMetricsEncoder f23994a = new ClientMetricsEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23995b = FieldDescriptor.a("window").b(AtProtobuf.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f23996c = FieldDescriptor.a("logSourceMetrics").b(AtProtobuf.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f23997d = FieldDescriptor.a("globalMetrics").b(AtProtobuf.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f23998e = FieldDescriptor.a("appNamespace").b(AtProtobuf.b().c(4).a()).a();

        /* renamed from: b */
        public void a(ClientMetrics clientMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f23995b, clientMetrics.d());
            objectEncoderContext.g(f23996c, clientMetrics.c());
            objectEncoderContext.g(f23997d, clientMetrics.b());
            objectEncoderContext.g(f23998e, clientMetrics.a());
        }
    }

    public static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {

        /* renamed from: a  reason: collision with root package name */
        public static final GlobalMetricsEncoder f23999a = new GlobalMetricsEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f24000b = FieldDescriptor.a("storageMetrics").b(AtProtobuf.b().c(1).a()).a();

        /* renamed from: b */
        public void a(GlobalMetrics globalMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f24000b, globalMetrics.a());
        }
    }

    public static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {

        /* renamed from: a  reason: collision with root package name */
        public static final LogEventDroppedEncoder f24001a = new LogEventDroppedEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f24002b = FieldDescriptor.a("eventsDroppedCount").b(AtProtobuf.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f24003c = FieldDescriptor.a("reason").b(AtProtobuf.b().c(3).a()).a();

        /* renamed from: b */
        public void a(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.b(f24002b, logEventDropped.a());
            objectEncoderContext.g(f24003c, logEventDropped.b());
        }
    }

    public static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {

        /* renamed from: a  reason: collision with root package name */
        public static final LogSourceMetricsEncoder f24004a = new LogSourceMetricsEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f24005b = FieldDescriptor.a("logSource").b(AtProtobuf.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f24006c = FieldDescriptor.a("logEventDropped").b(AtProtobuf.b().c(2).a()).a();

        /* renamed from: b */
        public void a(LogSourceMetrics logSourceMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f24005b, logSourceMetrics.b());
            objectEncoderContext.g(f24006c, logSourceMetrics.a());
        }
    }

    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* renamed from: a  reason: collision with root package name */
        public static final ProtoEncoderDoNotUseEncoder f24007a = new ProtoEncoderDoNotUseEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f24008b = FieldDescriptor.d("clientMetrics");

        /* renamed from: b */
        public void a(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f24008b, protoEncoderDoNotUse.b());
        }
    }

    public static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {

        /* renamed from: a  reason: collision with root package name */
        public static final StorageMetricsEncoder f24009a = new StorageMetricsEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f24010b = FieldDescriptor.a("currentCacheSizeBytes").b(AtProtobuf.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f24011c = FieldDescriptor.a("maxCacheSizeBytes").b(AtProtobuf.b().c(2).a()).a();

        /* renamed from: b */
        public void a(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.b(f24010b, storageMetrics.a());
            objectEncoderContext.b(f24011c, storageMetrics.b());
        }
    }

    public static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {

        /* renamed from: a  reason: collision with root package name */
        public static final TimeWindowEncoder f24012a = new TimeWindowEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f24013b = FieldDescriptor.a("startMs").b(AtProtobuf.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f24014c = FieldDescriptor.a("endMs").b(AtProtobuf.b().c(2).a()).a();

        /* renamed from: b */
        public void a(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.b(f24013b, timeWindow.b());
            objectEncoderContext.b(f24014c, timeWindow.a());
        }
    }

    public void a(EncoderConfig encoderConfig) {
        encoderConfig.a(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.f24007a);
        encoderConfig.a(ClientMetrics.class, ClientMetricsEncoder.f23994a);
        encoderConfig.a(TimeWindow.class, TimeWindowEncoder.f24012a);
        encoderConfig.a(LogSourceMetrics.class, LogSourceMetricsEncoder.f24004a);
        encoderConfig.a(LogEventDropped.class, LogEventDroppedEncoder.f24001a);
        encoderConfig.a(GlobalMetrics.class, GlobalMetricsEncoder.f23999a);
        encoderConfig.a(StorageMetrics.class, StorageMetricsEncoder.f24009a);
    }
}
