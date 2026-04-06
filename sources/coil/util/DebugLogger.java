package coil.util;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;

@Metadata
public final class DebugLogger implements Logger {

    /* renamed from: a  reason: collision with root package name */
    public int f23745a;

    public int a() {
        return this.f23745a;
    }

    public void b(String str, int i2, String str2, Throwable th) {
        if (str2 != null) {
            Log.println(i2, str, str2);
        }
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            Log.println(i2, str, stringWriter.toString());
        }
    }
}
