package kotlin.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", l = {275, 283, 287}, m = "invokeSuspend")
final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f41177B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Regex F;
    public final /* synthetic */ CharSequence G;
    public final /* synthetic */ int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i2, Continuation continuation) {
        super(2, continuation);
        this.F = regex;
        this.G = charSequence;
        this.H = i2;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.F, this.G, this.H, continuation);
        regex$splitToSequence$1.E = obj;
        return regex$splitToSequence$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r9.D
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 == r4) goto L_0x002d
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.ResultKt.b(r10)
            goto L_0x009d
        L_0x0016:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001e:
            int r1 = r9.C
            java.lang.Object r5 = r9.f41177B
            java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
            java.lang.Object r6 = r9.E
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlin.ResultKt.b(r10)
            r10 = r5
            goto L_0x0071
        L_0x002d:
            kotlin.ResultKt.b(r10)
            goto L_0x00af
        L_0x0032:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.E
            kotlin.sequences.SequenceScope r10 = (kotlin.sequences.SequenceScope) r10
            kotlin.text.Regex r1 = r9.F
            java.util.regex.Pattern r1 = r1.f41174z
            java.lang.CharSequence r5 = r9.G
            java.util.regex.Matcher r1 = r1.matcher(r5)
            int r5 = r9.H
            if (r5 == r4) goto L_0x00a0
            boolean r5 = r1.find()
            if (r5 != 0) goto L_0x0050
            goto L_0x00a0
        L_0x0050:
            r5 = 0
            r6 = r10
            r10 = r1
            r1 = r5
        L_0x0054:
            java.lang.CharSequence r7 = r9.G
            int r8 = r10.start()
            java.lang.CharSequence r5 = r7.subSequence(r5, r8)
            java.lang.String r5 = r5.toString()
            r9.E = r6
            r9.f41177B = r10
            r9.C = r1
            r9.D = r3
            java.lang.Object r5 = r6.c(r5, r9)
            if (r5 != r0) goto L_0x0071
            return r0
        L_0x0071:
            int r5 = r10.end()
            int r1 = r1 + r4
            int r7 = r9.H
            int r7 = r7 - r4
            if (r1 == r7) goto L_0x0081
            boolean r7 = r10.find()
            if (r7 != 0) goto L_0x0054
        L_0x0081:
            java.lang.CharSequence r10 = r9.G
            int r1 = r10.length()
            java.lang.CharSequence r10 = r10.subSequence(r5, r1)
            java.lang.String r10 = r10.toString()
            r1 = 0
            r9.E = r1
            r9.f41177B = r1
            r9.D = r2
            java.lang.Object r10 = r6.c(r10, r9)
            if (r10 != r0) goto L_0x009d
            return r0
        L_0x009d:
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        L_0x00a0:
            java.lang.CharSequence r1 = r9.G
            java.lang.String r1 = r1.toString()
            r9.D = r4
            java.lang.Object r10 = r10.c(r1, r9)
            if (r10 != r0) goto L_0x00af
            return r0
        L_0x00af:
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex$splitToSequence$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((Regex$splitToSequence$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
