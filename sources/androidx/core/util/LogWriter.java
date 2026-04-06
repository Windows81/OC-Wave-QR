package androidx.core.util;

import android.util.Log;
import java.io.Writer;

@Deprecated
public class LogWriter extends Writer {

    /* renamed from: A  reason: collision with root package name */
    public StringBuilder f20145A;

    /* renamed from: z  reason: collision with root package name */
    public final String f20146z;

    public final void a() {
        if (this.f20145A.length() > 0) {
            Log.d(this.f20146z, this.f20145A.toString());
            StringBuilder sb = this.f20145A;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == 10) {
                a();
            } else {
                this.f20145A.append(c2);
            }
        }
    }
}
