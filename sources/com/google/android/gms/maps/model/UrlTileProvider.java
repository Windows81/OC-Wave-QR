package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public abstract class UrlTileProvider implements TileProvider {

    /* renamed from: b  reason: collision with root package name */
    public final int f26063b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26064c;

    /* JADX INFO: finally extract failed */
    public final Tile a(int i2, int i3, int i4) {
        URL b2 = b(i2, i3, i4);
        if (b2 == null) {
            return TileProvider.f26062a;
        }
        try {
            zzf.b(4352);
            int i5 = this.f26063b;
            int i6 = this.f26064c;
            InputStream inputStream = b2.openConnection().getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Preconditions.n(inputStream, "from must not be null.");
            Preconditions.n(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    Tile tile = new Tile(i5, i6, byteArrayOutputStream.toByteArray());
                    zzf.a();
                    return tile;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            zzf.a();
            return null;
        } catch (Throwable th) {
            zzf.a();
            throw th;
        }
    }

    public abstract URL b(int i2, int i3, int i4);
}
