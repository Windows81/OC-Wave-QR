package okio.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import okio.BufferedSource;

@Metadata
public final class ZipFilesKt$readOrSkipLocalHeader$1 extends Lambda implements Function2<Integer, Long, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f43502A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f43503B;
    public final /* synthetic */ Ref.ObjectRef C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BufferedSource f43504z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZipFilesKt$readOrSkipLocalHeader$1(BufferedSource bufferedSource, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        super(2);
        this.f43504z = bufferedSource;
        this.f43502A = objectRef;
        this.f43503B = objectRef2;
        this.C = objectRef3;
    }

    public final void b(int i2, long j2) {
        if (i2 == 21589) {
            long j3 = 1;
            if (j2 >= 1) {
                byte readByte = this.f43504z.readByte();
                boolean z2 = false;
                boolean z3 = (readByte & 1) == 1;
                boolean z4 = (readByte & 2) == 2;
                if ((readByte & 4) == 4) {
                    z2 = true;
                }
                BufferedSource bufferedSource = this.f43504z;
                if (z3) {
                    j3 = 5;
                }
                if (z4) {
                    j3 += 4;
                }
                if (z2) {
                    j3 += 4;
                }
                if (j2 >= j3) {
                    if (z3) {
                        this.f43502A.f40908z = Long.valueOf(((long) bufferedSource.c1()) * 1000);
                    }
                    if (z4) {
                        this.f43503B.f40908z = Long.valueOf(((long) this.f43504z.c1()) * 1000);
                    }
                    if (z2) {
                        this.C.f40908z = Long.valueOf(((long) this.f43504z.c1()) * 1000);
                        return;
                    }
                    return;
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            throw new IOException("bad zip: extended timestamp extra too short");
        }
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b(((Number) obj).intValue(), ((Number) obj2).longValue());
        return Unit.f40552a;
    }
}
