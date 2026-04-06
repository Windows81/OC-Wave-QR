package kotlinx.coroutines.channels;

import kotlin.Metadata;

@Metadata
public final class TickerChannelsKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlinx.coroutines.channels.SendChannel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(long r6, long r8, kotlinx.coroutines.channels.SendChannel r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            long r6 = r0.C
            java.lang.Object r8 = r0.D
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            kotlin.ResultKt.b(r11)
        L_0x0034:
            r10 = r8
            goto L_0x0063
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            long r6 = r0.C
            java.lang.Object r8 = r0.D
            kotlinx.coroutines.channels.SendChannel r8 = (kotlinx.coroutines.channels.SendChannel) r8
            kotlin.ResultKt.b(r11)
            goto L_0x0073
        L_0x0048:
            long r6 = r0.C
            java.lang.Object r8 = r0.D
            r10 = r8
            kotlinx.coroutines.channels.SendChannel r10 = (kotlinx.coroutines.channels.SendChannel) r10
            kotlin.ResultKt.b(r11)
            goto L_0x0063
        L_0x0053:
            kotlin.ResultKt.b(r11)
            r0.D = r10
            r0.C = r6
            r0.F = r5
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r8, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            kotlin.Unit r8 = kotlin.Unit.f40552a
            r0.D = r10
            r0.C = r6
            r0.F = r4
            java.lang.Object r8 = r10.O(r8, r0)
            if (r8 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r8 = r10
        L_0x0073:
            r0.D = r8
            r0.C = r6
            r0.F = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r6, r0)
            if (r9 != r1) goto L_0x0034
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.c(long, long, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(long r18, long r20, kotlinx.coroutines.channels.SendChannel r22, kotlin.coroutines.Continuation r23) {
        /*
            r0 = r23
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.G = r2
            goto L_0x001a
        L_0x0015:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.F
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r1.G
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0079
            if (r3 == r7) goto L_0x006b
            if (r3 == r6) goto L_0x005f
            if (r3 == r5) goto L_0x004c
            if (r3 != r4) goto L_0x0044
            long r7 = r1.D
            long r9 = r1.C
            java.lang.Object r3 = r1.E
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.b(r0)
            r11 = r4
            r0 = r5
        L_0x003d:
            r16 = r7
            r7 = r9
            r9 = r16
            goto L_0x0115
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            long r7 = r1.D
            long r9 = r1.C
            java.lang.Object r3 = r1.E
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.b(r0)
            r0 = r5
        L_0x0058:
            r16 = r7
            r7 = r9
            r9 = r16
            goto L_0x00fc
        L_0x005f:
            long r7 = r1.D
            long r9 = r1.C
            java.lang.Object r3 = r1.E
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.b(r0)
            goto L_0x00c2
        L_0x006b:
            long r7 = r1.D
            long r9 = r1.C
            java.lang.Object r3 = r1.E
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            kotlin.ResultKt.b(r0)
            r0 = r3
            r10 = r9
            goto L_0x00a6
        L_0x0079:
            kotlin.ResultKt.b(r0)
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.f41360a
            if (r0 == 0) goto L_0x0087
            long r8 = r0.a()
            goto L_0x008b
        L_0x0087:
            long r8 = java.lang.System.nanoTime()
        L_0x008b:
            long r10 = kotlinx.coroutines.EventLoop_commonKt.d(r20)
            long r8 = r8 + r10
            r0 = r22
            r1.E = r0
            r10 = r18
            r1.C = r10
            r1.D = r8
            r1.G = r7
            r12 = r20
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.b(r12, r1)
            if (r3 != r2) goto L_0x00a5
            return r2
        L_0x00a5:
            r7 = r8
        L_0x00a6:
            long r9 = kotlinx.coroutines.EventLoop_commonKt.d(r10)
        L_0x00aa:
            long r7 = r7 + r9
            kotlin.Unit r3 = kotlin.Unit.f40552a
            r1.E = r0
            r1.C = r7
            r1.D = r9
            r1.G = r6
            java.lang.Object r3 = r0.O(r3, r1)
            if (r3 != r2) goto L_0x00bc
            return r2
        L_0x00bc:
            r3 = r0
            r16 = r7
            r7 = r9
            r9 = r16
        L_0x00c2:
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.f41360a
            if (r0 == 0) goto L_0x00cd
            long r11 = r0.a()
            goto L_0x00d1
        L_0x00cd:
            long r11 = java.lang.System.nanoTime()
        L_0x00d1:
            long r13 = r9 - r11
            r4 = 0
            long r13 = kotlin.ranges.RangesKt.f(r13, r4)
            int r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r15 != 0) goto L_0x0100
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0100
            long r4 = r11 - r9
            long r4 = r4 % r7
            long r4 = r7 - r4
            long r9 = r11 + r4
            long r4 = kotlinx.coroutines.EventLoop_commonKt.c(r4)
            r1.E = r3
            r1.C = r9
            r1.D = r7
            r0 = 3
            r1.G = r0
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.b(r4, r1)
            if (r4 != r2) goto L_0x0058
            return r2
        L_0x00fc:
            r5 = r0
            r0 = r3
            r4 = 4
            goto L_0x00aa
        L_0x0100:
            r0 = 3
            long r4 = kotlinx.coroutines.EventLoop_commonKt.c(r13)
            r1.E = r3
            r1.C = r9
            r1.D = r7
            r11 = 4
            r1.G = r11
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.b(r4, r1)
            if (r4 != r2) goto L_0x003d
            return r2
        L_0x0115:
            r5 = r0
            r0 = r3
            r4 = r11
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.d(long, long, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
