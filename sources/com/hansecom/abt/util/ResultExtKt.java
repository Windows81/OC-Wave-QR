package com.hansecom.abt.util;

import com.hansecom.abt.api.ApiValidationException;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

@Metadata
public final class ResultExtKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(kotlin.jvm.functions.Function1[] r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof com.hansecom.abt.util.ResultExtKt$asyncAll$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.util.ResultExtKt$asyncAll$1 r0 = (com.hansecom.abt.util.ResultExtKt$asyncAll$1) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.D = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.util.ResultExtKt$asyncAll$1 r0 = new com.hansecom.abt.util.ResultExtKt$asyncAll$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.util.ResultExtKt$asyncAll$2 r5 = new com.hansecom.abt.util.ResultExtKt$asyncAll$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.D = r3
            java.lang.Object r5 = kotlinx.coroutines.SupervisorKt.c(r5, r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r4 = r5.j()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.util.ResultExtKt.a(kotlin.jvm.functions.Function1[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object b(Object obj) {
        if (Result.h(obj)) {
            obj = Unit.f40552a;
        }
        return Result.b(obj);
    }

    public static final Object c(Object obj) {
        Throwable e2 = Result.e(obj);
        if (e2 == null) {
            return obj;
        }
        try {
            if (e2 instanceof ApiValidationException) {
                throw new FieldErrorsException((ApiValidationException) e2);
            }
            throw e2;
        } catch (Throwable th) {
            Result.Companion companion = Result.f40519A;
            return Result.b(ResultKt.a(th));
        }
    }
}
