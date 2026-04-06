package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.Utils_androidKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

@Metadata
public final class SourceInformationKt {
    public static final boolean a(SourceInfoParserState sourceInfoParserState) {
        return sourceInfoParserState.g() < sourceInfoParserState.f().length() - 1 && Character.isLetter(sourceInfoParserState.f().charAt(sourceInfoParserState.g())) && sourceInfoParserState.f().charAt(sourceInfoParserState.g() + 1) == '(';
    }

    public static final List b(SourceInfoParserState sourceInfoParserState) {
        boolean z2;
        Integer num;
        ArrayList arrayList = new ArrayList();
        while (!sourceInfoParserState.c() && !sourceInfoParserState.h(':')) {
            if (sourceInfoParserState.h('*')) {
                SourceInfoParserState.b(sourceInfoParserState, 0, 1, (Object) null);
                z2 = true;
            } else {
                z2 = false;
            }
            Integer valueOf = !sourceInfoParserState.h('@') ? Integer.valueOf(sourceInfoParserState.j("@") + 1) : null;
            SourceInfoParserState.b(sourceInfoParserState, 0, 1, (Object) null);
            int j2 = sourceInfoParserState.j("L,:");
            if (sourceInfoParserState.h('L')) {
                SourceInfoParserState.b(sourceInfoParserState, 0, 1, (Object) null);
                num = Integer.valueOf(sourceInfoParserState.j(",:"));
            } else {
                num = null;
            }
            int i2 = -1;
            int intValue = valueOf != null ? valueOf.intValue() : -1;
            if (num != null) {
                i2 = num.intValue();
            }
            arrayList.add(new LocationSourceInformation(intValue, j2, i2, z2));
            if (sourceInfoParserState.h(',')) {
                SourceInfoParserState.b(sourceInfoParserState, 0, 1, (Object) null);
            }
        }
        SourceInfoParserState.b(sourceInfoParserState, 0, 1, (Object) null);
        return arrayList;
    }

    public static final List c(SourceInfoParserState sourceInfoParserState) {
        String str;
        SourceInfoParserState sourceInfoParserState2 = sourceInfoParserState;
        sourceInfoParserState2.a(2);
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        while (!sourceInfoParserState.c() && !sourceInfoParserState2.h(')')) {
            if (sourceInfoParserState2.h('!')) {
                SourceInfoParserState.b(sourceInfoParserState2, 0, 1, (Object) null);
                String k2 = sourceInfoParserState2.k("!,)");
                if (k2.length() != 0) {
                    int parseInt = Integer.parseInt(k2);
                    int i2 = 0;
                    while (parseInt > 0) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                arrayList.add(new ParameterSourceInformation(i2, (String) null, (String) null, 6, (DefaultConstructorMarker) null));
                                parseInt--;
                                break;
                            } else if (((ParameterSourceInformation) arrayList.get(i3)).a() == i2) {
                                i2++;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    z2 = true;
                }
            } else {
                int j2 = sourceInfoParserState2.j("!:,)");
                if (sourceInfoParserState2.h(':')) {
                    SourceInfoParserState.b(sourceInfoParserState2, 0, 1, (Object) null);
                    str = g(sourceInfoParserState2.k("!,)"));
                } else {
                    str = null;
                }
                if (z2) {
                    int i4 = 0;
                    while (i4 < j2) {
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                arrayList.add(new ParameterSourceInformation(i4, (String) null, (String) null, 6, (DefaultConstructorMarker) null));
                                break;
                            } else if (((ParameterSourceInformation) arrayList.get(i5)).a() == i4) {
                                i4++;
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    z2 = false;
                }
                arrayList.add(new ParameterSourceInformation(j2, (String) null, str, 2, (DefaultConstructorMarker) null));
            }
            if (sourceInfoParserState2.h(',')) {
                SourceInfoParserState.b(sourceInfoParserState2, 0, 1, (Object) null);
            }
        }
        sourceInfoParserState2.e(')');
        SourceInfoParserState.b(sourceInfoParserState2, 0, 1, (Object) null);
        return arrayList;
    }

    public static final List d(SourceInfoParserState sourceInfoParserState) {
        String str;
        sourceInfoParserState.a(2);
        ArrayList arrayList = new ArrayList();
        while (!sourceInfoParserState.c() && !sourceInfoParserState.h(')')) {
            String k2 = sourceInfoParserState.k(":,)");
            if (sourceInfoParserState.h(':')) {
                SourceInfoParserState.b(sourceInfoParserState, 0, 1, (Object) null);
                str = g(sourceInfoParserState.k(",)"));
            } else {
                str = null;
            }
            arrayList.add(new ParameterSourceInformation(arrayList.size(), k2, str));
            if (sourceInfoParserState.h(',')) {
                SourceInfoParserState.b(sourceInfoParserState, 0, 1, (Object) null);
            }
        }
        sourceInfoParserState.e(')');
        SourceInfoParserState.b(sourceInfoParserState, 0, 1, (Object) null);
        return arrayList;
    }

    public static final SourceInformation e(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return f(str);
        } catch (ParseException e2) {
            Utils_androidKt.a(e2.getMessage(), e2);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.tooling.SourceInformation f(java.lang.String r14) {
        /*
            androidx.compose.runtime.tooling.SourceInfoParserState r0 = new androidx.compose.runtime.tooling.SourceInfoParserState
            r0.<init>(r14)
            r1 = 67
            boolean r2 = r0.h(r1)
            r3 = 40
            r4 = 41
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x0040
            androidx.compose.runtime.tooling.SourceInfoParserState.b(r0, r6, r5, r7)
            boolean r1 = r0.h(r1)
            if (r1 == 0) goto L_0x0022
            androidx.compose.runtime.tooling.SourceInfoParserState.b(r0, r6, r5, r7)
            r1 = r5
            goto L_0x0023
        L_0x0022:
            r1 = r6
        L_0x0023:
            boolean r2 = r0.h(r3)
            if (r2 == 0) goto L_0x003c
            androidx.compose.runtime.tooling.SourceInfoParserState.b(r0, r6, r5, r7)
            java.lang.String r2 = ")"
            java.lang.String r2 = r0.k(r2)
            r0.e(r4)
            androidx.compose.runtime.tooling.SourceInfoParserState.b(r0, r6, r5, r7)
            r8 = r1
            r10 = r2
            r2 = r5
            goto L_0x0043
        L_0x003c:
            r8 = r1
            r2 = r5
        L_0x003e:
            r10 = r7
            goto L_0x0043
        L_0x0040:
            r2 = r6
            r8 = r2
            goto L_0x003e
        L_0x0043:
            java.util.List r1 = kotlin.collections.CollectionsKt.m()
            r11 = r1
        L_0x0048:
            boolean r1 = a(r0)
            if (r1 == 0) goto L_0x009f
            char r1 = r0.d()
            r12 = 78
            if (r1 == r12) goto L_0x009a
            r12 = 80
            if (r1 == r12) goto L_0x0095
            r1 = 2
            r0.a(r1)
            r1 = r6
        L_0x005f:
            if (r1 > 0) goto L_0x006f
            boolean r12 = r0.h(r4)
            if (r12 != 0) goto L_0x0068
            goto L_0x006f
        L_0x0068:
            r0.e(r4)
            androidx.compose.runtime.tooling.SourceInfoParserState.b(r0, r6, r5, r7)
            goto L_0x0048
        L_0x006f:
            boolean r12 = r0.c()
            if (r12 != 0) goto L_0x008a
            boolean r12 = r0.h(r3)
            if (r12 == 0) goto L_0x007e
            int r1 = r1 + 1
            goto L_0x0086
        L_0x007e:
            boolean r12 = r0.h(r4)
            if (r12 == 0) goto L_0x0086
            int r1 = r1 + -1
        L_0x0086:
            androidx.compose.runtime.tooling.SourceInfoParserState.b(r0, r6, r5, r7)
            goto L_0x005f
        L_0x008a:
            java.lang.String r1 = "unexpected end"
            r0.m(r1)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0095:
            java.util.List r11 = c(r0)
            goto L_0x0048
        L_0x009a:
            java.util.List r11 = d(r0)
            goto L_0x0048
        L_0x009f:
            java.util.List r1 = kotlin.collections.CollectionsKt.m()
            r3 = 58
            boolean r3 = r0.h(r3)
            if (r3 != 0) goto L_0x00b1
            java.util.List r1 = b(r0)
        L_0x00af:
            r12 = r1
            goto L_0x00b5
        L_0x00b1:
            androidx.compose.runtime.tooling.SourceInfoParserState.b(r0, r6, r5, r7)
            goto L_0x00af
        L_0x00b5:
            java.lang.String r1 = "#"
            java.lang.String r1 = r0.k(r1)
            int r3 = r1.length()
            if (r3 <= 0) goto L_0x00c3
            r13 = r1
            goto L_0x00c4
        L_0x00c3:
            r13 = r7
        L_0x00c4:
            r1 = 35
            boolean r1 = r0.h(r1)
            if (r1 == 0) goto L_0x00d4
            androidx.compose.runtime.tooling.SourceInfoParserState.b(r0, r6, r5, r7)
            java.lang.String r0 = r0.l()
            r7 = r0
        L_0x00d4:
            androidx.compose.runtime.tooling.SourceInformation r0 = new androidx.compose.runtime.tooling.SourceInformation
            r1 = r0
            r3 = r8
            r4 = r10
            r5 = r13
            r6 = r11
            r8 = r12
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.tooling.SourceInformationKt.f(java.lang.String):androidx.compose.runtime.tooling.SourceInformation");
    }

    public static final String g(String str) {
        return StringsKt.M(str, "c#", "androidx.compose.", false, 4, (Object) null);
    }
}
