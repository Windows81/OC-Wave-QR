package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

public final class AutoBatchedLogRequestEncoder implements Configurator {

    /* renamed from: a  reason: collision with root package name */
    public static final Configurator f23850a = new AutoBatchedLogRequestEncoder();

    public static final class AndroidClientInfoEncoder implements ObjectEncoder<AndroidClientInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final AndroidClientInfoEncoder f23851a = new AndroidClientInfoEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23852b = FieldDescriptor.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f23853c = FieldDescriptor.d("model");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f23854d = FieldDescriptor.d("hardware");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f23855e = FieldDescriptor.d("device");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f23856f = FieldDescriptor.d("product");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f23857g = FieldDescriptor.d("osBuild");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f23858h = FieldDescriptor.d("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        public static final FieldDescriptor f23859i = FieldDescriptor.d("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        public static final FieldDescriptor f23860j = FieldDescriptor.d("locale");

        /* renamed from: k  reason: collision with root package name */
        public static final FieldDescriptor f23861k = FieldDescriptor.d("country");

        /* renamed from: l  reason: collision with root package name */
        public static final FieldDescriptor f23862l = FieldDescriptor.d("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        public static final FieldDescriptor f23863m = FieldDescriptor.d("applicationBuild");

        /* renamed from: b */
        public void a(AndroidClientInfo androidClientInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f23852b, androidClientInfo.m());
            objectEncoderContext.g(f23853c, androidClientInfo.j());
            objectEncoderContext.g(f23854d, androidClientInfo.f());
            objectEncoderContext.g(f23855e, androidClientInfo.d());
            objectEncoderContext.g(f23856f, androidClientInfo.l());
            objectEncoderContext.g(f23857g, androidClientInfo.k());
            objectEncoderContext.g(f23858h, androidClientInfo.h());
            objectEncoderContext.g(f23859i, androidClientInfo.e());
            objectEncoderContext.g(f23860j, androidClientInfo.g());
            objectEncoderContext.g(f23861k, androidClientInfo.c());
            objectEncoderContext.g(f23862l, androidClientInfo.i());
            objectEncoderContext.g(f23863m, androidClientInfo.b());
        }
    }

    public static final class BatchedLogRequestEncoder implements ObjectEncoder<BatchedLogRequest> {

        /* renamed from: a  reason: collision with root package name */
        public static final BatchedLogRequestEncoder f23864a = new BatchedLogRequestEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23865b = FieldDescriptor.d("logRequest");

        /* renamed from: b */
        public void a(BatchedLogRequest batchedLogRequest, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f23865b, batchedLogRequest.c());
        }
    }

    public static final class ClientInfoEncoder implements ObjectEncoder<ClientInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final ClientInfoEncoder f23866a = new ClientInfoEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23867b = FieldDescriptor.d("clientType");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f23868c = FieldDescriptor.d("androidClientInfo");

        /* renamed from: b */
        public void a(ClientInfo clientInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f23867b, clientInfo.c());
            objectEncoderContext.g(f23868c, clientInfo.b());
        }
    }

    public static final class ComplianceDataEncoder implements ObjectEncoder<ComplianceData> {

        /* renamed from: a  reason: collision with root package name */
        public static final ComplianceDataEncoder f23869a = new ComplianceDataEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23870b = FieldDescriptor.d("privacyContext");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f23871c = FieldDescriptor.d("productIdOrigin");

        /* renamed from: b */
        public void a(ComplianceData complianceData, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f23870b, complianceData.b());
            objectEncoderContext.g(f23871c, complianceData.c());
        }
    }

    public static final class ExperimentIdsEncoder implements ObjectEncoder<ExperimentIds> {

        /* renamed from: a  reason: collision with root package name */
        public static final ExperimentIdsEncoder f23872a = new ExperimentIdsEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23873b = FieldDescriptor.d("clearBlob");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f23874c = FieldDescriptor.d("encryptedBlob");

        /* renamed from: b */
        public void a(ExperimentIds experimentIds, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f23873b, experimentIds.b());
            objectEncoderContext.g(f23874c, experimentIds.c());
        }
    }

    public static final class ExternalPRequestContextEncoder implements ObjectEncoder<ExternalPRequestContext> {

        /* renamed from: a  reason: collision with root package name */
        public static final ExternalPRequestContextEncoder f23875a = new ExternalPRequestContextEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23876b = FieldDescriptor.d("originAssociatedProductId");

        /* renamed from: b */
        public void a(ExternalPRequestContext externalPRequestContext, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f23876b, externalPRequestContext.b());
        }
    }

    public static final class ExternalPrivacyContextEncoder implements ObjectEncoder<ExternalPrivacyContext> {

        /* renamed from: a  reason: collision with root package name */
        public static final ExternalPrivacyContextEncoder f23877a = new ExternalPrivacyContextEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23878b = FieldDescriptor.d("prequest");

        /* renamed from: b */
        public void a(ExternalPrivacyContext externalPrivacyContext, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f23878b, externalPrivacyContext.b());
        }
    }

    public static final class LogEventEncoder implements ObjectEncoder<LogEvent> {

        /* renamed from: a  reason: collision with root package name */
        public static final LogEventEncoder f23879a = new LogEventEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23880b = FieldDescriptor.d("eventTimeMs");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f23881c = FieldDescriptor.d("eventCode");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f23882d = FieldDescriptor.d("complianceData");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f23883e = FieldDescriptor.d("eventUptimeMs");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f23884f = FieldDescriptor.d("sourceExtension");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f23885g = FieldDescriptor.d("sourceExtensionJsonProto3");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f23886h = FieldDescriptor.d("timezoneOffsetSeconds");

        /* renamed from: i  reason: collision with root package name */
        public static final FieldDescriptor f23887i = FieldDescriptor.d("networkConnectionInfo");

        /* renamed from: j  reason: collision with root package name */
        public static final FieldDescriptor f23888j = FieldDescriptor.d("experimentIds");

        /* renamed from: b */
        public void a(LogEvent logEvent, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.b(f23880b, logEvent.d());
            objectEncoderContext.g(f23881c, logEvent.c());
            objectEncoderContext.g(f23882d, logEvent.b());
            objectEncoderContext.b(f23883e, logEvent.e());
            objectEncoderContext.g(f23884f, logEvent.h());
            objectEncoderContext.g(f23885g, logEvent.i());
            objectEncoderContext.b(f23886h, logEvent.j());
            objectEncoderContext.g(f23887i, logEvent.g());
            objectEncoderContext.g(f23888j, logEvent.f());
        }
    }

    public static final class LogRequestEncoder implements ObjectEncoder<LogRequest> {

        /* renamed from: a  reason: collision with root package name */
        public static final LogRequestEncoder f23889a = new LogRequestEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23890b = FieldDescriptor.d("requestTimeMs");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f23891c = FieldDescriptor.d("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f23892d = FieldDescriptor.d("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f23893e = FieldDescriptor.d("logSource");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f23894f = FieldDescriptor.d("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f23895g = FieldDescriptor.d("logEvent");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f23896h = FieldDescriptor.d("qosTier");

        /* renamed from: b */
        public void a(LogRequest logRequest, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.b(f23890b, logRequest.g());
            objectEncoderContext.b(f23891c, logRequest.h());
            objectEncoderContext.g(f23892d, logRequest.b());
            objectEncoderContext.g(f23893e, logRequest.d());
            objectEncoderContext.g(f23894f, logRequest.e());
            objectEncoderContext.g(f23895g, logRequest.c());
            objectEncoderContext.g(f23896h, logRequest.f());
        }
    }

    public static final class NetworkConnectionInfoEncoder implements ObjectEncoder<NetworkConnectionInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final NetworkConnectionInfoEncoder f23897a = new NetworkConnectionInfoEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f23898b = FieldDescriptor.d("networkType");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f23899c = FieldDescriptor.d("mobileSubtype");

        /* renamed from: b */
        public void a(NetworkConnectionInfo networkConnectionInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f23898b, networkConnectionInfo.c());
            objectEncoderContext.g(f23899c, networkConnectionInfo.b());
        }
    }

    public void a(EncoderConfig encoderConfig) {
        BatchedLogRequestEncoder batchedLogRequestEncoder = BatchedLogRequestEncoder.f23864a;
        encoderConfig.a(BatchedLogRequest.class, batchedLogRequestEncoder);
        encoderConfig.a(AutoValue_BatchedLogRequest.class, batchedLogRequestEncoder);
        LogRequestEncoder logRequestEncoder = LogRequestEncoder.f23889a;
        encoderConfig.a(LogRequest.class, logRequestEncoder);
        encoderConfig.a(AutoValue_LogRequest.class, logRequestEncoder);
        ClientInfoEncoder clientInfoEncoder = ClientInfoEncoder.f23866a;
        encoderConfig.a(ClientInfo.class, clientInfoEncoder);
        encoderConfig.a(AutoValue_ClientInfo.class, clientInfoEncoder);
        AndroidClientInfoEncoder androidClientInfoEncoder = AndroidClientInfoEncoder.f23851a;
        encoderConfig.a(AndroidClientInfo.class, androidClientInfoEncoder);
        encoderConfig.a(AutoValue_AndroidClientInfo.class, androidClientInfoEncoder);
        LogEventEncoder logEventEncoder = LogEventEncoder.f23879a;
        encoderConfig.a(LogEvent.class, logEventEncoder);
        encoderConfig.a(AutoValue_LogEvent.class, logEventEncoder);
        ComplianceDataEncoder complianceDataEncoder = ComplianceDataEncoder.f23869a;
        encoderConfig.a(ComplianceData.class, complianceDataEncoder);
        encoderConfig.a(AutoValue_ComplianceData.class, complianceDataEncoder);
        ExternalPrivacyContextEncoder externalPrivacyContextEncoder = ExternalPrivacyContextEncoder.f23877a;
        encoderConfig.a(ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        encoderConfig.a(AutoValue_ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        ExternalPRequestContextEncoder externalPRequestContextEncoder = ExternalPRequestContextEncoder.f23875a;
        encoderConfig.a(ExternalPRequestContext.class, externalPRequestContextEncoder);
        encoderConfig.a(AutoValue_ExternalPRequestContext.class, externalPRequestContextEncoder);
        NetworkConnectionInfoEncoder networkConnectionInfoEncoder = NetworkConnectionInfoEncoder.f23897a;
        encoderConfig.a(NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        encoderConfig.a(AutoValue_NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        ExperimentIdsEncoder experimentIdsEncoder = ExperimentIdsEncoder.f23872a;
        encoderConfig.a(ExperimentIds.class, experimentIdsEncoder);
        encoderConfig.a(AutoValue_ExperimentIds.class, experimentIdsEncoder);
    }
}
