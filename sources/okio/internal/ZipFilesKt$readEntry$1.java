package okio.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import okio.BufferedSource;

@Metadata
public final class ZipFilesKt$readEntry$1 extends Lambda implements Function2<Integer, Long, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f43499A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f43500B;
    public final /* synthetic */ BufferedSource C;
    public final /* synthetic */ Ref.LongRef D;
    public final /* synthetic */ Ref.LongRef E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f43501z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZipFilesKt$readEntry$1(Ref.BooleanRef booleanRef, long j2, Ref.LongRef longRef, BufferedSource bufferedSource, Ref.LongRef longRef2, Ref.LongRef longRef3) {
        super(2);
        this.f43501z = booleanRef;
        this.f43499A = j2;
        this.f43500B = longRef;
        this.C = bufferedSource;
        this.D = longRef2;
        this.E = longRef3;
    }

    public final void b(int i2, long j2) {
        if (i2 == 1) {
            Ref.BooleanRef booleanRef = this.f43501z;
            if (!booleanRef.f40901z) {
                booleanRef.f40901z = true;
                if (j2 >= this.f43499A) {
                    Ref.LongRef longRef = this.f43500B;
                    long j3 = longRef.f40907z;
                    if (j3 == 4294967295L) {
                        j3 = this.C.p1();
                    }
                    longRef.f40907z = j3;
                    Ref.LongRef longRef2 = this.D;
                    long j4 = 0;
                    longRef2.f40907z = longRef2.f40907z == 4294967295L ? this.C.p1() : 0;
                    Ref.LongRef longRef3 = this.E;
                    if (longRef3.f40907z == 4294967295L) {
                        j4 = this.C.p1();
                    }
                    longRef3.f40907z = j4;
                    return;
                }
                throw new IOException("bad zip: zip64 extra too short");
            }
            throw new IOException("bad zip: zip64 extra repeated");
        }
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b(((Number) obj).intValue(), ((Number) obj2).longValue());
        return Unit.f40552a;
    }
}
