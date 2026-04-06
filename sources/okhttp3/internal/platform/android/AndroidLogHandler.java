package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidLogHandler extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidLogHandler f43210a = new AndroidLogHandler();

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        Intrinsics.i(logRecord, "record");
        AndroidLog androidLog = AndroidLog.f43207a;
        String loggerName = logRecord.getLoggerName();
        Intrinsics.h(loggerName, "record.loggerName");
        int a2 = AndroidLogKt.b(logRecord);
        String message = logRecord.getMessage();
        Intrinsics.h(message, "record.message");
        androidLog.a(loggerName, a2, message, logRecord.getThrown());
    }
}
