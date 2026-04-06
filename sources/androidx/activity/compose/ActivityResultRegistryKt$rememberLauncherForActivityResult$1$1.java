package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ActivityResultRegistry f131A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f132B;
    public final /* synthetic */ ActivityResultContract C;
    public final /* synthetic */ State D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ActivityResultLauncherHolder f133z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1(ActivityResultLauncherHolder activityResultLauncherHolder, ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract, State state) {
        super(1);
        this.f133z = activityResultLauncherHolder;
        this.f131A = activityResultRegistry;
        this.f132B = str;
        this.C = activityResultContract;
        this.D = state;
    }

    public static final void e(State state, Object obj) {
        ((Function1) state.getValue()).invoke(obj);
    }

    /* renamed from: c */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f133z.b(this.f131A.l(this.f132B, this.C, new a(this.D)));
        return new ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1$invoke$$inlined$onDispose$1(this.f133z);
    }
}
