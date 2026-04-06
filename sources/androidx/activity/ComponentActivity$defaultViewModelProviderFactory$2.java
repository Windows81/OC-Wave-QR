package androidx.activity;

import android.app.Application;
import androidx.lifecycle.SavedStateViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComponentActivity$defaultViewModelProviderFactory$2 extends Lambda implements Function0<SavedStateViewModelFactory> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f51z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComponentActivity$defaultViewModelProviderFactory$2(ComponentActivity componentActivity) {
        super(0);
        this.f51z = componentActivity;
    }

    /* renamed from: b */
    public final SavedStateViewModelFactory invoke() {
        Application application = this.f51z.getApplication();
        ComponentActivity componentActivity = this.f51z;
        return new SavedStateViewModelFactory(application, componentActivity, componentActivity.getIntent() != null ? this.f51z.getIntent().getExtras() : null);
    }
}
