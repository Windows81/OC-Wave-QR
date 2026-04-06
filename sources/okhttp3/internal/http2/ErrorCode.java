package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f43026A = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f43028z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorCode a(int i2) {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.f() == i2) {
                    return errorCode;
                }
            }
            return null;
        }

        public Companion() {
        }
    }

    static {
        f43026A = new Companion((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    ErrorCode(int i2) {
        this.f43028z = i2;
    }

    public final int f() {
        return this.f43028z;
    }
}
