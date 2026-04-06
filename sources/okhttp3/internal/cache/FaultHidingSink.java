package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

@Metadata
public class FaultHidingSink extends ForwardingSink {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f42858A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f42859B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(Sink sink, Function1 function1) {
        super(sink);
        Intrinsics.i(sink, "delegate");
        Intrinsics.i(function1, "onException");
        this.f42858A = function1;
    }

    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        if (this.f42859B) {
            buffer.skip(j2);
            return;
        }
        try {
            super.N0(buffer, j2);
        } catch (IOException e2) {
            this.f42859B = true;
            this.f42858A.invoke(e2);
        }
    }

    public void close() {
        if (!this.f42859B) {
            try {
                super.close();
            } catch (IOException e2) {
                this.f42859B = true;
                this.f42858A.invoke(e2);
            }
        }
    }

    public void flush() {
        if (!this.f42859B) {
            try {
                super.flush();
            } catch (IOException e2) {
                this.f42859B = true;
                this.f42858A.invoke(e2);
            }
        }
    }
}
