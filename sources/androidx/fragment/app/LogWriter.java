package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class LogWriter extends Writer {

    /* renamed from: A  reason: collision with root package name */
    public StringBuilder f21763A = new StringBuilder(128);

    /* renamed from: z  reason: collision with root package name */
    public final String f21764z;

    public LogWriter(String str) {
        this.f21764z = str;
    }

    public final void a() {
        if (this.f21763A.length() > 0) {
            Log.d(this.f21764z, this.f21763A.toString());
            StringBuilder sb = this.f21763A;
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
                this.f21763A.append(c2);
            }
        }
    }
}
