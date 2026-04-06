package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.Interaction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class MappedInteractionSource$special$$inlined$map$1 implements Flow<Interaction> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MappedInteractionSource f12300A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f12301z;

    public Object a(final FlowCollector flowCollector, Continuation continuation) {
        Flow flow = this.f12301z;
        final MappedInteractionSource mappedInteractionSource = this.f12300A;
        Object a2 = flow.a(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = (androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.D
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.D = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = new androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.C
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.D
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    kotlin.ResultKt.b(r7)
                    goto L_0x0097
                L_0x002a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0032:
                    kotlin.ResultKt.b(r7)
                    kotlinx.coroutines.flow.FlowCollector r7 = r4
                    androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                    if (r2 == 0) goto L_0x0051
                    androidx.compose.material3.internal.MappedInteractionSource r2 = r2
                    r4 = r6
                    androidx.compose.foundation.interaction.PressInteraction$Press r4 = (androidx.compose.foundation.interaction.PressInteraction.Press) r4
                    androidx.compose.foundation.interaction.PressInteraction$Press r2 = r2.f(r4)
                    androidx.compose.material3.internal.MappedInteractionSource r4 = r2
                    java.util.Map r4 = r4.f12298b
                    r4.put(r6, r2)
                    r6 = r2
                    goto L_0x008e
                L_0x0051:
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                    if (r2 == 0) goto L_0x0070
                    androidx.compose.material3.internal.MappedInteractionSource r2 = r2
                    java.util.Map r2 = r2.f12298b
                    androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r6
                    androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.a()
                    java.lang.Object r2 = r2.remove(r4)
                    androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                    if (r2 != 0) goto L_0x006a
                    goto L_0x008e
                L_0x006a:
                    androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                    r6.<init>(r2)
                    goto L_0x008e
                L_0x0070:
                    boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                    if (r2 == 0) goto L_0x008e
                    androidx.compose.material3.internal.MappedInteractionSource r2 = r2
                    java.util.Map r2 = r2.f12298b
                    androidx.compose.foundation.interaction.PressInteraction$Release r6 = (androidx.compose.foundation.interaction.PressInteraction.Release) r6
                    androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.a()
                    java.lang.Object r2 = r2.remove(r4)
                    androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                    if (r2 != 0) goto L_0x0089
                    goto L_0x008e
                L_0x0089:
                    androidx.compose.foundation.interaction.PressInteraction$Release r6 = new androidx.compose.foundation.interaction.PressInteraction$Release
                    r6.<init>(r2)
                L_0x008e:
                    r0.D = r3
                    java.lang.Object r6 = r7.c(r6, r0)
                    if (r6 != r1) goto L_0x0097
                    return r1
                L_0x0097:
                    kotlin.Unit r6 = kotlin.Unit.f40552a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
