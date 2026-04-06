package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

public final class AutoCrashlyticsReportEncoder implements Configurator {

    /* renamed from: a  reason: collision with root package name */
    public static final Configurator f30175a = new AutoCrashlyticsReportEncoder();

    public static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder f30176a = new CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30177b = FieldDescriptor.d("arch");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30178c = FieldDescriptor.d("libraryName");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30179d = FieldDescriptor.d("buildId");

        /* renamed from: b */
        public void a(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30177b, buildIdMappingForArch.b());
            objectEncoderContext.g(f30178c, buildIdMappingForArch.d());
            objectEncoderContext.g(f30179d, buildIdMappingForArch.c());
        }
    }

    public static final class CrashlyticsReportApplicationExitInfoEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportApplicationExitInfoEncoder f30180a = new CrashlyticsReportApplicationExitInfoEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30181b = FieldDescriptor.d("pid");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30182c = FieldDescriptor.d("processName");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30183d = FieldDescriptor.d("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30184e = FieldDescriptor.d("importance");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30185f = FieldDescriptor.d("pss");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f30186g = FieldDescriptor.d("rss");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f30187h = FieldDescriptor.d("timestamp");

        /* renamed from: i  reason: collision with root package name */
        public static final FieldDescriptor f30188i = FieldDescriptor.d("traceFile");

        /* renamed from: j  reason: collision with root package name */
        public static final FieldDescriptor f30189j = FieldDescriptor.d("buildIdMappingForArch");

        /* renamed from: b */
        public void a(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.c(f30181b, applicationExitInfo.d());
            objectEncoderContext.g(f30182c, applicationExitInfo.e());
            objectEncoderContext.c(f30183d, applicationExitInfo.g());
            objectEncoderContext.c(f30184e, applicationExitInfo.c());
            objectEncoderContext.b(f30185f, applicationExitInfo.f());
            objectEncoderContext.b(f30186g, applicationExitInfo.h());
            objectEncoderContext.b(f30187h, applicationExitInfo.i());
            objectEncoderContext.g(f30188i, applicationExitInfo.j());
            objectEncoderContext.g(f30189j, applicationExitInfo.b());
        }
    }

    public static final class CrashlyticsReportCustomAttributeEncoder implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportCustomAttributeEncoder f30190a = new CrashlyticsReportCustomAttributeEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30191b = FieldDescriptor.d("key");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30192c = FieldDescriptor.d("value");

        /* renamed from: b */
        public void a(CrashlyticsReport.CustomAttribute customAttribute, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30191b, customAttribute.b());
            objectEncoderContext.g(f30192c, customAttribute.c());
        }
    }

    public static final class CrashlyticsReportEncoder implements ObjectEncoder<CrashlyticsReport> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportEncoder f30193a = new CrashlyticsReportEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30194b = FieldDescriptor.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30195c = FieldDescriptor.d("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30196d = FieldDescriptor.d("platform");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30197e = FieldDescriptor.d("installationUuid");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30198f = FieldDescriptor.d("firebaseInstallationId");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f30199g = FieldDescriptor.d("firebaseAuthenticationToken");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f30200h = FieldDescriptor.d("appQualitySessionId");

        /* renamed from: i  reason: collision with root package name */
        public static final FieldDescriptor f30201i = FieldDescriptor.d("buildVersion");

        /* renamed from: j  reason: collision with root package name */
        public static final FieldDescriptor f30202j = FieldDescriptor.d("displayVersion");

        /* renamed from: k  reason: collision with root package name */
        public static final FieldDescriptor f30203k = FieldDescriptor.d("session");

        /* renamed from: l  reason: collision with root package name */
        public static final FieldDescriptor f30204l = FieldDescriptor.d("ndkPayload");

        /* renamed from: m  reason: collision with root package name */
        public static final FieldDescriptor f30205m = FieldDescriptor.d("appExitInfo");

        /* renamed from: b */
        public void a(CrashlyticsReport crashlyticsReport, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30194b, crashlyticsReport.m());
            objectEncoderContext.g(f30195c, crashlyticsReport.i());
            objectEncoderContext.c(f30196d, crashlyticsReport.l());
            objectEncoderContext.g(f30197e, crashlyticsReport.j());
            objectEncoderContext.g(f30198f, crashlyticsReport.h());
            objectEncoderContext.g(f30199g, crashlyticsReport.g());
            objectEncoderContext.g(f30200h, crashlyticsReport.d());
            objectEncoderContext.g(f30201i, crashlyticsReport.e());
            objectEncoderContext.g(f30202j, crashlyticsReport.f());
            objectEncoderContext.g(f30203k, crashlyticsReport.n());
            objectEncoderContext.g(f30204l, crashlyticsReport.k());
            objectEncoderContext.g(f30205m, crashlyticsReport.c());
        }
    }

    public static final class CrashlyticsReportFilesPayloadEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportFilesPayloadEncoder f30206a = new CrashlyticsReportFilesPayloadEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30207b = FieldDescriptor.d("files");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30208c = FieldDescriptor.d("orgId");

        /* renamed from: b */
        public void a(CrashlyticsReport.FilesPayload filesPayload, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30207b, filesPayload.b());
            objectEncoderContext.g(f30208c, filesPayload.c());
        }
    }

    public static final class CrashlyticsReportFilesPayloadFileEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportFilesPayloadFileEncoder f30209a = new CrashlyticsReportFilesPayloadFileEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30210b = FieldDescriptor.d("filename");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30211c = FieldDescriptor.d("contents");

        /* renamed from: b */
        public void a(CrashlyticsReport.FilesPayload.File file, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30210b, file.c());
            objectEncoderContext.g(f30211c, file.b());
        }
    }

    public static final class CrashlyticsReportSessionApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionApplicationEncoder f30212a = new CrashlyticsReportSessionApplicationEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30213b = FieldDescriptor.d("identifier");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30214c = FieldDescriptor.d("version");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30215d = FieldDescriptor.d("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30216e = FieldDescriptor.d("organization");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30217f = FieldDescriptor.d("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f30218g = FieldDescriptor.d("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f30219h = FieldDescriptor.d("developmentPlatformVersion");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Application application, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30213b, application.e());
            objectEncoderContext.g(f30214c, application.h());
            objectEncoderContext.g(f30215d, application.d());
            objectEncoderContext.g(f30216e, application.g());
            objectEncoderContext.g(f30217f, application.f());
            objectEncoderContext.g(f30218g, application.b());
            objectEncoderContext.g(f30219h, application.c());
        }
    }

    public static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionApplicationOrganizationEncoder f30220a = new CrashlyticsReportSessionApplicationOrganizationEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30221b = FieldDescriptor.d("clsId");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Application.Organization organization, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30221b, organization.a());
        }
    }

    public static final class CrashlyticsReportSessionDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Device> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionDeviceEncoder f30222a = new CrashlyticsReportSessionDeviceEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30223b = FieldDescriptor.d("arch");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30224c = FieldDescriptor.d("model");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30225d = FieldDescriptor.d("cores");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30226e = FieldDescriptor.d("ram");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30227f = FieldDescriptor.d("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f30228g = FieldDescriptor.d("simulator");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f30229h = FieldDescriptor.d("state");

        /* renamed from: i  reason: collision with root package name */
        public static final FieldDescriptor f30230i = FieldDescriptor.d("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        public static final FieldDescriptor f30231j = FieldDescriptor.d("modelClass");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Device device, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.c(f30223b, device.b());
            objectEncoderContext.g(f30224c, device.f());
            objectEncoderContext.c(f30225d, device.c());
            objectEncoderContext.b(f30226e, device.h());
            objectEncoderContext.b(f30227f, device.d());
            objectEncoderContext.a(f30228g, device.j());
            objectEncoderContext.c(f30229h, device.i());
            objectEncoderContext.g(f30230i, device.e());
            objectEncoderContext.g(f30231j, device.g());
        }
    }

    public static final class CrashlyticsReportSessionEncoder implements ObjectEncoder<CrashlyticsReport.Session> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEncoder f30232a = new CrashlyticsReportSessionEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30233b = FieldDescriptor.d("generator");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30234c = FieldDescriptor.d("identifier");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30235d = FieldDescriptor.d("appQualitySessionId");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30236e = FieldDescriptor.d("startedAt");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30237f = FieldDescriptor.d("endedAt");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f30238g = FieldDescriptor.d("crashed");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f30239h = FieldDescriptor.d("app");

        /* renamed from: i  reason: collision with root package name */
        public static final FieldDescriptor f30240i = FieldDescriptor.d("user");

        /* renamed from: j  reason: collision with root package name */
        public static final FieldDescriptor f30241j = FieldDescriptor.d("os");

        /* renamed from: k  reason: collision with root package name */
        public static final FieldDescriptor f30242k = FieldDescriptor.d("device");

        /* renamed from: l  reason: collision with root package name */
        public static final FieldDescriptor f30243l = FieldDescriptor.d("events");

        /* renamed from: m  reason: collision with root package name */
        public static final FieldDescriptor f30244m = FieldDescriptor.d("generatorType");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session session, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30233b, session.g());
            objectEncoderContext.g(f30234c, session.j());
            objectEncoderContext.g(f30235d, session.c());
            objectEncoderContext.b(f30236e, session.l());
            objectEncoderContext.g(f30237f, session.e());
            objectEncoderContext.a(f30238g, session.n());
            objectEncoderContext.g(f30239h, session.b());
            objectEncoderContext.g(f30240i, session.m());
            objectEncoderContext.g(f30241j, session.k());
            objectEncoderContext.g(f30242k, session.d());
            objectEncoderContext.g(f30243l, session.f());
            objectEncoderContext.c(f30244m, session.h());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationEncoder f30245a = new CrashlyticsReportSessionEventApplicationEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30246b = FieldDescriptor.d("execution");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30247c = FieldDescriptor.d("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30248d = FieldDescriptor.d("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30249e = FieldDescriptor.d("background");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30250f = FieldDescriptor.d("currentProcessDetails");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f30251g = FieldDescriptor.d("appProcessDetails");

        /* renamed from: h  reason: collision with root package name */
        public static final FieldDescriptor f30252h = FieldDescriptor.d("uiOrientation");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application application, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30246b, application.f());
            objectEncoderContext.g(f30247c, application.e());
            objectEncoderContext.g(f30248d, application.g());
            objectEncoderContext.g(f30249e, application.c());
            objectEncoderContext.g(f30250f, application.d());
            objectEncoderContext.g(f30251g, application.b());
            objectEncoderContext.c(f30252h, application.h());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder f30253a = new CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30254b = FieldDescriptor.d("baseAddress");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30255c = FieldDescriptor.d("size");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30256d = FieldDescriptor.d("name");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30257e = FieldDescriptor.d("uuid");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.b(f30254b, binaryImage.b());
            objectEncoderContext.b(f30255c, binaryImage.d());
            objectEncoderContext.g(f30256d, binaryImage.c());
            objectEncoderContext.g(f30257e, binaryImage.f());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionEncoder f30258a = new CrashlyticsReportSessionEventApplicationExecutionEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30259b = FieldDescriptor.d("threads");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30260c = FieldDescriptor.d("exception");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30261d = FieldDescriptor.d("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30262e = FieldDescriptor.d("signal");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30263f = FieldDescriptor.d("binaries");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution execution, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30259b, execution.f());
            objectEncoderContext.g(f30260c, execution.d());
            objectEncoderContext.g(f30261d, execution.b());
            objectEncoderContext.g(f30262e, execution.e());
            objectEncoderContext.g(f30263f, execution.c());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder f30264a = new CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30265b = FieldDescriptor.d("type");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30266c = FieldDescriptor.d("reason");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30267d = FieldDescriptor.d("frames");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30268e = FieldDescriptor.d("causedBy");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30269f = FieldDescriptor.d("overflowCount");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30265b, exception.f());
            objectEncoderContext.g(f30266c, exception.e());
            objectEncoderContext.g(f30267d, exception.c());
            objectEncoderContext.g(f30268e, exception.b());
            objectEncoderContext.c(f30269f, exception.d());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder f30270a = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30271b = FieldDescriptor.d("name");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30272c = FieldDescriptor.d("code");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30273d = FieldDescriptor.d("address");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30271b, signal.d());
            objectEncoderContext.g(f30272c, signal.c());
            objectEncoderContext.b(f30273d, signal.b());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder f30274a = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30275b = FieldDescriptor.d("name");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30276c = FieldDescriptor.d("importance");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30277d = FieldDescriptor.d("frames");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30275b, thread.d());
            objectEncoderContext.c(f30276c, thread.c());
            objectEncoderContext.g(f30277d, thread.b());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder f30278a = new CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30279b = FieldDescriptor.d("pc");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30280c = FieldDescriptor.d("symbol");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30281d = FieldDescriptor.d("file");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30282e = FieldDescriptor.d("offset");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30283f = FieldDescriptor.d("importance");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.b(f30279b, frame.e());
            objectEncoderContext.g(f30280c, frame.f());
            objectEncoderContext.g(f30281d, frame.b());
            objectEncoderContext.b(f30282e, frame.d());
            objectEncoderContext.c(f30283f, frame.c());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationProcessDetailsEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.ProcessDetails> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationProcessDetailsEncoder f30284a = new CrashlyticsReportSessionEventApplicationProcessDetailsEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30285b = FieldDescriptor.d("processName");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30286c = FieldDescriptor.d("pid");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30287d = FieldDescriptor.d("importance");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30288e = FieldDescriptor.d("defaultProcess");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30285b, processDetails.d());
            objectEncoderContext.c(f30286c, processDetails.c());
            objectEncoderContext.c(f30287d, processDetails.b());
            objectEncoderContext.a(f30288e, processDetails.e());
        }
    }

    public static final class CrashlyticsReportSessionEventDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventDeviceEncoder f30289a = new CrashlyticsReportSessionEventDeviceEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30290b = FieldDescriptor.d("batteryLevel");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30291c = FieldDescriptor.d("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30292d = FieldDescriptor.d("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30293e = FieldDescriptor.d("orientation");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30294f = FieldDescriptor.d("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f30295g = FieldDescriptor.d("diskUsed");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Device device, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30290b, device.b());
            objectEncoderContext.c(f30291c, device.c());
            objectEncoderContext.a(f30292d, device.g());
            objectEncoderContext.c(f30293e, device.e());
            objectEncoderContext.b(f30294f, device.f());
            objectEncoderContext.b(f30295g, device.d());
        }
    }

    public static final class CrashlyticsReportSessionEventEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventEncoder f30296a = new CrashlyticsReportSessionEventEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30297b = FieldDescriptor.d("timestamp");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30298c = FieldDescriptor.d("type");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30299d = FieldDescriptor.d("app");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30300e = FieldDescriptor.d("device");

        /* renamed from: f  reason: collision with root package name */
        public static final FieldDescriptor f30301f = FieldDescriptor.d("log");

        /* renamed from: g  reason: collision with root package name */
        public static final FieldDescriptor f30302g = FieldDescriptor.d("rollouts");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event event, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.b(f30297b, event.f());
            objectEncoderContext.g(f30298c, event.g());
            objectEncoderContext.g(f30299d, event.b());
            objectEncoderContext.g(f30300e, event.c());
            objectEncoderContext.g(f30301f, event.d());
            objectEncoderContext.g(f30302g, event.e());
        }
    }

    public static final class CrashlyticsReportSessionEventLogEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventLogEncoder f30303a = new CrashlyticsReportSessionEventLogEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30304b = FieldDescriptor.d("content");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.Log log, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30304b, log.b());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutAssignmentEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutAssignmentEncoder f30305a = new CrashlyticsReportSessionEventRolloutAssignmentEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30306b = FieldDescriptor.d("rolloutVariant");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30307c = FieldDescriptor.d("parameterKey");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30308d = FieldDescriptor.d("parameterValue");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30309e = FieldDescriptor.d("templateVersion");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30306b, rolloutAssignment.d());
            objectEncoderContext.g(f30307c, rolloutAssignment.b());
            objectEncoderContext.g(f30308d, rolloutAssignment.c());
            objectEncoderContext.b(f30309e, rolloutAssignment.e());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder f30310a = new CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30311b = FieldDescriptor.d("rolloutId");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30312c = FieldDescriptor.d("variantId");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30311b, rolloutVariant.b());
            objectEncoderContext.g(f30312c, rolloutVariant.c());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutsStateEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutsState> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutsStateEncoder f30313a = new CrashlyticsReportSessionEventRolloutsStateEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30314b = FieldDescriptor.d("assignments");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.Event.RolloutsState rolloutsState, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30314b, rolloutsState.b());
        }
    }

    public static final class CrashlyticsReportSessionOperatingSystemEncoder implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionOperatingSystemEncoder f30315a = new CrashlyticsReportSessionOperatingSystemEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30316b = FieldDescriptor.d("platform");

        /* renamed from: c  reason: collision with root package name */
        public static final FieldDescriptor f30317c = FieldDescriptor.d("version");

        /* renamed from: d  reason: collision with root package name */
        public static final FieldDescriptor f30318d = FieldDescriptor.d("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final FieldDescriptor f30319e = FieldDescriptor.d("jailbroken");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.OperatingSystem operatingSystem, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.c(f30316b, operatingSystem.c());
            objectEncoderContext.g(f30317c, operatingSystem.d());
            objectEncoderContext.g(f30318d, operatingSystem.b());
            objectEncoderContext.a(f30319e, operatingSystem.e());
        }
    }

    public static final class CrashlyticsReportSessionUserEncoder implements ObjectEncoder<CrashlyticsReport.Session.User> {

        /* renamed from: a  reason: collision with root package name */
        public static final CrashlyticsReportSessionUserEncoder f30320a = new CrashlyticsReportSessionUserEncoder();

        /* renamed from: b  reason: collision with root package name */
        public static final FieldDescriptor f30321b = FieldDescriptor.d("identifier");

        /* renamed from: b */
        public void a(CrashlyticsReport.Session.User user, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.g(f30321b, user.b());
        }
    }

    public void a(EncoderConfig encoderConfig) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.f30193a;
        encoderConfig.a(CrashlyticsReport.class, crashlyticsReportEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.f30232a;
        encoderConfig.a(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.f30212a;
        encoderConfig.a(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.f30220a;
        encoderConfig.a(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.f30320a;
        encoderConfig.a(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.f30315a;
        encoderConfig.a(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.f30222a;
        encoderConfig.a(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.f30296a;
        encoderConfig.a(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.f30245a;
        encoderConfig.a(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.f30258a;
        encoderConfig.a(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.f30274a;
        encoderConfig.a(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.f30278a;
        encoderConfig.a(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder crashlyticsReportSessionEventApplicationExecutionExceptionEncoder = CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.f30264a;
        encoderConfig.a(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.f30180a;
        encoderConfig.a(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.f30176a;
        encoderConfig.a(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.f30270a;
        encoderConfig.a(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder = CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.f30253a;
        encoderConfig.a(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.f30190a;
        encoderConfig.a(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventApplicationProcessDetailsEncoder crashlyticsReportSessionEventApplicationProcessDetailsEncoder = CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.f30284a;
        encoderConfig.a(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.f30289a;
        encoderConfig.a(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.f30303a;
        encoderConfig.a(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportSessionEventRolloutsStateEncoder crashlyticsReportSessionEventRolloutsStateEncoder = CrashlyticsReportSessionEventRolloutsStateEncoder.f30313a;
        encoderConfig.a(CrashlyticsReport.Session.Event.RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentEncoder crashlyticsReportSessionEventRolloutAssignmentEncoder = CrashlyticsReportSessionEventRolloutAssignmentEncoder.f30305a;
        encoderConfig.a(CrashlyticsReport.Session.Event.RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder = CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.f30310a;
        encoderConfig.a(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.f30206a;
        encoderConfig.a(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.f30209a;
        encoderConfig.a(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        encoderConfig.a(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}
