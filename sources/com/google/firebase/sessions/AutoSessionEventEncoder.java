package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

public final class AutoSessionEventEncoder implements Configurator {

    /* renamed from: a  reason: collision with root package name */
    public static final Configurator f31443a = new AutoSessionEventEncoder();

    public static final class AndroidApplicationInfoEncoder implements ObjectEncoder<AndroidApplicationInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final AndroidApplicationInfoEncoder f31444a = new AndroidApplicationInfoEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f31445b = FieldDescriptor.d("packageName");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f31446c = FieldDescriptor.d("versionName");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f31447d = FieldDescriptor.d("appBuildVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f31448e = FieldDescriptor.d("deviceManufacturer");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f31449f = FieldDescriptor.d("currentProcessDetails");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f31450g = FieldDescriptor.d("appProcessDetails");

        /* renamed from: b */
        public void a(AndroidApplicationInfo androidApplicationInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f31445b, androidApplicationInfo.e());
            objectEncoderContext.g(f31446c, androidApplicationInfo.f());
            objectEncoderContext.g(f31447d, androidApplicationInfo.a());
            objectEncoderContext.g(f31448e, androidApplicationInfo.d());
            objectEncoderContext.g(f31449f, androidApplicationInfo.c());
            objectEncoderContext.g(f31450g, androidApplicationInfo.b());
        }
    }

    public static final class ApplicationInfoEncoder implements ObjectEncoder<ApplicationInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final ApplicationInfoEncoder f31451a = new ApplicationInfoEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f31452b = FieldDescriptor.d("appId");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f31453c = FieldDescriptor.d("deviceModel");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f31454d = FieldDescriptor.d("sessionSdkVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f31455e = FieldDescriptor.d("osVersion");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f31456f = FieldDescriptor.d("logEnvironment");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f31457g = FieldDescriptor.d("androidAppInfo");

        /* renamed from: b */
        public void a(ApplicationInfo applicationInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f31452b, applicationInfo.b());
            objectEncoderContext.g(f31453c, applicationInfo.c());
            objectEncoderContext.g(f31454d, applicationInfo.f());
            objectEncoderContext.g(f31455e, applicationInfo.e());
            objectEncoderContext.g(f31456f, applicationInfo.d());
            objectEncoderContext.g(f31457g, applicationInfo.a());
        }
    }

    public static final class DataCollectionStatusEncoder implements ObjectEncoder<DataCollectionStatus> {

        /* renamed from: a  reason: collision with root package name */
        public static final DataCollectionStatusEncoder f31458a = new DataCollectionStatusEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f31459b = FieldDescriptor.d("performance");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f31460c = FieldDescriptor.d("crashlytics");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f31461d = FieldDescriptor.d("sessionSamplingRate");

        /* renamed from: b */
        public void a(DataCollectionStatus dataCollectionStatus, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f31459b, dataCollectionStatus.b());
            objectEncoderContext.g(f31460c, dataCollectionStatus.a());
            objectEncoderContext.d(f31461d, dataCollectionStatus.c());
        }
    }

    public static final class ProcessDetailsEncoder implements ObjectEncoder<ProcessDetails> {

        /* renamed from: a  reason: collision with root package name */
        public static final ProcessDetailsEncoder f31462a = new ProcessDetailsEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f31463b = FieldDescriptor.d("processName");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f31464c = FieldDescriptor.d("pid");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f31465d = FieldDescriptor.d("importance");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f31466e = FieldDescriptor.d("defaultProcess");

        /* renamed from: b */
        public void a(ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f31463b, processDetails.c());
            objectEncoderContext.c(f31464c, processDetails.b());
            objectEncoderContext.c(f31465d, processDetails.a());
            objectEncoderContext.a(f31466e, processDetails.d());
        }
    }

    public static final class SessionEventEncoder implements ObjectEncoder<SessionEvent> {

        /* renamed from: a  reason: collision with root package name */
        public static final SessionEventEncoder f31467a = new SessionEventEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f31468b = FieldDescriptor.d("eventType");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f31469c = FieldDescriptor.d("sessionData");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f31470d = FieldDescriptor.d("applicationInfo");

        /* renamed from: b */
        public void a(SessionEvent sessionEvent, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f31468b, sessionEvent.b());
            objectEncoderContext.g(f31469c, sessionEvent.c());
            objectEncoderContext.g(f31470d, sessionEvent.a());
        }
    }

    public static final class SessionInfoEncoder implements ObjectEncoder<SessionInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final SessionInfoEncoder f31471a = new SessionInfoEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f31472b = FieldDescriptor.d("sessionId");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f31473c = FieldDescriptor.d("firstSessionId");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f31474d = FieldDescriptor.d("sessionIndex");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f31475e = FieldDescriptor.d("eventTimestampUs");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f31476f = FieldDescriptor.d("dataCollectionStatus");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f31477g = FieldDescriptor.d("firebaseInstallationId");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f31478h = FieldDescriptor.d("firebaseAuthenticationToken");

        /* renamed from: b */
        public void a(SessionInfo sessionInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f31472b, sessionInfo.f());
            objectEncoderContext.g(f31473c, sessionInfo.e());
            objectEncoderContext.c(f31474d, sessionInfo.g());
            objectEncoderContext.b(f31475e, sessionInfo.b());
            objectEncoderContext.g(f31476f, sessionInfo.a());
            objectEncoderContext.g(f31477g, sessionInfo.d());
            objectEncoderContext.g(f31478h, sessionInfo.c());
        }
    }

    public void a(EncoderConfig encoderConfig) {
        encoderConfig.a(SessionEvent.class, SessionEventEncoder.f31467a);
        encoderConfig.a(SessionInfo.class, SessionInfoEncoder.f31471a);
        encoderConfig.a(DataCollectionStatus.class, DataCollectionStatusEncoder.f31458a);
        encoderConfig.a(ApplicationInfo.class, ApplicationInfoEncoder.f31451a);
        encoderConfig.a(AndroidApplicationInfo.class, AndroidApplicationInfoEncoder.f31444a);
        encoderConfig.a(ProcessDetails.class, ProcessDetailsEncoder.f31462a);
    }
}
