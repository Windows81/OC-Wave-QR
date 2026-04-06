package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata
public final class TaskLoggerKt {
    public static final String b(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j2 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.h(format, "format(format, *args)");
        return format;
    }

    public static final void c(Task task, TaskQueue taskQueue, String str) {
        Logger a2 = TaskRunner.f42890h.a();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.f());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.h(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.b());
        a2.fine(sb.toString());
    }
}
