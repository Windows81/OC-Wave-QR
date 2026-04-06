package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1 implements Flow<MenuItemListState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ GetAccountMenuConfigurationUseCase f33848A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f33849z;

    public GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1(Flow flow, GetAccountMenuConfigurationUseCase getAccountMenuConfigurationUseCase) {
        this.f33849z = flow;
        this.f33848A = getAccountMenuConfigurationUseCase;
    }

    public Object a(final FlowCollector flowCollector, Continuation continuation) {
        Flow flow = this.f33849z;
        final GetAccountMenuConfigurationUseCase getAccountMenuConfigurationUseCase = this.f33848A;
        Object a2 = flow.a(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x00c8 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1$2$1 r0 = (com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.D
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.D = r1
                    goto L_0x0018
                L_0x0013:
                    com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1$2$1 r0 = new com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1$2$1
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.C
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.D
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L_0x0057
                    if (r2 == r5) goto L_0x004a
                    if (r2 == r4) goto L_0x0038
                    if (r2 != r3) goto L_0x0030
                    kotlin.ResultKt.b(r11)
                    goto L_0x00c9
                L_0x0030:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0038:
                    boolean r10 = r0.I
                    java.lang.Object r2 = r0.H
                    com.hansecom.abt.data.config.menu.AccountMenuConfigConverter r2 = (com.hansecom.abt.data.config.menu.AccountMenuConfigConverter) r2
                    java.lang.Object r4 = r0.G
                    com.hansecom.abt.data.config.RemoteConfig r4 = (com.hansecom.abt.data.config.RemoteConfig) r4
                    java.lang.Object r6 = r0.E
                    kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                    kotlin.ResultKt.b(r11)
                    goto L_0x00a2
                L_0x004a:
                    java.lang.Object r10 = r0.G
                    kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
                    java.lang.Object r2 = r0.E
                    com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1$2 r2 = (com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1.AnonymousClass2) r2
                    kotlin.ResultKt.b(r11)
                    r6 = r10
                    goto L_0x0077
                L_0x0057:
                    kotlin.ResultKt.b(r11)
                    kotlinx.coroutines.flow.FlowCollector r11 = r4
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    r10.booleanValue()
                    com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase r10 = r2
                    com.hansecom.abt.data.preferences.LockPreferences r10 = r10.f33847b
                    r0.E = r9
                    r0.G = r11
                    r0.D = r5
                    java.lang.Object r10 = r10.d(r0)
                    if (r10 != r1) goto L_0x0074
                    return r1
                L_0x0074:
                    r2 = r9
                    r6 = r11
                    r11 = r10
                L_0x0077:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r10 = r11.booleanValue()
                    com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase r11 = r2
                    com.hansecom.abt.data.config.menu.AccountMenuConfigConverter r11 = r11.f33846a
                    com.hansecom.abt.data.config.RemoteConfig r7 = com.hansecom.abt.data.config.RemoteConfig.ACCOUNT
                    if (r10 == 0) goto L_0x00ad
                    com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase r2 = r2
                    com.hansecom.abt.data.preferences.LockPreferences r2 = r2.f33847b
                    r0.E = r6
                    r0.G = r7
                    r0.H = r11
                    r0.I = r10
                    r0.D = r4
                    java.lang.Object r2 = r2.f(r0)
                    if (r2 != r1) goto L_0x009e
                    return r1
                L_0x009e:
                    r4 = r7
                    r8 = r2
                    r2 = r11
                    r11 = r8
                L_0x00a2:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L_0x00ab
                    goto L_0x00b0
                L_0x00ab:
                    r11 = r2
                    r7 = r4
                L_0x00ad:
                    r5 = 0
                    r2 = r11
                    r4 = r7
                L_0x00b0:
                    com.hansecom.abt.data.config.menu.AccountMenuConfigConverter$Params r11 = new com.hansecom.abt.data.config.menu.AccountMenuConfigConverter$Params
                    r11.<init>(r10, r5)
                    com.hansecom.abt.ui.components.listItem.MenuItemListState r10 = r2.e(r4, r11)
                    r11 = 0
                    r0.E = r11
                    r0.G = r11
                    r0.H = r11
                    r0.D = r3
                    java.lang.Object r10 = r6.c(r10, r0)
                    if (r10 != r1) goto L_0x00c9
                    return r1
                L_0x00c9:
                    kotlin.Unit r10 = kotlin.Unit.f40552a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase$invoke$$inlined$map$1.AnonymousClass2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
