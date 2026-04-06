package okhttp3.internal.http2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

@Metadata
public interface PushObserver {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f43162a = Companion.f43164a;

    /* renamed from: b  reason: collision with root package name */
    public static final PushObserver f43163b = new Companion.PushObserverCancel();

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f43164a = new Companion();

        @Metadata
        public static final class PushObserverCancel implements PushObserver {
            public boolean a(int i2, List list) {
                Intrinsics.i(list, "requestHeaders");
                return true;
            }

            public boolean b(int i2, List list, boolean z2) {
                Intrinsics.i(list, "responseHeaders");
                return true;
            }

            public void c(int i2, ErrorCode errorCode) {
                Intrinsics.i(errorCode, "errorCode");
            }

            public boolean d(int i2, BufferedSource bufferedSource, int i3, boolean z2) {
                Intrinsics.i(bufferedSource, "source");
                bufferedSource.skip((long) i3);
                return true;
            }
        }
    }

    boolean a(int i2, List list);

    boolean b(int i2, List list, boolean z2);

    void c(int i2, ErrorCode errorCode);

    boolean d(int i2, BufferedSource bufferedSource, int i3, boolean z2);
}
