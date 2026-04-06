package com.google.firebase.perf.session.gauges;

import android.content.Context;
import com.google.firebase.components.Lazy;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private static final GaugeManager instance = new GaugeManager();
    private static final AndroidLogger logger = AndroidLogger.e();
    private ApplicationProcessState applicationProcessState;
    private final ConfigResolver configResolver;
    private final Lazy<CpuGaugeCollector> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final Lazy<ScheduledExecutorService> gaugeManagerExecutor;
    private GaugeMetadataManager gaugeMetadataManager;
    private final Lazy<MemoryGaugeCollector> memoryGaugeCollector;
    private String sessionId;
    private final TransportManager transportManager;

    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31044a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.perf.v1.ApplicationProcessState[] r0 = com.google.firebase.perf.v1.ApplicationProcessState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31044a = r0
                com.google.firebase.perf.v1.ApplicationProcessState r1 = com.google.firebase.perf.v1.ApplicationProcessState.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31044a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.perf.v1.ApplicationProcessState r1 = com.google.firebase.perf.v1.ApplicationProcessState.FOREGROUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.gauges.GaugeManager.AnonymousClass1.<clinit>():void");
        }
    }

    private GaugeManager() {
        this(new Lazy(new e()), TransportManager.k(), ConfigResolver.g(), (GaugeMetadataManager) null, new Lazy(new f()), new Lazy(new g()));
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState2) {
        int i2 = AnonymousClass1.f31044a[applicationProcessState2.ordinal()];
        long z2 = i2 != 1 ? i2 != 2 ? -1 : this.configResolver.z() : this.configResolver.y();
        return CpuGaugeCollector.f(z2) ? INVALID_GAUGE_COLLECTION_FREQUENCY : z2;
    }

    private GaugeMetadata getGaugeMetadata() {
        return (GaugeMetadata) GaugeMetadata.k0().O(this.gaugeMetadataManager.a()).P(this.gaugeMetadataManager.b()).R(this.gaugeMetadataManager.c()).d();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState2) {
        int i2 = AnonymousClass1.f31044a[applicationProcessState2.ordinal()];
        long C = i2 != 1 ? i2 != 2 ? -1 : this.configResolver.C() : this.configResolver.B();
        return MemoryGaugeCollector.e(C) ? INVALID_GAUGE_COLLECTION_FREQUENCY : C;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CpuGaugeCollector lambda$new$0() {
        return new CpuGaugeCollector();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ MemoryGaugeCollector lambda$new$1() {
        return new MemoryGaugeCollector();
    }

    private boolean startCollectingCpuMetrics(long j2, Timer timer) {
        if (j2 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((CpuGaugeCollector) this.cpuGaugeCollector.get()).k(j2, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j2, Timer timer) {
        if (j2 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((MemoryGaugeCollector) this.memoryGaugeCollector.get()).j(j2, timer);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, ApplicationProcessState applicationProcessState2) {
        GaugeMetric.Builder t0 = GaugeMetric.t0();
        while (!((CpuGaugeCollector) this.cpuGaugeCollector.get()).f31038a.isEmpty()) {
            t0.P((CpuMetricReading) ((CpuGaugeCollector) this.cpuGaugeCollector.get()).f31038a.poll());
        }
        while (!((MemoryGaugeCollector) this.memoryGaugeCollector.get()).f31052b.isEmpty()) {
            t0.O((AndroidMemoryReading) ((MemoryGaugeCollector) this.memoryGaugeCollector.get()).f31052b.poll());
        }
        t0.T(str);
        this.transportManager.A((GaugeMetric) t0.d(), applicationProcessState2);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((CpuGaugeCollector) this.cpuGaugeCollector.get(), (MemoryGaugeCollector) this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new GaugeMetadataManager(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState2) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.A((GaugeMetric) GaugeMetric.t0().T(str).R(getGaugeMetadata()).d(), applicationProcessState2);
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, ApplicationProcessState applicationProcessState2) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(applicationProcessState2, perfSession.d());
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String h2 = perfSession.h();
        this.sessionId = h2;
        this.applicationProcessState = applicationProcessState2;
        try {
            long j2 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new d(this, h2, applicationProcessState2), j2, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            AndroidLogger androidLogger = logger;
            androidLogger.j("Unable to start collecting Gauges: " + e2.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str != null) {
            ApplicationProcessState applicationProcessState2 = this.applicationProcessState;
            ((CpuGaugeCollector) this.cpuGaugeCollector.get()).l();
            ((MemoryGaugeCollector) this.memoryGaugeCollector.get()).k();
            ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new c(this, str, applicationProcessState2), 20, TimeUnit.MILLISECONDS);
            this.sessionId = null;
            this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
    }

    private static void collectGaugeMetricOnce(CpuGaugeCollector cpuGaugeCollector2, MemoryGaugeCollector memoryGaugeCollector2, Timer timer) {
        cpuGaugeCollector2.c(timer);
        memoryGaugeCollector2.c(timer);
    }

    public GaugeManager(Lazy<ScheduledExecutorService> lazy, TransportManager transportManager2, ConfigResolver configResolver2, GaugeMetadataManager gaugeMetadataManager2, Lazy<CpuGaugeCollector> lazy2, Lazy<MemoryGaugeCollector> lazy3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lazy;
        this.transportManager = transportManager2;
        this.configResolver = configResolver2;
        this.gaugeMetadataManager = gaugeMetadataManager2;
        this.cpuGaugeCollector = lazy2;
        this.memoryGaugeCollector = lazy3;
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState2, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState2);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState2);
        if (!startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs;
        }
        if (cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            return memoryGaugeCollectionFrequencyMs;
        }
        return Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
    }
}
