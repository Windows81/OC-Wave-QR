package coil.decode;

import android.content.Context;
import coil.util.Utils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ImageSources$ImageSource$2 extends Lambda implements Function0<File> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f23383z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageSources$ImageSource$2(Context context) {
        super(0);
        this.f23383z = context;
    }

    /* renamed from: b */
    public final File invoke() {
        return Utils.n(this.f23383z);
    }
}
