package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AsyncTimeout$source$1 implements Source {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Source f43336A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AsyncTimeout f43337z;

    public AsyncTimeout$source$1(AsyncTimeout asyncTimeout, Source source) {
        this.f43337z = asyncTimeout;
        this.f43336A = source;
    }

    /* renamed from: a */
    public AsyncTimeout u() {
        return this.f43337z;
    }

    public void close() {
        AsyncTimeout asyncTimeout = this.f43337z;
        Source source = this.f43336A;
        asyncTimeout.x();
        try {
            source.close();
            Unit unit = Unit.f40552a;
            if (asyncTimeout.y()) {
                throw asyncTimeout.r((IOException) null);
            }
        } catch (IOException e2) {
            e = e2;
            if (asyncTimeout.y()) {
                e = asyncTimeout.r(e);
            }
            throw e;
        } finally {
            asyncTimeout.y();
        }
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        AsyncTimeout asyncTimeout = this.f43337z;
        Source source = this.f43336A;
        asyncTimeout.x();
        try {
            long o1 = source.o1(buffer, j2);
            if (!asyncTimeout.y()) {
                return o1;
            }
            throw asyncTimeout.r((IOException) null);
        } catch (IOException e2) {
            e = e2;
            if (asyncTimeout.y()) {
                e = asyncTimeout.r(e);
            }
            throw e;
        } finally {
            asyncTimeout.y();
        }
    }

    public String toString() {
        return "AsyncTimeout.source(" + this.f43336A + ')';
    }
}
