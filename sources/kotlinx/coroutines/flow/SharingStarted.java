package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata
public interface SharingStarted {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f41761a = Companion.f41762a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f41762a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final SharingStarted f41763b = new StartedEagerly();

        /* renamed from: c  reason: collision with root package name */
        public static final SharingStarted f41764c = new StartedLazily();

        public static /* synthetic */ SharingStarted b(Companion companion, long j2, long j3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = 0;
            }
            if ((i2 & 2) != 0) {
                j3 = Long.MAX_VALUE;
            }
            return companion.a(j2, j3);
        }

        public final SharingStarted a(long j2, long j3) {
            return new StartedWhileSubscribed(j2, j3);
        }

        public final SharingStarted c() {
            return f41763b;
        }

        public final SharingStarted d() {
            return f41764c;
        }
    }

    Flow a(StateFlow stateFlow);
}
