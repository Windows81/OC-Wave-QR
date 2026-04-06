package coil.decode;

import android.graphics.BitmapFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BitmapFactoryDecoder$decode$2$1 extends Lambda implements Function0<DecodeResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BitmapFactoryDecoder f23357z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitmapFactoryDecoder$decode$2$1(BitmapFactoryDecoder bitmapFactoryDecoder) {
        super(0);
        this.f23357z = bitmapFactoryDecoder;
    }

    /* renamed from: b */
    public final DecodeResult invoke() {
        return this.f23357z.e(new BitmapFactory.Options());
    }
}
