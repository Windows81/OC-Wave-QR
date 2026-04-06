package coil.disk;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

@Metadata
public final class FaultHidingSink extends ForwardingSink {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f23419A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f23420B;

    public FaultHidingSink(Sink sink, Function1 function1) {
        super(sink);
        this.f23419A = function1;
    }

    public void N0(Buffer buffer, long j2) {
        if (this.f23420B) {
            buffer.skip(j2);
            return;
        }
        try {
            super.N0(buffer, j2);
        } catch (IOException e2) {
            this.f23420B = true;
            this.f23419A.invoke(e2);
        }
    }

    public void close() {
        try {
            super.close();
        } catch (IOException e2) {
            this.f23420B = true;
            this.f23419A.invoke(e2);
        }
    }

    public void flush() {
        try {
            super.flush();
        } catch (IOException e2) {
            this.f23420B = true;
            this.f23419A.invoke(e2);
        }
    }
}
